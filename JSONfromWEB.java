import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Main
{
    public static void main(String[] args) throws IOException 
    {
        URL url = new URL("https://cybershit.io/api/service.php?info=allcharacter");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        InputStream inputStream = con.getInputStream();

        try(BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream)))
        {
            String json = "";
            json = reader.readLine();

            System.out.println(json);
        }
    }
}