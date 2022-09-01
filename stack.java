import java.util.Stack;

public class Main
{
	public static void main(String []args)
	{
		String person;
		
		Stack<String> stapel = new Stack<>();
		
		stapel.push("helmut");
		stapel.push("manfred");
		stapel.push("aldi");
		stapel.push("eierkopf");
		System.out.println(stapel +"\n");
		person = stapel.pop();
		
		System.out.println(stapel +"\n");
		

		for(String p : stapel)
		{
			System.out.println(p);
		}
		
		System.out.println(stapel);
	}
}

