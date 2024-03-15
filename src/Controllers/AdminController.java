/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import DAO.UserDAO;
import Model.AccessLevel;
import Model.Salary;
import Model.User;
import java.util.List;

public class AdminController extends UserController {

    
    private ProductDAO productDAO;
    private SalesDAO salesDAO;
    private UserDAO userDAO;

    public UserController(int userId, String username, String password, String name, String address, String email, String phone, String nic) {
        super(userId, username, password, "Manager", name, address, email, phone, nic);
        productDataDAO = new ProductDataDAO();
        productDAO = new ProductDAO();
        salesDAO = new SalesDAO();
        userDAO = new UserDAO();
    }

    // Manager-specific functionalities can be added here
    // Example: methods to manage products, sales, and users
    // For instance:
    public List<ProductData> viewAllProductData() {
        return productDataDAO.viewAllProductData();
    }

    // Additional methods for managing products, sales, users, etc.
}