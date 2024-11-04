package com.example.onskeskyen.Controller;

import com.example.onskeskyen.Model.WishItemModel;
import com.example.onskeskyen.Model.WishListModel;
import com.example.onskeskyen.Service.WishListItemsService;
import com.example.onskeskyen.Service.WishListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
    public String showWishlistItems(@RequestParam("listID") int listID, Model model) {
        List<WishItemModel> wishItems = wishListItemsService.getWishItemsbyListID(listID);
        model.addAttribute("wishListItems", wishItems);
        model.addAttribute("listID", listID);
        return "wishlistItems";
    }

    @GetMapping("/createWishlistItem")
    public String showCreateWishlistItemPage(@RequestParam("listID") int listID, Model model) {
        model.addAttribute("listID", listID);
        return "createWishlistItem";
    }

    @PostMapping("/addWishlistItem")
    public String addWishlistItem(@RequestParam("listID") int listID,
                                  @RequestParam("name") String name,
                                  @RequestParam("description") String description,
                                  @RequestParam("price") double price,
                                  @RequestParam(value = "link", required = false) String link) {
        wishListItemsService.createWishlistItem(name, description, price, listID, link);
        return "redirect:/wishlistitems?listID=" + listID;
    }

}
