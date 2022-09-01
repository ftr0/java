import java.util.Objects;
import java.util.TreeMap;

public class Main
{
	public static void main(String []args)
	{
		TreeMap<String, Integer> map = new TreeMap<>();
		
		map.put("Helmut", 1);
		map.put("Soeren", 2);
		map.put("Bernd", 3);
		
		System.out.println(map);

		System.out.println("Helmut" +Objects.hash("Helmut", 1));
		System.out.println("Soeren" +Objects.hash("Soeren", 2));
		System.out.println("Bernd" +Objects.hash("Bernd", 3));
		
		System.out.println(map.containsKey("bernd"));
		
		int x;
		x = map.get("Helmut");
		System.out.print(x +"\n");
		
		for (String key : map.keySet())
		{
			System.out.println(key);
			System.out.println(map.get(key));
			
		}
		
		System.out.println("Anzahl:" + map.size());
		System.out.println("Anzahl:" + map.isEmpty());
	}
}

