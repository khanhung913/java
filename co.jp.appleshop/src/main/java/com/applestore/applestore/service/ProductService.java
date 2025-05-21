package com.applestore.applestore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.applestore.applestore.domain.Cart;
import com.applestore.applestore.domain.CartItem;
import com.applestore.applestore.domain.Order;
import com.applestore.applestore.domain.OrderDetail;
import com.applestore.applestore.domain.Product;
import com.applestore.applestore.domain.User;
import com.applestore.applestore.repository.CartItemRepository;
import com.applestore.applestore.repository.CartRepository;
import com.applestore.applestore.repository.OrderDetailRepository;
import com.applestore.applestore.repository.OrderRepository;
import com.applestore.applestore.repository.ProductRepository;

import jakarta.servlet.http.HttpSession;

@Service
public class ProductService {
	private final ProductRepository ProductRepository;
	private final CartRepository cartRepository;
	private final CartItemRepository cartItemRepository;
	private final UserService userService;
	private final OrderRepository orderRepository;
	private final OrderDetailRepository orderDetailRepository;

	public ProductService(ProductRepository ProductRepository, CartRepository cartRepository,
			CartItemRepository cartItemRepository, UserService userService, OrderRepository orderRepository,
			OrderDetailRepository orderDetailRepository) {
		this.ProductRepository = ProductRepository;
		this.cartItemRepository = cartItemRepository;
		this.cartRepository = cartRepository;
		this.userService = userService;
		this.orderRepository = orderRepository;
		this.orderDetailRepository = orderDetailRepository;
	}

	public void handleRemoveProductById(long id) {
		Product product = this.handleFindById(id);
		List<OrderDetail> detailList = this.orderDetailRepository.findByProduct(product);
		for (OrderDetail orderDetail : detailList) {
			this.orderDetailRepository.deleteById(orderDetail.getId());
		}
		this.ProductRepository.deleteById(id);
	}

	public void handleSaveProduct(Product product) {
		this.ProductRepository.save(product);
	}

	public List<Product> handlePrintAllProducts() {
		return this.ProductRepository.findAll();
	}

	public Product handleFindById(long id) {
		return this.ProductRepository.findById(id);
	}

	public List<Product> handlePrintByTarget(String target) {
		return this.ProductRepository.findByTarget(target);
	}

	public List<Product> handleSearchProductByName(String searchText) {
		return this.ProductRepository.findByNameContainingIgnoreCase(searchText);
	}

	public void handleAddItemToCart(String email, long productId, HttpSession session, long quantity) {
		User user = this.userService.handleFindByEmail(email);
		if (user != null) {
			Cart cart = this.cartRepository.findByUser(user);
			if (cart == null) {
				Cart newCart = new Cart();
				newCart.setUser(user);
				newCart.setSum(0);
				this.cartRepository.save(newCart);
			}
			Product product = this.ProductRepository.findById(productId);
			CartItem item = this.cartItemRepository.findByCartAndProduct(cart, product);
			cart = this.cartRepository.findByUser(user);
			if (item == null) {
				CartItem cartItem = new CartItem();
				cartItem.setCart(cart);
				cartItem.setProduct(product);
				cartItem.setQuantity(quantity);
				this.cartItemRepository.save(cartItem);
				cart.setSum(cart.getSum() + 1);
				this.cartRepository.save(cart);
				session.setAttribute("sum", cart.getSum());

			} else {
				item.setQuantity(item.getQuantity() + quantity);
				this.cartItemRepository.save(item);
			}
		}
	}

	public Cart handleFindCartByUser(User user) {
		return this.cartRepository.findByUser(user);
	}

	public Cart handleFindCartById(long id) {
		return this.cartRepository.findById(id);
	}

	public List<CartItem> handleFindListItemByCart(Cart cart) {
		return this.cartItemRepository.findByCart(cart);
	}

	public void handleDeleteItem(long id, Cart cart, HttpSession session) {
		List<CartItem> items = this.cartItemRepository.findByCart(cart);
		if (items.size() > 1) {
			this.cartItemRepository.deleteById(id);
			long sum = cart.getSum() - 1;
			cart.setSum(sum);
			session.setAttribute("sum", sum);
			this.cartRepository.save(cart);
		} else {
			this.cartItemRepository.deleteById(id);
			this.cartRepository.deleteById(cart.getId());
			session.setAttribute("sum", 0);
		}
	}

	public void handleUpdateCartQuantity(List<CartItem> items) {

		for (CartItem item : items) {
			Optional<CartItem> cartItem = this.cartItemRepository.findById(item.getId());
			if (cartItem.isPresent()) {
				CartItem newCartItem = cartItem.get();
				newCartItem.setQuantity(item.getQuantity());
				this.cartItemRepository.save(newCartItem);
			}
		}
	}

	public void handlePlaceOrder(HttpSession session, User user, String name, String phone, String address) {
		Cart cart = this.cartRepository.findByUser(user);
		List<CartItem> cartItems = this.cartItemRepository.findByCart(cart);
		long totalPrice = 0;
		for (CartItem cartItem : cartItems) {
			totalPrice += (cartItem.getQuantity() * cartItem.getProduct().getPrice());
		}
		Order order = new Order();
		order.setReceiver_address(address);
		order.setReceiver_name(name);
		order.setReceiver_phone(phone);
		order.setTotalPrice(totalPrice);
		order.setUsers(user);
		order.setStatus("確認中");
		order = this.orderRepository.save(order);
		for (CartItem cartItem : cartItems) {
			OrderDetail orderDetail = new OrderDetail();
			orderDetail.setOrder(order);
			orderDetail.setOrderQuantity(cartItem.getQuantity());
			orderDetail.setPrice(cartItem.getProduct().getPrice());
			orderDetail.setProduct(cartItem.getProduct());
			this.orderDetailRepository.save(orderDetail);
			this.cartItemRepository.deleteById(cartItem.getId());
		}
		this.cartRepository.delete(cart);
		session.setAttribute("sum", 0);
	}

	public List<Order> handlePrintAllOrder() {
		return this.orderRepository.findAll();
	}

	public List<Order> handleFindAllCartByUser(User user) {
		return this.orderRepository.findByUsers(user);
	}

	public Order handleFindOrderById(long id) {
		return this.orderRepository.findById(id);
	}

	public List<OrderDetail> handleFindAllOrderDetailByOrder(Order order) {
		return this.orderDetailRepository.findByOrder(order);
	}

	public void handleSaveOrderBeforeCancel(Order order) {
		Order newOrder = new Order();
		newOrder.setId(order.getId());
		newOrder.setTotalPrice(order.getTotalPrice());
		newOrder.setUsers(order.getUsers());
		newOrder.setReceiver_name(order.getReceiver_name());
		newOrder.setReceiver_address(order.getReceiver_address());
		newOrder.setReceiver_phone(order.getReceiver_phone());
		newOrder.setStatus("キャンセル");
		this.orderRepository.save(newOrder);
	}

	public void handleChangeQuantity(long productId, long quantity) {
		Optional<CartItem> cartItem = this.cartItemRepository.findById(productId);
		if (cartItem.isPresent()) {
			CartItem newCartItem = cartItem.get();
			newCartItem.setQuantity(quantity);
			this.cartItemRepository.save(newCartItem);
		}

	}
}
