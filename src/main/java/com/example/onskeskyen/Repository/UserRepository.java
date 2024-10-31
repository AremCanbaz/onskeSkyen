package com.example.onskeskyen.Repository;

import com.example.onskeskyen.Model.UserModel;  // Skift til stor forbogstav
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;



@Repository
public class UserRepository {
    @Value("${spring.datasource.url}")
    String databaseURLM;
    @Value("${spring.datasource.username}")
    String userName;
    @Value("${spring.datasource.password}")
    String dBpassword;


    public void addUser(UserModel user) {
        String useraddSQL = "INSERT INTO users(username, password, email) VALUES (?,?,?)";
        try(Connection connection = DriverManager.getConnection(databaseURLM,userName,dBpassword)){
            PreparedStatement preparedStatement = connection.prepareStatement(useraddSQL);
            preparedStatement.setString(1,user.getUsername());
            preparedStatement.setString(2,user.getPassword());
            preparedStatement.setString(3,user.getEmail());
            preparedStatement.executeUpdate();

        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public UserModel findUserByUsernameAndPassword(String username, String password) {
        String sql = "SELECT * FROM users WHERE username = ? AND password = ?";
        try (Connection connection = DriverManager.getConnection(databaseURLM, userName, dBpassword)) {  // dbPassword for at undgå konflikt
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                UserModel user = new UserModel();
                user.setId(resultSet.getLong("user_id"));
                user.setUsername(resultSet.getString("username"));
                user.setPassword(resultSet.getString("password"));
                user.setEmail(resultSet.getString("email"));
                return user;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;  // Returner null, hvis brugeren ikke findes
    }
}

