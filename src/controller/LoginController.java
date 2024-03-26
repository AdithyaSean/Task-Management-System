package controller;

import model.LoginModel;

public class LoginController {
    public static boolean handleLogin(String loginUsername, String loginPassword) {
        return LoginModel.handleLogin(loginUsername, loginPassword);
    }
}