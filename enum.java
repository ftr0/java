public class Main 
{ 
	public static void main(String[] args) 
	{
		Color c = Color.RED; 
                
		switch(c) 
		{
			case RED:
				System.out.println("RED");
				break;
			case BLUE:
				System.out.println("BLUE");
				break;
			case GREEN:
				System.out.println("GREEN");
				break;
		}
	}
}

enum Color 
{
	RED,
	BLUE,
	GREEN
}
