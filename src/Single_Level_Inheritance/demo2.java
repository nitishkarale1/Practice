package Single_Level_Inheritance;

public class demo2 extends demo1 
{
	public void Division(int c, int d)
	{
		System.out.println(c / d);
	}
	
	public static void main(String [] args)
	{
		demo2 d=new demo2();
		
		d.Division(75, 5);
		d.Addition();
		d.Multiplication(10, 15);
	}
	
}
