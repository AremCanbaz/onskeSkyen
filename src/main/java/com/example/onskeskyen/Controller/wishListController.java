package com.example.onskeskyen.Controller;

import com.example.onskeskyen.Model.UserModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class wishListController {

    @GetMapping("/{id}/index")
    public String showLoginForm(Model model) {
        return "login";
    }

    @PostMapping("/login")
    public String processLoginForm(UserModel userModel) {
        return "";
    }
}
