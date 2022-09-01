import java.util.*;  

class Main
{
	public static void main(String [] args)
	{
		Matrix matrix = new Matrix();
		matrix.printMatrix(new Point(-22,-22));
	}
}


class Matrix
{
	int xMatrix = 1;
	int yMatrix = 1;
	int fieldWidthMAX = 10;
	int fieldHeightMAX = 10;
	
	public void printMatrix(Point p)
	{
		if(p.getPointX() >= fieldWidthMAX)
			p.setPointX(fieldWidthMAX);
			
		if(p.getPointY() >= fieldHeightMAX)
			p.setPointY(fieldHeightMAX);	
			
			
			
		if(p.getPointX() <= 1)
			p.setPointX(1);
			
		if(p.getPointY() <= 1)
			p.setPointY(1);
		
		
			
		while(xMatrix <= fieldHeightMAX)
		{
			yMatrix = 1;
			while(yMatrix <= fieldWidthMAX)
			{
				if(p.getPointX() == xMatrix && p.getPointY() == yMatrix)
				{
					System.out.print("O ");
				}
				else
				{
					System.out.print("X ");
				}
				yMatrix++;
			}	
			System.out.println("");
			xMatrix++;	
		}
	}
}


class Point
{
	int xPoint;
	int yPoint;
	
	Point(int xPoint, int yPoint)
	{
		this.xPoint = xPoint; 
		this.yPoint = yPoint;
	}
	
	public int getPointX()
	{
		return xPoint;
	}
	
	public int getPointY()
	{
		return yPoint;
	}
	
	public void setPointX(int x)
	{
		this.xPoint = x; 
	}
	
	public void setPointY(int y)
	{
		this.yPoint = y; 
	}
}
