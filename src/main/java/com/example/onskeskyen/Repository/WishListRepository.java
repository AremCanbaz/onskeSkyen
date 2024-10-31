package com.example.onskeskyen.Repository;

import com.example.onskeskyen.Model.wishListModel;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
public class WishListRepository {
    @Value("${spring.datasource.url}")
    String databaseURLM;
    @Value("${spring.datasource.username}")
    String userName;
    @Value("${spring.datasource.password}")
    String password;

    public List<wishListModel> getAllWishList() {
        String sql = "SELECT wishlist_name, created_at FROM wishlists";
        List<wishListModel> wishListModelArrayList = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(databaseURLM, userName, password)) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                String name = resultSet.getString("wishlist_name");
                Date date = resultSet.getDate("created_at");

                // Opretter en ny wishListModel med name og date
                wishListModel wishList = new wishListModel(name, date);
                wishListModelArrayList.add(wishList);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return wishListModelArrayList;  // Returnerer listen, selvom den er tom i tilfælde af fejl
    }



}
