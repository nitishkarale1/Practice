package Multi_Level_Inheritance;

public class demo4 extends demo3
{
	public void Subtraction()
	{
		System.out.println(50-5);
	}
	
	public static void main(String[] args) 
	{
		demo4 d=new demo4();
		d.Addition();
		d.Multiplication();
		d.Division();
		d.Subtraction();
	}
}
