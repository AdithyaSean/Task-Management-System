package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserModel {
    protected static String userName;
    protected static String userPassword;
    protected static String userType;

    public static String getUserName() {
        return userName;
    }

    public static void setUserName(String userName) {
        UserModel.userName = userName;
    }

    public static String getUserPassword() {
        return userPassword;
    }

    public static void setUserPassword(String userPassword) {
        UserModel.userPassword = userPassword;
    }

    public static String getUserType() {
        return userType;
    }

    public static void setUserType(String userType) {
        UserModel.userType = userType;
    }

    public static boolean loadUserDetails(String loginUsername) {
        String sqlGetUser = "SELECT * FROM users WHERE username = ?";

        try (PreparedStatement getUserDetails = DatabaseModel.createConnection().prepareStatement(sqlGetUser)) {
            getUserDetails.setString(1, loginUsername);
            try (ResultSet userDetails = getUserDetails.executeQuery()) {
                if (userDetails.next()) {
                    UserModel.setUserName(userDetails.getString("username"));
                    UserModel.setUserPassword(userDetails.getString("password"));
                    UserModel.setUserType(userDetails.getString("type"));
                    System.out.println("Table loaded to the user class");
                    return true;
                } else {
                    System.out.println("User does not exist");
                    return false;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}