package controller;

import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.TaskModel;

public class TaskController {
    public static boolean loadTableTasksList(JTable jTableTasksList) {
        DefaultTableModel tableModel = (DefaultTableModel) jTableTasksList.getModel();
        tableModel.setRowCount(0);

        try {
            List<TaskModel> tasks = TaskModel.getAllTasks();
            
            for (TaskModel task : tasks) {
                Object[] row = {
                    task.getIssuedBy(),
                    task.getStatus(),
                    task.getTask(),
                    task.getDeadline()
                };
                tableModel.addRow(row);
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean loadTableViewTask(JTable jTableViewTask) {
        DefaultTableModel tableModel = (DefaultTableModel) jTableViewTask.getModel();
        tableModel.setRowCount(0);

        try {
            List<TaskModel> tasks = TaskModel.getAllTasks();

            for (TaskModel task : tasks) {
                Object[] row = {
                    task.getId(),
                    task.getIssuedBy(),
                    task.getStatus(),
                    task.getTask(),
                    task.getDetails(),
                    task.getDeadline(),
                    task.getStream(),
                    task.getDoneBy(),
                    task.getMarks()
                };
                tableModel.addRow(row);
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean insertTask(String issued_by, String status, String task, String details, String deadline, String stream) {
        return TaskModel.insertTask(issued_by, status, task, details, deadline, stream);
    }

    public static boolean removeTask(String task) {
        return TaskModel.removeTask(task);
    }

    public static boolean completeTaskStudent(String issued_by, String status, String task, String details, String deadline, String stream, String done_by) {
        return TaskModel.completeTaskStudent(issued_by, status, task, details, deadline, stream, done_by);
    }

    public static boolean completeTaskTeacher(int marks, int id) {
        return TaskModel.completeTaskTeacher(marks, id);
    }
}