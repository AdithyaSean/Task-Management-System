package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DatabaseModel {
    public static Connection createConnection() {
        try {
            String dbpath = "jdbc:mysql://localhost/tms_database";
            String dbusername = "root";
            String dbpassword = "";
            Connection connection = DriverManager.getConnection(dbpath, dbusername, dbpassword);

            return connection;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}