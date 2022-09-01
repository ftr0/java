import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main 
{
   static final String DB_URL = "jdbc:mysql://localhost/thomas";
   static final String USER = "root";
   static final String PASS = "";
   static final String QUERY = "SELECT id, vorname, nachname, alter FROM person";

   public static void main(String[] args) 
   {

      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
      ) 
      {		      
         String sql = "UPDATE person " +
            "SET age = 30 WHERE id in (1, 2)";
         stmt.executeUpdate(sql);
         ResultSet rs = stmt.executeQuery(QUERY);
         while(rs.next())
         {

            System.out.print("id: " + rs.getInt("id"));
            System.out.print(", alter: " + rs.getInt("alter"));
            System.out.print(", vorname: " + rs.getString("vorname"));
            System.out.println(", nachname: " + rs.getString("nachname"));
         }
         rs.close();
      } catch (SQLException e) 
      {
         e.printStackTrace();
      } 
   }
}