package com.applestore.applestore.controller.client;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.UUID;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.applestore.applestore.domain.Cart;
import com.applestore.applestore.domain.CartItem;
import com.applestore.applestore.domain.Order;
import com.applestore.applestore.domain.OrderDetail;
import com.applestore.applestore.domain.Product;
import com.applestore.applestore.domain.User;
import com.applestore.applestore.domain.DTO.RegisterDTO;
import com.applestore.applestore.domain.DTO.ResetPassDTO;
import com.applestore.applestore.email.EmailService;
import com.applestore.applestore.repository.RoleRepository;
import com.applestore.applestore.service.ProductService;
import com.applestore.applestore.service.UploadService;
import com.applestore.applestore.service.UserService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class HomePageClient {
    private final PasswordEncoder passwordEncoder;
    private final ProductService productService;
    private final UserService userService;
    private final RoleRepository roleRepository;
    private final UploadService uploadService;
    private final EmailService emailService;

    public HomePageClient(ProductService productService, UserService userService, PasswordEncoder passwordEncoder,
            RoleRepository roleRepository, UploadService uploadService, EmailService emailService) {
        this.productService = productService;
        this.userService = userService;
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
        this.uploadService = uploadService;
        this.emailService = emailService;
    }

    @GetMapping("/")
    public String getMethodName(Model model) {
        List<Product> iphones = this.productService.handlePrintByTarget("iPhone");
        List<Product> macs = this.productService.handlePrintByTarget("Mac");
        List<Product> applewatchs = this.productService.handlePrintByTarget("Apple Watch");
        List<Product> airpods = this.productService.handlePrintByTarget("AirPods");
        model.addAttribute("iphones", iphones);
        model.addAttribute("macs", macs);
        model.addAttribute("applewatchs", applewatchs);
        model.addAttribute("airpods", airpods);
        return "client/homepage/show";
    }

    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("newRegisterDTO", new RegisterDTO());
        return "client/auth/login";
    }

    @GetMapping("/signup")
    public String signup(Model model) {
        model.addAttribute("newRegisterDTO", new RegisterDTO());
        return "client/auth/signup";
    }

    @PostMapping("/signup")
    public String signupRegister(Model model, @ModelAttribute("newRegisterDTO") @Valid RegisterDTO RegisterDTO,
            BindingResult bindingResult, HttpServletRequest request) {
        if (bindingResult.hasErrors())
            return "client/auth/signup";
        User user = new User();
        this.userService.mapperUser(user, RegisterDTO);
        user.setEnable(false);
        user.setToken(UUID.randomUUID().toString());
        user.setPassword(this.passwordEncoder.encode(user.getPassword()));
        user.setRole(this.roleRepository.findByName("User"));
        user.setTimesendtoken(Calendar.getInstance().getTimeInMillis());
        String url = request.getRequestURL().toString();
        String contextPath = request.getRequestURI();
        String baseURL = url.replace(contextPath, "");
        String html = "<!doctype html>\n" +
                "<html lang=\"en\" xmlns=\"http://www.w3.org/1999/xhtml\"\n" +
                "      xmlns:th=\"http://www.thymeleaf.org\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta name=\"viewport\"\n" +
                "          content=\"width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0\">\n"
                +
                "    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n" +
                "    <title>Email</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<h3><b>" + user.getFirstName() + " " + user.getLastName() + " 様</b></h3>\n" +
                "<p>ご登録いただき、ありがとうございます。</p>" +
                "<div>" + " " + "※" + "  " + "認証する為、下のリンクをクリックしてください。</div>" +
                "<div>" + " " + "※" + "  " + "有効期限は６０分です。</div>" +
                "<div>" + " " + "※" + "  " + "有効期限が過ぎたら、無効となります。</div>" +
                "<p>" + baseURL + "/regitrationConfirm?token=" + user.getToken() + "</p>" +
                "<p>このメールに返信されましても、お答えする事は出来ませんのでご了承願います。</p>" +
                "<p>-----------------------------------</p>" +
                "<div>(C)Apple Store - WBC</div>\n" +
                "</body>\n" +
                "</html>\n";
        this.emailService.sendEmail(user.getEmail(), "【メール認証の連絡】",
                html);
        model.addAttribute("email", RegisterDTO.getEmail());
        this.userService.handleSaveUser(user);
        return "client/auth/sendRegistrationSuccess";
    }

    @GetMapping("/regitrationConfirm")
    public String confirmRegistration(Model model, @RequestParam("token") String token) {
        User user = this.userService.handleFindUserByToken(token);
        long confirmTime = 3600000;
        if (user == null)
            return "redirect:/404-not-found";
        if (user.getToken().equals(token)
                && Calendar.getInstance().getTimeInMillis() - user.getTimesendtoken() <= confirmTime) {
            user.setEnable(true);
            user.setToken("");
            this.userService.handleSaveUser(user);
            return "client/auth/verifySuccess";
        } else {
            return "redirect:/404-not-found";
        }
    }

    @GetMapping("/resetPassword")
    public String resetPassword(Model model, @RequestParam("token") String token) {
        User user = this.userService.handleFindUserByToken(token);
        long confirmTime = 3600000;
        if (user == null)
            return "redirect:/404-not-found";
        if (user.getToken().equals(token)
                && Calendar.getInstance().getTimeInMillis() - user.getTimesendtoken() <= confirmTime) {
            model.addAttribute("token", token);
            model.addAttribute("newResetPassDTO", new ResetPassDTO());
            return "client/auth/resetpassword";
        } else {
            return "redirect:/404-not-found";
        }
    }

    @PostMapping("/resetPassword")
    public String resetPasswordConfirm(Model model, @RequestParam("token") String token,
            @ModelAttribute("newResetPassDTO") @Valid ResetPassDTO resetPassDTO, BindingResult bindingResult) {
        if (bindingResult.hasErrors())
            return "client/auth/resetpassword";
        User user = this.userService.handleFindUserByToken(token);
        user.setPassword(this.passwordEncoder.encode(resetPassDTO.getPassword()));
        user.setToken("");
        this.userService.handleSaveUser(user);
        return "client/auth/verifySuccess";
    }

    @GetMapping("/success")
    public String ConfirmSuccess(Model model) {
        return "client/auth/confirmSuccess";
    }

    @GetMapping("/404-not-found")
    public String notFoundPage(Model model) {
        return "client/auth/error404";
    }

    @GetMapping("/contact")
    public String getContactPage(Model model) {
        return "client/homepage/contact";
    }

    @GetMapping("/cart")
    public String getCartPage(Model model, HttpServletRequest request) {
        HttpSession session = request.getSession(false);
        String email = (String) session.getAttribute("email");
        User user = this.userService.handleFindByEmail(email);
        Cart cart = this.productService.handleFindCartByUser(user);
        List<CartItem> cartItems = cart == null ? new ArrayList<CartItem>() : cart.getCartItems();
        long totalPrice = 0;
        for (CartItem cartItem : cartItems) {
            totalPrice += cartItem.getQuantity() * cartItem.getProduct().getPrice();
        }
        model.addAttribute("cart", cart);
        model.addAttribute("cartItems", cartItems);
        model.addAttribute("totalPrice", totalPrice);
        return "client/product/cart";
    }

    @PostMapping("/confirm-checkout")
    public String getConfirmCheckoutPage(Model model, HttpServletRequest request, @ModelAttribute("cart") Cart cart) {
        HttpSession session = request.getSession(false);
        String email = (String) session.getAttribute("email");
        User user = this.userService.handleFindByEmail(email);
        model.addAttribute("user", user);
        List<CartItem> items = cart.getCartItems();
        this.productService.handleUpdateCartQuantity(items);
        List<CartItem> cartItems = this.productService
                .handleFindListItemByCart(this.productService.handleFindCartByUser(user));
        model.addAttribute("cartItems", cartItems);
        long totalPrice = 0;
        for (CartItem cartItem : cartItems) {
            totalPrice += cartItem.getQuantity() * cartItem.getProduct().getPrice();
        }
        model.addAttribute("totalPrice", totalPrice);
        return "client/product/confirm-checkout";
    }

    @PostMapping("/place-order")
    public String getPlaceOrderPage(Model model, @RequestParam("name") String name, @RequestParam("phone") String phone,
            @RequestParam("address") String address, HttpServletRequest request) {
        HttpSession session = request.getSession(false);
        String email = (String) session.getAttribute("email");
        User user = this.userService.handleFindByEmail(email);
        this.productService.handlePlaceOrder(session, user, name, phone, address);
        return "redirect:/thank";
    }

    @GetMapping("/thank")
    public String getThankPage(Model model) {
        return "client/product/thanks";
    }

    @PostMapping("/order-history")
    public String getOrderHistoryPage(Model model, HttpServletRequest request) {
        HttpSession session = request.getSession(false);
        String email = (String) session.getAttribute("email");
        User user = this.userService.handleFindByEmail(email);
        List<Order> orderList = this.productService.handleFindAllCartByUser(user);
        model.addAttribute("orderList", orderList);
        return "client/product/orderhistory";
    }

    @GetMapping("/order-detail/{id}")
    public String getMethodName(Model model, @PathVariable("id") long id) {
        Order order = this.productService.handleFindOrderById(id);
        List<OrderDetail> orderDetail = this.productService.handleFindAllOrderDetailByOrder(order);
        model.addAttribute("orderDetail", orderDetail);
        model.addAttribute("order", order);
        return "client/product/orderdetail";
    }

    @GetMapping("/profile")
    public String profilePage(Model model, HttpServletRequest request) {
        HttpSession session = request.getSession(false);
        String email = (String) session.getAttribute("email");
        User user = this.userService.handleFindByEmail(email);
        model.addAttribute("user", user);
        return "client/homepage/profile";
    }

    @GetMapping("/edit-profile")
    public String getEditProfilePage(Model model, HttpServletRequest request) {
        HttpSession session = request.getSession(false);
        String email = (String) session.getAttribute("email");
        User user = this.userService.handleFindByEmail(email);
        model.addAttribute("user", user);
        return "client/homepage/edit-profile";
    }

    @PostMapping("/edit")
    public String postEditProfilePage(Model model, @RequestParam("firstName") String firstName,
            @RequestParam("lastName") String lastName, @RequestParam("phone") String phone,
            @RequestParam("address") String address, @RequestParam("file") MultipartFile file,
            HttpServletRequest request) {
        HttpSession session = request.getSession(false);
        String email = (String) session.getAttribute("email");
        String avt = (file.getSize() != 0) ? this.uploadService.handleUploadFile(file, "avatar") : null;
        this.userService.handleSaveUserBeforeEditProfile(session, email, firstName, lastName, phone, address, avt);
        return "redirect:/profile";
    }

}
