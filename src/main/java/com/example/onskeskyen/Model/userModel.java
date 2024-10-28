package com.example.onskeskyen.Model;

import java.time.LocalDate;

public class userModel {
    private int userid;
    private String username;
    private String email;
    private String password;
    private LocalDate createdAt;

    public userModel(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public userModel(int id, String username, String email, String password, LocalDate createdAt) {
        this.userid = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.createdAt = createdAt;
    }
    public int getId() {
        return userid;
    }
    public void setId(int id) {
        this.userid = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public LocalDate getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }
}
