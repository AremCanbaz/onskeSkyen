package com.example.onskeskyen.Service;
import com.example.onskeskyen.Repository.userRepository;


public class userService {

    userRepository userRepository;

    public userService(userRepository userRepository) {
        this.userRepository = userRepository;
    }
}
