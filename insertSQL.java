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
         String sql = "INSERT INTO personen VALUES (100, 'test', 'test', 18)";
         stmt.executeUpdate(sql);
         
         sql = "INSERT INTO personen VALUES (1, 'helmut', 'test', 25)";
         stmt.executeUpdate(sql);
         
         sql = "INSERT INTO personen VALUES (2, 'olaf', 'test', 30)";
         stmt.executeUpdate(sql);
         
         sql = "INSERT INTO personen VALUES(3, 'mike', 'test', 28)";
         stmt.executeUpdate(sql);
	  
      } catch (SQLException e) 
      {
         e.printStackTrace();
      } 
   }
}