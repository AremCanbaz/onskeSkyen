package com.example.onskeskyen.Repository;

import com.example.onskeskyen.Model.WishListModel;
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

    public List<WishListModel> findWishlistsByUserId(long userId) {
        String sql = "SELECT * FROM wishlists WHERE user_id = ?";
        List<WishListModel> wishlists = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(databaseURLM, userName, password)) {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, userId);

            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                WishListModel wishlist = new WishListModel();
                wishlist.setWishlistId(resultSet.getInt("wishlist_id")); // eller "wishlist_id" afhængigt af kolonnenavnet
                wishlist.setWishlistName(resultSet.getString("wishlist_name"));

                // Tjek for null før konvertering
                java.sql.Date sqlDate = resultSet.getDate("created_at");
                if (sqlDate != null) {
                    wishlist.setWishlistDate(sqlDate.toLocalDate());
                } else {
                    wishlist.setWishlistDate(null); // Eller håndter som ønsket
                }

                wishlist.setUserId(resultSet.getInt("user_id"));
                wishlists.add(wishlist);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return wishlists;
    }



}
