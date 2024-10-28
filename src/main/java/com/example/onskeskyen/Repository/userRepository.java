package com.example.onskeskyen.Repository;

import com.example.onskeskyen.Model.userModel;

import java.util.ArrayList;
import java.util.List;

public class userRepository {
    private List<userModel> users = new ArrayList<userModel>();

    public List<userModel> getUsers() {
        return users;
    }
    public void addUsers(){
        users.add(new userModel(1, "Alice Jensen", 25, "Female", "alice@example.com", "password123"));
        users.add(new userModel(2, "Bob Hansen", 30, "Male", "bob@example.com", "password456"));
        users.add(new userModel(3, "Charlie Nielsen", 22, "Male", "charlie@example.com", "charlie789"));
        users.add(new userModel(4, "Diana Petersen", 27, "Female", "diana@example.com", "dianaPass"));
        users.add(new userModel(5, "Ethan Andersen", 35, "Male", "ethan@example.com", "ethan1234"));
        users.add(new userModel(6, "Fiona Kristensen", 29, "Female", "fiona@example.com", "fionaPass"));
        users.add(new userModel(7, "George Sørensen", 33, "Male", "george@example.com", "georgePass"));
        users.add(new userModel(8, "Hannah Lund", 24, "Female", "hannah@example.com", "hannah123"));
        users.add(new userModel(9, "Ivan Hansen", 28, "Male", "ivan@example.com", "ivanPassword"));
        users.add(new userModel(10, "Jasmine Olesen", 26, "Female", "jasmine@example.com", "jasmine123"));
    }

}
