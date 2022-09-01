import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestApplication
{
    static final String DB_URL = "jdbc:mysql://localhost/thomas";
    static final String USER = "root";
    static final String PASS = "";

    public static void main(String[] args)
    {
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
        )
        {
            String sql = "CREATE TABLE aufgaben" +
                    "(ID INT PRIMARY KEY AUTO_INCREMENT," +
                    " aufgabeTitel VARCHAR (20) NOT NULL," +
                    " link VARCHAR (20) NOT NULL," +
                    " uploadedDate timestamp)";


            stmt.executeUpdate(sql);
            System.out.println("ok.");
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
}