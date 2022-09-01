import java.io.*;

public class StreamsWriter 
{
    public static void main(String[] args) 
    {
		String path = "index.html";
		
		StringBuilder htmlfile = new StringBuilder();
		htmlfile.append("&lt;head&gt;&lt;/head&gt;");
		htmlfile.append("&lt;body&gt;&lt;/body&gt;");

		String html = "&lt;html&gt;" + htmlfile + "&lt;/html&gt;";
		
        try(FileWriter writer = new FileWriter(path)) 
        
        {
            writer.write(html);
        }
        
        catch (IOException e) 
        {
            e.printStackTrace();
        }
        
        
 
        
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
    }
}
