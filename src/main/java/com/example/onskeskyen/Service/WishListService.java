package com.example.onskeskyen.Service;

import com.example.onskeskyen.Model.wishListModel;
import com.example.onskeskyen.Repository.WishListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class WishListService {

    private final WishListRepository wishListRepository;

    @Autowired
    public WishListService(WishListRepository wishListRepository) {
        this.wishListRepository = wishListRepository;
    }

    public List<wishListModel> getAllWishLists() {
        return wishListRepository.getAllWishList();
    }
}
