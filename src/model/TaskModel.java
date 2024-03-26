package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TaskModel {
    private int id;
    private String issued_by;
    private String status;
    private String task;
    private String details;
    private String deadline;
    private String stream;
    private int marks;
    private String done_by;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIssuedBy() {
        return issued_by;
    }

    public void setIssuedBy(String issued_by) {
        this.issued_by = issued_by;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getDoneBy() {
        return done_by;
    }

    public void setDoneBy(String done_by) {
        this.done_by = done_by;
    }

    public static List<TaskModel> getAllTasks() {
        List<TaskModel> tasks = new ArrayList<>();
    
        String sql = "SELECT * FROM tasks";
        try (PreparedStatement statement = DatabaseModel.createConnection().prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {
    
            while (resultSet.next()) {
                TaskModel task = new TaskModel();
                task.setId(resultSet.getInt("id"));
                task.setIssuedBy(resultSet.getString("issued_by"));
                task.setStatus(resultSet.getString("status"));
                task.setTask(resultSet.getString("task"));
                task.setDetails(resultSet.getString("details"));
                task.setDeadline(resultSet.getString("deadline"));
                task.setStream(resultSet.getString("stream"));
                task.setDoneBy(resultSet.getString("done_by"));
                task.setMarks(resultSet.getInt("marks"));

                tasks.add(task);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return tasks;
    }

    public static boolean insertTask(String issued_by, String status, String task, String details, String deadline, String stream) {
        String sql = "INSERT INTO tasks(issued_by, status, task, details, deadline, stream, done_by, marks) VALUES(?, ?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement statement = DatabaseModel.createConnection().prepareStatement(sql)) {
            statement.setString(1, issued_by);
            statement.setString(2, status);
            statement.setString(3, task);
            statement.setString(4, details);
            statement.setString(5, deadline);
            statement.setString(6, stream);
            statement.setString(7, "not done yet");
            statement.setInt(8, 0);
            if(statement.executeUpdate() > 0) {
                System.out.println("task inserted to the database");
                return true;
            } else {
                System.out.println("task failed to insert to the database");
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean removeTask(String task) {
        String sql = "DELETE FROM tasks WHERE task = ?";

        try (PreparedStatement statement = DatabaseModel.createConnection().prepareStatement(sql)) {
            statement.setString(1, task);
            if (statement.executeUpdate() > 0) {
                System.out.println("task deleted from the database");
                return true;
            } else {
                System.out.println("task failed to delete from the database");
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean completeTaskStudent(String issued_by, String status, String task, String details, String deadline, String stream, String done_by) {
        String sql = "INSERT INTO tasks(issued_by, status, task, details, deadline, stream, done_by) VALUES(?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement statement = DatabaseModel.createConnection().prepareStatement(sql)) {
            statement.setString(1, issued_by);
            statement.setString(2, status);
            statement.setString(3, task);
            statement.setString(4, details);
            statement.setString(5, deadline);
            statement.setString(6, stream);
            statement.setString(7, done_by);

            if (statement.executeUpdate() > 0) {
                System.out.println("Task is completed");
                return true;
            } else {
                System.out.println("Error completing task");
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean completeTaskTeacher(int marks, int id) {
        String sql = "UPDATE tasks SET marks = ? WHERE id = ?";

        try (PreparedStatement statement = DatabaseModel.createConnection().prepareStatement(sql)) {
            statement.setInt(1, marks);
            statement.setInt(2, id);

            if (statement.executeUpdate() > 0) {
                System.out.println("Task updated");
                return true;
            } else {
                System.out.println("Error updating the task");
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}