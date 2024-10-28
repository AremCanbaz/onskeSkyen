package com.example.onskeskyen.Model;

public class wishItemModel {
    String name;
    String description;
    int wishitemID;
    int price;
    int quantity;
    String link;
    public wishItemModel(String name, String description, int wishitemID, int price, int quantity) {
        this.name = name;
        this.description = description;
        this.wishitemID = wishitemID;
        this.price = price;
        this.quantity = quantity;
    }
    public wishItemModel(String name, String description, int wishitemID, int price, int quantity, String link) {
        this.name = name;
        this.description = description;
        this.wishitemID = wishitemID;
        this.price = price;
        this.quantity = quantity;
        this.link = link;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public int getWishitemID() {
        return wishitemID;
    }
    public void setWishitemID(int wishitemID) {
        this.wishitemID = wishitemID;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public String getLink() {
        return link;
    }
}
