package Multiple_Inheritance;

public class demo3 implements demo1, demo2
{
	
	public void Addition(int a, int b) 
	{
		System.out.println(a+b);
	}
	
	public void Subtraction() 
	{
		System.out.println(25-5);
	}
	
	public void Multiplication(int c, int d, int e) 
	{
		System.out.println(c*d*e);
	}
	
	public void Division() 
	{
		System.out.println(52/13);
		
	}

	public static void main(String[] args) 
	{
		demo3 d3=new demo3();
		d3.Addition(5, 10);
		d3.Subtraction();
		d3.Multiplication(5, 4, 3);
		d3.Division();
	}
}
