package controller;

import model.UpdateMarksModel;

public class UpdateMarksController {
    public static boolean updateMarks(String done_by, int marks) {
        return UpdateMarksModel.updateMarks(done_by, marks);
    }
}