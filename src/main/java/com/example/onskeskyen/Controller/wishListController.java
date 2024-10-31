package com.example.onskeskyen.Controller;

import com.example.onskeskyen.Model.UserModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class wishListController {

    @GetMapping("/forside")
    public String showLoginForm(Model model) {
        model.addAttribute("wishlist", "")

        return "forside";
    }


    @PostMapping("/login")
    public String processLoginForm(UserModel userModel) {
        return "";
    }
}
