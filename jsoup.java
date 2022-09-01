import org.jsoup.Jsoup;

import java.io.IOException;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        String urlETH = "https://coinmarketcap.com/currencies/ethereum/";
        double rawETH = Double.parseDouble(Jsoup.connect(urlETH).get().getElementsByClass("priceValue").text().toString().replaceAll("[$,]", ""));
        System.out.println(rawETH);
    }
}