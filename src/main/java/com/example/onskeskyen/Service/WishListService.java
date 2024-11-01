package com.example.onskeskyen.Service;

import com.example.onskeskyen.Model.WishItemModel;
import com.example.onskeskyen.Model.WishListModel;
import com.example.onskeskyen.Repository.WishItemRepository;
import com.example.onskeskyen.Repository.WishListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class WishListService {

    private final WishListRepository wishListRepository;
    private final WishItemRepository wishItemRepository;

    @Autowired
    public WishListService(WishListRepository wishListRepository, WishItemRepository wishItemRepository) {
        this.wishListRepository = wishListRepository;
        this.wishItemRepository = wishItemRepository;
    }


    public List<WishListModel> getWishlistsByUserId(long userId) {
        return wishListRepository.findWishlistsByUserId(userId);
    }
    public void deleteWishlist(long wishlist_Id) {
        wishListRepository.deleteWishlistsBywishlistId(wishlist_Id);
    }

    public void createWishlist(String wishlistName, long userId) {
        wishListRepository.createWishlist(wishlistName, userId);
    }


}
