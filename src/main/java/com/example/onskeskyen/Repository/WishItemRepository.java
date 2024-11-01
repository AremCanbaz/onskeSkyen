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
    public void createWishlistItem(String itemName, String description, Double price, Long wishlistId, String link) {
        String sqlCreateItem = "INSERT INTO wishlistitems (item_name, description, price, wishlist_id, link) VALUES (?, ?, ?, ?, ?)";

        try (Connection connection = DriverManager.getConnection(databaseURLM, userName, password)) {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlCreateItem);
            preparedStatement.setString(1, itemName);
            preparedStatement.setString(2, description);
            preparedStatement.setDouble(3, price);
            preparedStatement.setLong(4, wishlistId);
            preparedStatement.setString(5, link);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Hent alle items til en ønskeliste
    public List<WishItemModel> findItemsByWishlistId(long wishlistId) {
        String sql = "SELECT * FROM wishlistitems WHERE wishlist_id = ?";
        List<WishItemModel> items = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(databaseURLM, userName, password)) {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, wishlistId);

            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                WishItemModel item = new WishItemModel();
                item.setItemId(resultSet.getLong("item_id"));
                item.setItemName(resultSet.getString("item_name"));
                item.setDescription(resultSet.getString("description"));
                item.setPrice((int) resultSet.getDouble("price"));
                item.setWishlistId(resultSet.getLong("wishlist_id"));
                item.setLink(resultSet.getString("link"));

                items.add(item);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return items;
    }

}