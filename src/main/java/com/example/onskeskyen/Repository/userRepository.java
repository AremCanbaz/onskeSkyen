package com.example.onskeskyen.Repository;

import com.example.onskeskyen.Model.userModel;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class userRepository {
        @Value("AC25")
        private String databaseURL;
        @Value("jdbc:mysql://onskeskyen.mysql.database.azure.com:3306/onskeskyen")
        private String username;
        @Value("Konto2500!")
        private String password;

       public void createUser(){
               String createSQL = "insert into (Username, PasswordHash) values (?,?)";

       }

}
