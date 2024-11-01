package com.example.onskeskyen.Controller;

import com.example.onskeskyen.Model.WishItemModel;
import com.example.onskeskyen.Model.WishListModel;
import com.example.onskeskyen.Service.WishListItemsService;
import com.example.onskeskyen.Service.WishListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class WishController {
    private WishListItemsService wishListItemsService;
    @Autowired
    public void setWishItemsService(WishListItemsService wishListItemsService) {
        this.wishListItemsService = wishListItemsService;
    }
    @GetMapping("/wishlistitems")
    public String showWishlist(@RequestParam("listID") int listID, Model model) {
        List<WishItemModel> wishlists = wishListItemsService.getWishItemsbyListID(listID);
        model.addAttribute("wishListItems", wishlists);  // Update to match Thymeleaf template
        model.addAttribute("userId", listID);  // Adding userId to model if needed
        return "wishlistItems";  // Returns the "wishlist" view
    }

}
