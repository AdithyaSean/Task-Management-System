package controller;

import model.SignupModel;

public class SignupController {
    public static boolean handleStudentSignup(String newUsername, String newPassword, String accountType, String firstName, String lastName, String stream, String grade) {
        if (SignupModel.insertUserDetails(newUsername, newPassword, accountType)) {
            return SignupModel.insertStudentDetails(newUsername, firstName, lastName, stream, grade);
        }
        return false;
    }

    public static boolean handleTeacherSignup(String newUsername, String newPassword, String accountType, String firstName, String lastName, String stream) {
        if (SignupModel.insertUserDetails(newUsername, newPassword, accountType)) {
            return SignupModel.insertTeacherDetails(newUsername, firstName, lastName, stream);
        }
        return false;
    }
}
