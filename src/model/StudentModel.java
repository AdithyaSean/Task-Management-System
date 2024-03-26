package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentModel extends UserModel {
    private static String firstName;
    private static String lastName;
    private static String stream;
    private static String grade;
    private static int fullMarks;

    public static String getFirstName() {
        return firstName;
    }

    public static void setFirstName(String firstName) {
        StudentModel.firstName = firstName;
    }

    public static String getLastName() {
        return lastName;
    }

    public static void setLastName(String lastName) {
        StudentModel.lastName = lastName;
    }

    public static String getStream() {
        return stream;
    }

    public static void setStream(String stream) {
        StudentModel.stream = stream;
    }

    public static String getGrade() {
        return grade;
    }

    public static void setGrade(String grade) {
        StudentModel.grade = grade;
    }

    public static int getFullMarks() {
        return fullMarks;
    }

    public static void setFullMarks(int fullMarks) {
        StudentModel.fullMarks = fullMarks;
    }

    public static boolean loadStudentDetails(String loginUsername) {
        String sqlGetStudent = "SELECT * FROM students WHERE username = ?";

        try (PreparedStatement getStudentDetails = DatabaseModel.createConnection().prepareStatement(sqlGetStudent)) {
            getStudentDetails.setString(1, loginUsername);
            try (ResultSet studentDetails = getStudentDetails.executeQuery()) {
                if (studentDetails.next()) {
                    StudentModel.setFirstName(studentDetails.getString("first_name"));
                    StudentModel.setLastName(studentDetails.getString("last_name"));
                    StudentModel.setStream(studentDetails.getString("stream"));
                    StudentModel.setGrade(studentDetails.getString("grade"));
                    StudentModel.setFullMarks(studentDetails.getInt("full_marks"));
                    System.out.println("table loaded to the student class");
                    System.out.println("Login Successful!");
                    return true;
                } else {
                    System.out.println("student table error");
                    return false;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}