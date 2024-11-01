package com.example.onskeskyen.Controller;

import com.example.onskeskyen.Model.UserModel;
import com.example.onskeskyen.Model.WishListModel;
import com.example.onskeskyen.Service.WishListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class WishListController {
    private WishListService wishListService;
    @Autowired
    public void setWishListService(WishListService wishListService) {
        this.wishListService = wishListService;
    }

    @GetMapping("/wishlist")
    public String showWishlist(@RequestParam("userId") long userId,  Model model) {
        List<WishListModel> wishlists = wishListService.getWishlistsByUserId(userId);
        model.addAttribute("wishlists", wishlists);  // Tilføj ønskelisterne til modellen
        model.addAttribute("userId", userId);  // Tilføj userId til modellen
        return "wishlistitems";  // Vis wishlist-siden
    }



}
