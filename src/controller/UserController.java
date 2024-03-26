package controller;

import model.UserModel;

public class UserController {
    public static String getUserName() {
        return UserModel.getUserName();
    }

    public static void setUserName(String userName) {
        UserModel.setUserName(userName);
    }

    public static String getUserPassword() {
        return UserModel.getUserPassword();
    }

    public static void setUserPassword(String userPassword) {
        UserModel.setUserPassword(userPassword);
    }

    public static String getUserType() {
        return UserModel.getUserType();
    }

    public static void setUserType(String userType) {
        UserModel.setUserType(userType);
    }
}