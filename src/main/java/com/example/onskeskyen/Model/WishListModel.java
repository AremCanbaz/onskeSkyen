package com.example.onskeskyen.Model;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class WishListModel {
    private String wishlistName;
    private int wishlistId;
    private WishItemModel wishItemModel;
    private LocalDate wishlistDate;
    private List<WishItemModel> wishItemModelList;
    private int userId;

    public WishListModel(String wishlistName, LocalDate wishlistDate) {
        this.wishlistName = wishlistName;
        this.wishlistDate = wishlistDate;
    }

    public WishListModel(String wishlistName, int wishlistId , List<WishItemModel> wishItemModelList, LocalDate wishlistDate, int userId) {
        this.wishlistName = wishlistName;
        this.wishlistId = wishlistId;
        this.wishItemModelList = wishItemModelList;
        this.wishlistDate = wishlistDate;
        this.userId = userId;
    }

    public WishListModel() {

    }

    public String getWishlistName() {
        return wishlistName;
    }
    public void setWishlistName(String wishlistName) {
        this.wishlistName = wishlistName;
    }
    public int getWishlistId() {
        return wishlistId;
    }
    public void setWishlistId(int wishlistId) {
        this.wishlistId = wishlistId;
    }
    public WishItemModel getWishItemModel() {
        return wishItemModel;
    }
    public void setWishItemModel(WishItemModel wishItemModel) {
        this.wishItemModel = wishItemModel;
    }
    public List<WishItemModel> getWishItemModelList() {
        return wishItemModelList;
    }
    public void setWishItemModelList(List<WishItemModel> wishItemModelList) {
        this.wishItemModelList = wishItemModelList;
    }
    public LocalDate getWishlistDate() {
        return wishlistDate;
    }
    public void setWishlistDate(LocalDate wishlistDate) {
        this.wishlistDate = wishlistDate;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
