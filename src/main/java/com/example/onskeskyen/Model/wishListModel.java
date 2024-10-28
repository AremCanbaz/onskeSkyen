package com.example.onskeskyen.Model;

public class wishListModel {
    private String wishlistName;
    private int wishlistId;
    public wishListModel(String wishlistName, int wishlistId) {
        this.wishlistName = wishlistName;
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
}
