package com.example.onskeskyen.Controller;

import com.example.onskeskyen.Model.UserModel;
import com.example.onskeskyen.Model.wishListModel;
import com.example.onskeskyen.Service.WishListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class wishListController {
    private WishListService wishListService;
    @Autowired
    public void setWishListService(WishListService wishListService) {
        this.wishListService = wishListService;
    }

    @GetMapping("/forside")
    public String showLoginForm(Model model) {
        List<wishListModel> wishList = wishListService.getAllWishLists();
        model.addAttribute("wishlist", wishList);

        return "forside";
    }


    @PostMapping("/login")
    public String processLoginForm(UserModel userModel) {
        return "";
    }
}
