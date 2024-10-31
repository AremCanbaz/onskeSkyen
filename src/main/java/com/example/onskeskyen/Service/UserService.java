package com.example.onskeskyen.Service;

import com.example.onskeskyen.Model.UserModel;  // Skift til stor forbogstav// Skift til stor forbogstav
import com.example.onskeskyen.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void saveUser(UserModel user) {
        userRepository.addUser(user);
    }
    public UserModel authenticateUser(String username, String password) {
        return userRepository.findUserByUsernameAndPassword(username, password);
    }
}
