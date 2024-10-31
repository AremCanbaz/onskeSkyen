package com.example.onskeskyen.Model;

import java.util.Date;
import java.util.List;

public class WishListModel {
    private String wishlistName;
    private int wishlistId;
    private WishItemModel wishItemModel;
    private Date wishlistDate;
    private List<WishItemModel> wishItemModelList;

    public WishListModel(String wishlistName, Date wishlistDate) {
        this.wishlistName = wishlistName;
        this.wishlistDate = wishlistDate;
    }

    public WishListModel(String wishlistName, int wishlistId , List<WishItemModel> wishItemModelList) {
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
    public Date getWishlistDate() {
        return wishlistDate;
    }
    public void setWishlistDate(Date wishlistDate) {
        this.wishlistDate = wishlistDate;
    }
}
