package com.example.onskeskyen.Repository;

import com.example.onskeskyen.Model.UserModel;  // Skift til stor forbogstav
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



@Repository
public class UserRepository {
    @Value("${spring.datasource.url}")
    String databaseURLM;
    @Value("${spring.datasource.username}")
    String userName;
    @Value("${spring.datasource.password}")
    String password;


    public void addUser(UserModel user) {
        String useraddSQL = "INSERT INTO users(username, password, email) VALUES (?,?,?)";
        try(Connection connection = DriverManager.getConnection(databaseURLM,userName,password)){
            PreparedStatement preparedStatement = connection.prepareStatement(useraddSQL);
            preparedStatement.setString(1,user.getUsername());
            preparedStatement.setString(2,user.getPassword());
            preparedStatement.setString(3,user.getEmail());
            preparedStatement.executeUpdate();

        }catch (SQLException e){
            e.printStackTrace();
        }
    }

}
