package com.netflex.dry;

public class AdminController {
    private String username = "";
    private String password = "";

    public void deleteUser(String user) {
        if (!isAuthenticated(user, "")) {
            throw new RuntimeException("User is not authenticated.");
        }
        //TODO Add delete logic here
    }

    private boolean isAuthenticated(String user, String password) {
        return user != null && password != null &&
                user.equals(this.username) && password.equals(this.password);
    }
}
