package com.example.onskeskyen.Repository;

import com.example.onskeskyen.Model.WishItemModel;
import com.example.onskeskyen.Model.WishListModel;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
@Repository
public class WishItemRepository {
    @Value("${spring.datasource.url}")
    String databaseURLM;
    @Value("${spring.datasource.username}")
    String userName;
    @Value("${spring.datasource.password}")
    String password;

    public List<WishItemModel> findWishItemsByWishlistId(int wishlistId) {
        String sql = "SELECT * FROM wishlistitems WHERE wishlist_id = ?";
        List<WishItemModel> wishitemsList = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(databaseURLM, userName, password)) {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, wishlistId);

            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                WishItemModel wishItemList = new WishItemModel();
                wishItemList.setWishitemID(resultSet.getInt("wishitem_ID"));
                wishItemList.setName(resultSet.getString("wishitem_name"));
                wishItemList.setDescription(resultSet.getString("wishlistitem_desc"));
                wishItemList.setPrice(resultSet.getInt("wishitem_price"));
                wishItemList.setLink(resultSet.getString("wish_item_link"));
                wishitemsList.add(wishItemList);
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return wishitemsList;

    }
}