import java.sql.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Database URL, username, and password

        // Replace with your database name
        String url
                = "jdbc:mysql://localhost:3306/EmployeeManagement";

        // Replace with your MySQL username
        String username = "root";

        // Replace with your MySQL password
        String password = "root";

        // Updated query syntax for modern databases
        String query
                = "select * from employees;";

        // Establish JDBC Connection
        try {

            // Load Type-4 Driver
            // MySQL Type-4 driver class
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            Connection c = DriverManager.getConnection(
                    url, username, password);

            // Create a statement
            Statement st = c.createStatement();

            // Execute the query
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                System.out.println(rs.getString(2));
                System.out.println(rs.getString(1));
            }

            // Close the connection
            st.close();
            c.close();
            System.out.println("Connection closed.");
        } catch (ClassNotFoundException e) {
            System.err.println("JDBC Driver not found: "
                    + e.getMessage());
        } catch (SQLException e) {
            System.err.println("SQL Error: "
                    + e.getMessage());
        }
    }
}