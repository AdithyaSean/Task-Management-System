package model;

public class LoginModel {
    public static boolean handleLogin(String loginUsername, String loginPassword) {
        if (UserModel.loadUserDetails(loginUsername)) {
            if (UserModel.getUserPassword().equals(loginPassword) && UserModel.getUserName().equals(loginUsername)) {
                if ("Student".equals(UserModel.getUserType())) {
                    return StudentModel.loadStudentDetails(loginUsername);
                } else if ("Teacher".equals(UserModel.getUserType())) {
                    return TeacherModel.loadTeacherDetails(loginUsername);
                } else if ("Admin".equals(UserModel.getUserType())) {
                    System.out.println("Logged as an admin user");
                    return true;
                } else {
                    System.out.println("Unknown User");
                    return false;
                }
            } else {
                System.out.println("Invalid username or password!");
                System.out.println("Login Unsuccessful!");
                return false;
            }
        } else {
            return false;
        }
    }
}