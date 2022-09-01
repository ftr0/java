import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

public class Main
{
    static final String DB_URL = "jdbc:mysql://localhost/thomas";
    static final String USER = "root";
    static final String PASS = "";
    static final String QUERY = "SELECT * FROM books";

    public static void main(String[] args)
    {
        List bookList = new LinkedList<>();

        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(QUERY);
        )
        {
            while(rs.next())
            {
                bookList.add(new Book(rs.getString("titel"), 
                        rs.getString("autor"), 
                        rs.getString("verlag"), 
                        rs.getString("ort"), 
                        rs.getString("jahr"), 
                        rs.getString("sachgebiet")));
            }
        } catch (SQLException e)
        {
            e.printStackTrace();
        }

        for (Book book : bookList)
        {
            System.out.println(book.getTitel());
        }
    }
}


public class Book
{
    String titel;
    String autor;
    String verlag;
    String ort;
    String jahr;
    String sachgebiet;


    Book(String titel, String autor, String verlag, String ort, String jahr, String sachgebiet)
    {
        this.titel = titel;
        this.autor = autor;
        this.verlag = verlag;
        this.ort = ort;
        this.jahr = jahr;
        this.sachgebiet = sachgebiet;
    }

    public String getTitel()
    {
        return titel;
    }

    public String getAutor() 
    {
        return  autor;
    }

    public String getVerlag() 
    {
        return verlag;
    }

    public String getOrt() 
    {
        return ort;
    }

    public String getJahr() 
    {
        return jahr;
    }

    public String getSachgebiet() 
    {
        return sachgebiet;
    }
}