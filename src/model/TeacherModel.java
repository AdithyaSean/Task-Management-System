package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TeacherModel extends UserModel {
    private static String firstName;
    private static String lastName;
    private static String stream;

    public static String getFirstName() {
        return firstName;
    }

    public static void setFirstName(String firstName) {
        TeacherModel.firstName = firstName;
    }

    public static String getLastName() {
        return lastName;
    }

    public static void setLastName(String lastName) {
        TeacherModel.lastName = lastName;
    }

    public static String getStream() {
        return stream;
    }

    public static void setStream(String stream) {
        TeacherModel.stream = stream;
    }

    public static boolean loadTeacherDetails(String loginUsername) {
        String sqlGetTeacher = "SELECT * FROM teachers WHERE username = ?";
        
        try (PreparedStatement getTeacherDetails = DatabaseModel.createConnection().prepareStatement(sqlGetTeacher)) {
            getTeacherDetails.setString(1, loginUsername);
            try (ResultSet teacherDetails = getTeacherDetails.executeQuery()) {
                if (teacherDetails.next()) {
                    TeacherModel.setFirstName(teacherDetails.getString("first_name"));
                    TeacherModel.setLastName(teacherDetails.getString("last_name"));
                    TeacherModel.setStream(teacherDetails.getString("stream"));
                    System.out.println("table loaded to the teacher class");
                    System.out.println("Login Successful!");
                    return true;
                } else {
                    System.out.println("teacher table error");
                    return false;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}