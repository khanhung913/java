package com.applestore.applestore.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashBoardController {
    @GetMapping("/admin")
    public String getDashBoardPage() {
        return "admin/dashboard/view";
    }

}
