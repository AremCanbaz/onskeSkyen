package com.example.onskeskyen.Model;

import java.util.List;

public class wishListModel {
    private String wishlistName;
    private int wishlistId;
    private wishItemModel wishItemModel;
    private List<wishItemModel> wishItemModelList;

    public wishListModel(String wishlistName, int wishlistId ,List<wishItemModel> wishItemModelList) {
        this.wishlistName = wishlistName;
        this.wishlistId = wishlistId;
        this.wishItemModelList = wishItemModelList;
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
    public wishItemModel getWishItemModel() {
        return wishItemModel;
    }
    public void setWishItemModel(wishItemModel wishItemModel) {
        this.wishItemModel = wishItemModel;
    }
    public List<wishItemModel> getWishItemModelList() {
        return wishItemModelList;
    }
    public void setWishItemModelList(List<wishItemModel> wishItemModelList) {
        this.wishItemModelList = wishItemModelList;
    }
}
