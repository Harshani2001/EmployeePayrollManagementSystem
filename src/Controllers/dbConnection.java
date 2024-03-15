package Controllers;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pathum Sri
 */
public class dbConnection {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/empms";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "";
    private Connection connection;
    private static dbConnection instance;
    
    public dbConnection(){
          // Initialize the database connection upon instantiation
        establishConnection();
    }

    private void establishConnection() {
         try {
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            System.out.println("Connected to the database.");
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle connection failures appropriately
        }
    }

}
