package controler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class YourDatabaseUtility {
    public static Connection getConnection() throws SQLException {
        String dbUrl = "jdbc:mysql://localhost:3306/my_loan_database";
        String dbUsername = "root";
        String dbPassword = "abc123";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
        } catch (ClassNotFoundException e) {
            throw new SQLException("JDBC driver not found", e);
        }
    }
}
