import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StreamsReader 
{
    public static void main(String[] args) 
    {
        String path = "text.txt";

 
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) 
        {
            String zeile;
            while ((zeile = reader.readLine()) != null) 
            {
                System.out.println(zeile);
            }
        }
        
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    
        String text;
        double preis;
        int anzahl;

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) 
        {
            String zeile;
            text = reader.readLine();
            preis = Double.parseDouble(reader.readLine());
            anzahl = Integer.parseInt(reader.readLine());

            System.out.println(text);
            System.out.println(preis);
            System.out.println(anzahl);
        }
        
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
}
