package com.example.onskeskyen.Model;

public class userModel {
    private int userid;
    private String name;
    private int age;
    private String gender;

    private String email;
    private String password;

    public userModel(int id, String name, int age, String gender, String email, String password) {
        this.userid = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.password = password;
    }
    public int getId() {
        return userid;
    }
    public void setId(int id) {
        this.userid = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
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
}
