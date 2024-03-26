package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UpdateMarksModel {
    public static boolean updateMarks(String done_by, int marks) {
        String sqlSelect = "SELECT full_marks FROM students WHERE username = ?";
        String sqlUpdate = "UPDATE students SET full_marks = ? WHERE username = ?";
        
        try (PreparedStatement selectStatement = DatabaseModel.createConnection().prepareStatement(sqlSelect)) {
            selectStatement.setString(1, done_by);
            ResultSet resultSet = selectStatement.executeQuery();
            
            if (resultSet.next()) {
                System.out.println("marks retrived from the database");
                int currentMarks = resultSet.getInt(1);
                int totalMarks = marks + currentMarks;
        
                try (PreparedStatement updateStatement = DatabaseModel.createConnection().prepareStatement(sqlUpdate)) {
                    updateStatement.setInt(1, totalMarks);
                    updateStatement.setString(2, done_by);
                    if (updateStatement.executeUpdate() > 0) {
                        System.out.println("Marks successfully updated to the database");
                        return true;
                    } else {
                        System.out.println("Marks does not updated to the database");
                        return false;
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                    return false;
                }
            } else {
                System.out.println("No marks retrived from the database");
                int currentMarks = resultSet.getInt(1);
                int totalMarks = marks + currentMarks;

                try (PreparedStatement updateStatement = DatabaseModel.createConnection().prepareStatement(sqlUpdate)) {
                    updateStatement.setInt(1, totalMarks);
                    updateStatement.setString(2, done_by);
                    if (updateStatement.executeUpdate() > 0) {
                        System.out.println("Marks successfully updated to the database");
                        return true;
                    } else {
                        System.out.println("Marks does not updated to the database");
                        return false;
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                    return false;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}