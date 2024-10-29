package com.example.onskeskyen.Service;

import com.example.onskeskyen.Model.UserModel;  // Skift til stor forbogstav
import com.example.onskeskyen.Repository.UserRepository;  // Skift til stor forbogstav
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {  // Skift til stor forbogstav

    @Autowired
    private UserRepository userRepository;  // Skift til stor forbogstav

    public void saveUser(UserModel user) {
        userRepository.save(user);
        if (userRepository.save(user) != null) {
            System.out.println(user.getUsername()+user.getPassword());
        }
        else {
            System.out.println("Fejl");
        }
    }
}
