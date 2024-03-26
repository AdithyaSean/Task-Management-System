package model;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SignupModel {
    public static boolean insertUserDetails(String username, String password, String userType) {
        String sqlAddUser = "INSERT INTO users(username, password, type) VALUES(?, ?, ?)";
        
        try (PreparedStatement insertUserDetails = DatabaseModel.createConnection().prepareStatement(sqlAddUser)) {
            insertUserDetails.setString(1, username);
            insertUserDetails.setString(2, password);
            insertUserDetails.setString(3, userType);

            if (insertUserDetails.executeUpdate() > 0) {
                System.out.println("User details saved");
                return true;
            } else {
                System.out.println("User details save failed");
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean insertStudentDetails(String newUsername, String firstName, String lastName, String stream, String grade) {
        String sqlAddStudent = "INSERT INTO students(username, first_name, last_name, stream, grade, full_marks) VALUES(?, ?, ?, ?, ?, ?)";

        try (PreparedStatement insertStudentDetails = DatabaseModel.createConnection().prepareStatement(sqlAddStudent)) {
            insertStudentDetails.setString(1, newUsername);
            insertStudentDetails.setString(2, firstName);
            insertStudentDetails.setString(3, lastName);
            insertStudentDetails.setString(4, stream);
            insertStudentDetails.setString(5, grade);
            insertStudentDetails.setInt(6, 0);

            if (insertStudentDetails.executeUpdate() > 0) {
                System.out.println("Student details saved");
                return true;
            } else {
                System.out.println("Student details save failed");
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean insertTeacherDetails(String newUsername, String firstName, String lastName, String stream) {
        String sqlAddTeacher = "INSERT INTO teachers(username, first_name, last_name, stream) VALUES(?, ?, ?, ?)";

        try (PreparedStatement insertTeacherDetails = DatabaseModel.createConnection().prepareStatement(sqlAddTeacher)) {
            insertTeacherDetails.setString(1, newUsername);
            insertTeacherDetails.setString(2, firstName);
            insertTeacherDetails.setString(3, lastName);
            insertTeacherDetails.setString(4, stream);

            if (insertTeacherDetails.executeUpdate() > 0) {
                System.out.println("Teacher details saved");
                return true;
            } else {
                System.out.println("Teacher details save failed");
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}