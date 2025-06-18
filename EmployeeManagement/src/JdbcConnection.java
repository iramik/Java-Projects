import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection {

    private  Connection connection;
    
    public Connection getConnection()
    {
        if(null != this.connection) {
            return this.connection;
        }
        return this.createConnection();
    }

    private Connection createConnection()
    {
        String url = "jdbc:mysql://localhost:3306/todo";
        String username = "root";
        String password = "root";
        String query = "select * from task;";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(url, username, password);
        }
        catch (ClassNotFoundException e) {
            System.err.println("JDBC Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return this.connection;
    }
}
