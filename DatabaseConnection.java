import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/vpn_db";
    private static final String USER = "root";
    private static final String PASSWORD = "yourpassword";

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver"); // Load the MySQL JDBC driver
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    // Optional: Test main method
    public static void main(String[] args) {
        try {
            Connection conn = getConnection();
            System.out.println("Connected to database successfully!");
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
