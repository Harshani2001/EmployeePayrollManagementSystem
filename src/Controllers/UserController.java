/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;


import DAO.UserDAO;
import Model.User;
import View.AdminDashboard;
import View.LOGIN_ADMIN;
import javax.swing.JOptionPane;

public class UserController {

    private UserDAO userDAO;

    public UserController() {
        userDAO = new UserDAO();
    }

    public boolean validateAndRedirect(String username, String password) {
        User authenticatedUser = userDAO.authenticateUser(username, password);

        if (authenticatedUser != null) {
            if (authenticatedUser instanceof Admin) {
                openAdminDashboard(authenticatedUser);
                return true; // Successful login as Admin
            } else if (authenticatedUser instanceof SuperAdmin) {
                openManagerDashboard(authenticatedUser);
                return true; // Successful login as super admin
            } else {
                JOptionPane.showMessageDialog(null, "Invalid user position.");
                // Handle unrecognized user position
            }
        } else {
            JOptionPane.showMessageDialog(null, "Invalid username or password.");
            // Handle invalid credentials
        }
        return false; // Failed login attempt
    }

    private void openAdminDashboard(User user) {
        AdminDashboard adminDashboard = new AdminDashboard();
        adminDashboard.setVisible(true);
        // You may want to pass the authenticated user to AdminDashboard constructor if needed.
    }

    private void openManagerDashboard(User user) {
        AdminDashboard managerDashboard = new AdminDashboard();
        managerDashboard.setVisible(true);
        // You may want to pass the authenticated user to ManagerDashboard constructor if needed.
    }
}
