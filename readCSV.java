  package com.dario.csvfile;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

public class Main {

    public static void main(String[] args)
      String dateiname = "address.csv";
        try(BufferedReader reader = new BufferedReader(new FileReader(dateiname)))
        {
            String csvstring;
            while((csvstring = reader.readLine()) != null)
            {
                String[] werte = csvstring.split(";");
                System.out.println(werte[0]);
            }
        }
        catch(IOException e)
        {
            System.out.print("lol");
        }
            }
}
