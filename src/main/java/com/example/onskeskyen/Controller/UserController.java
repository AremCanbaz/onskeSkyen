package com.example.onskeskyen.Controller;

import com.example.onskeskyen.Model.UserModel;  // Skift til stor forbogstav
import com.example.onskeskyen.Service.UserService;  // Skift til stor forbogstav
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;


@Controller
public class UserController {  // Skift til stor forbogstav

    @Autowired
    private UserService userService;  // Autowire UserService
    @GetMapping()
    public String showlogin() {
    return "login";
    }
    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

    @PostMapping("/loginSucces")
    public String processLoginForm(@RequestParam String username, @RequestParam String password, Model model) {
        UserModel user = userService.authenticateUser(username, password);
        if (user != null) {
            return "redirect:/wishlist?userId=" + user.getId();  // Omdirigér til forsiden med userId som URL-parameter
        }
        model.addAttribute("error", "Invalid username or password");  // Tilføj fejlmeddelelse til modellen
        return "login";  // Send brugeren tilbage til login-siden ved fejl
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
