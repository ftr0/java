import java.util.HashMap;
import java.util.Objects;

public class Main
{
	public static void main(String []args)
	{
		Artikel artikel = new Artikel("Kirsche", 2);
		
		HashMap<Integer, Artikel> artikelmap = new HashMap<>();
		
		artikelmap.put(1, artikel);
		artikelmap.put(2, new Artikel("Birne", 7));
		artikelmap.put(3, new Artikel("Kiwi", 2));
		artikelmap.put(4, new Artikel("Apfel", 5));
		
		System.out.println(artikelmap);
		
		Artikel a = artikelmap.get(1);
		System.out.println(a);
	}
}


class Artikel
{
	String name;
	int anzahl;
	
	Artikel(String name, int anzahl)
	{
		this.name = Objects.requireNonNull(name,"name can not be null!");
		this.anzahl = Objects.requireNonNull(anzahl,"anzahl can not be null!");
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAnzahl()
	{
		return anzahl;
	}
	
	public String toString() 
	{
		return name +" "+anzahl+"Stk";
	}
}
