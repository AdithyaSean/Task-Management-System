package controller;

import model.TeacherModel;

public class TeacherController {
    public static String getFirstName() {
        return TeacherModel.getFirstName();
    }

    public static String getLastName() {
        return TeacherModel.getLastName();
    }

    public static String getStream() {
        return TeacherModel.getStream();
    }
}