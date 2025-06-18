public class JdbcConnection {

    private Connection connection;
    
    public static getConnection() 
    {
        if(null != this.connection) {
            return this.connection;
        }
        return this.createConnection();
    }

    private static Connection createConnection() 
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
        }
        return this.connection;
    }
}
