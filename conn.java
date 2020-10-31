import java.sql.*;
public class conn
{
    public static void main (String[] args)
    {
        String url = "jdbc:mysql://localhost:3306/courier?useSSL=false";
        String username = "root";
        String password = "JyothirmayeE@77";
        Connection connection = null;
        try {
            System.out.println("Connecting database...");
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Database connected!");
        } 
        catch (SQLException e) {
            System.err.println("Cannot connect the database!");
            e.printStackTrace();
        } 
        finally {
            System.out.println("Closing the connection.");
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ignore) {

                }
            }
        }   
    }
}