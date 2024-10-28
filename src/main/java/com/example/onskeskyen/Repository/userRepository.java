package com.example.onskeskyen.Repository;

import com.example.onskeskyen.Model.userModel;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.example.onskeskyen.Model.userModel;
@Repository
public class userRepository {
    @Value("AC25")
    private String databaseURL;
    @Value("jdbc:mysql://onskeskyen.mysql.database.azure.com:3306/onskeskyen")
    private String username;
    @Value("Konto2500!")
    private String password;

    public void createUser() {
        String createSQL = "insert into (Username, PasswordHash) values (?,?)";
        try (Connection connection = DriverManager.getConnection(databaseURL, username, password)) {
          PreparedStatement preparedStatement = connection.prepareStatement(createSQL);
          preparedStatement.setString(1,userModel.getUsername());
        }

    }
}
