package com.example.onskeskyen.Repository;

import com.example.onskeskyen.Model.userModel;

import java.util.ArrayList;
import java.util.List;

public class userRepository {
    private List<userModel> users = new ArrayList<userModel>();

    public List<userModel> getUsers() {
        return users;
    }

}
