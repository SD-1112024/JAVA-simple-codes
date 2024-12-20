package JAVAPROGRAMMING;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCExample {
    public static void main(String[] args) {
        // Database URL and credentials
        String url = "jdbc:mysql://localhost:3306/yourDatabase";
        String username = "yourUsername";  // LH1-SOE@DSU
        String password = "yourPassword";
        
        try {
            // Step 1: Load MySQL JDBC Driver (optional for Java 8+)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Establish the connection
            Connection conn = DriverManager.getConnection(url, username, password);

            // Step 3: Create a statement
            Statement stmt = conn.createStatement();

            // Step 4: Execute a query
            String query = "SELECT * FROM yourTable";
            ResultSet rs = stmt.executeQuery(query);

            // Step 5: Process the result set
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Name: " + rs.getString("name"));
            }

            // Step 6: Close the connection
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
