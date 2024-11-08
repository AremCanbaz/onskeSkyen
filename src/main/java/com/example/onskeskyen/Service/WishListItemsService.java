package com.example.onskeskyen.Service;

import com.example.onskeskyen.Model.WishItemModel;
import com.example.onskeskyen.Repository.WishItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class WishListItemsService {
    private final WishItemRepository wishItemRepository;

    @Autowired
    public WishListItemsService(WishItemRepository wishItemRepository) {
        this.wishItemRepository = wishItemRepository;
    }


    public List<WishItemModel> getWishItemsbyListID(int listID) {
        return wishItemRepository.findWishItemsByWishlistId(listID);
    }

    public void createWishlistItem(String name, String description, double price, int listID, String link) {
        wishItemRepository.createWishlistItem(name, description, price, (long) listID, link);
    }

    public void deleteWishItem(long wishitemID) {
        wishItemRepository.deleteWishItemById(wishitemID);
    }


}
