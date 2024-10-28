package com.example.onskeskyen.Controller;
import com.example.onskeskyen.Model.userModel;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class userController {

    @GetMapping("/login")
    public String showLoginForm(Model model) {
        return "login";
    }

    @PostMapping("/login")
    public String processLoginForm(userModel userModel) {
        return "";
    }

    @GetMapping("/createusersite")
    public String showCreateUserForm(Model model) {
        return "createuser";
    }
    @PostMapping("createUser")
    public String processCreateUserForm(@RequestParam("username") String username,
                                        @RequestParam("password") String password,
                                        @RequestParam("email") String email){
        userModel userModel = new userModel(username, password, email);
        return "redirect:/login";
    }
}
