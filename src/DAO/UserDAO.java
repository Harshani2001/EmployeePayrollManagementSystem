/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Controllers.dbConnection;
import Model.AccessLevel;
import Model.Salary;
import Model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserDAO {

    private Connection connection;

    public UserDAO() {
        // Initialize the database connection upon instantiation
        dbConnection connection = new dbConnection();

    }

    public void addUser(User user) throws SQLException {
        String sql = "INSERT INTO user (name, password, nic, address, tpn, category, gender, start_date, position, location, salary_id, type_id) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, user.getName());
            statement.setString(2, user.getPassword());
            statement.setString(3, user.getNic());
            statement.setString(4, user.getAddress());
            statement.setString(5, user.getTpn());
            statement.setString(6, user.getCategory());
            statement.setString(7, user.getGender());
            statement.setDate(8, new java.sql.Date(user.getStartDate().getTime()));
            statement.setString(9, user.getPosition());
            statement.setString(10, user.getLocation());
            statement.setInt(11, user.getSalary());
            statement.setInt(12, user.getTypeId());
            statement.executeUpdate();
        }
    }

    public User authenticateUser(String username, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
