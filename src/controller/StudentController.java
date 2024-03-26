package controller;

import model.StudentModel;

public class StudentController {
    public static String getFirstName() {
        return StudentModel.getFirstName();
    }

    public static String getLastName() {
        return StudentModel.getLastName();
    }

    public static String getStream() {
        return StudentModel.getStream();
    }

    public static String getGrade() {
        return StudentModel.getGrade();
    }

    public static int getFullMarks() {
        return StudentModel.getFullMarks();
    }
}