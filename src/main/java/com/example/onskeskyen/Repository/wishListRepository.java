package com.example.onskeskyen.Repository;

import org.springframework.beans.factory.annotation.Value;

import java.sql.*;

public class wishListRepository {
    @Value("${spring.datasource.url}")
    String databaseURLM;
    @Value("${spring.datasource.username}")
    String userName;
    @Value("${spring.datasource.password}")
    String password;

    public void getAll(){
        String sql = "select * from wishlists";
        try(Connection connection = DriverManager.getConnection(databaseURLM,userName,password)){
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }


}
