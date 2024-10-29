package com.example.onskeskyen.Controller;

import com.example.onskeskyen.Model.UserModel;  // Skift til stor forbogstav
import com.example.onskeskyen.Service.UserService;  // Skift til stor forbogstav
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {  // Skift til stor forbogstav

    @Autowired
    private UserService userService;  // Autowire UserService

    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

    @PostMapping("/loginSucc")
    public String processLoginForm(UserModel userModel) {
        return ""; // Implementer login-logik her
    }

    @GetMapping("/createusersite")
    public String showCreateUserForm() {
        return "createUser";
    }

    @PostMapping("/createUser")
    public String processCreateUserForm(@RequestParam("username") String username,
                                        @RequestParam("password") String password,
                                        @RequestParam("email") String email) {
        UserModel userModel = new UserModel(username, email, password);
        userService.saveUser(userModel); // Kald saveUser gennem userService-instansen
        return "redirect:/login";
    }
}
