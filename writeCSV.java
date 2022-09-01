package com.dario.csvfile;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

public class Main {

    public static void main(String[] args)
    {
        String dateiname = "address.csv";
        try(PrintWriter writer = new PrintWriter(dateiname))
        {
            int p = 0;
            int q = 99;
            while(p<99)
            {
                p++;
                Random rand = new Random();
                final int sentenceLength = rand.nextInt(20) + 1;
                char[] cArr;
                int wordLength;
                for (int n = 0; n < sentenceLength; n++)
                {
                    wordLength = rand.nextInt(10) + 2;
                    cArr = new char[wordLength];
                    for (int j = 0; j < cArr.length; j++)
                    {
                        int i = rand.nextInt(3);
                        switch (i) {
                            case 0: 
                                cArr[j] = (char) (rand.nextInt(26) + 97);
                                break;
                            case 1: 
                                cArr[j] = (char) (rand.nextInt(26) + 65);
                                break;
                            case 2: 
                                cArr[j] = (char) (rand.nextInt(10) + 48);
                                break;
                        }
                    }
                writer.print("lol;" + p + ";"+ new String(cArr));
                writer.println();
                }
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

