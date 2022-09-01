import java.util.LinkedList;
import java.util.List;

public class Main
{
	public static void main(String []args)
	{		
		byte maxB = 49;

        List<Number> numberlist = new LinkedList<>();

        int i = 0;
        int n = 6;

        while (i < n)
        {
            byte a = (byte) (Math.random() * maxB + 1);
            i++;
            numberlist.add(new Number(a));
        }
        
        System.out.println(numberlist);
     }
}
   
public class Number
{
    int wert;
    Number(int wert)
    {
        this.wert = wert;
    }
    public int getWert()
    {
        return wert;
    }

    public String toString()
    {
        return wert+"";
    }
}
