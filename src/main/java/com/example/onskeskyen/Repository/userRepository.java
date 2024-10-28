package com.example.onskeskyen.Repository;

import com.example.onskeskyen.Model.userModel;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.sql.*;
@Repository
public class userRepository {
    @Value("AC25")
    private String databaseURL;
    @Value("jdbc:mysql://onskeskyen.mysql.database.azure.com:3306/onskeskyen")
    private String username;
    @Value("Konto2500!")
    private String password;

    userModel userModel;

    public void createUser() {
        String createSQL = "insert into (Username, PasswordHash) values (?,?)";
        try (Connection connection = DriverManager.getConnection(databaseURL, username, password)) {
          PreparedStatement preparedStatement = connection.prepareStatement(createSQL);
          preparedStatement.setString(1,userModel.getUsername());
          preparedStatement.setString(2,userModel.getPassword());
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
