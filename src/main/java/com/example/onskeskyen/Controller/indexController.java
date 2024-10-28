package com.example.onskeskyen.Controller;

import com.example.onskeskyen.Model.userModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class indexController {

    @GetMapping("/{id}/index")
    public String showLoginForm(Model model) {
        return "login";
    }

    @PostMapping("/login")
    public String processLoginForm(userModel userModel) {
        return "";
    }
}
