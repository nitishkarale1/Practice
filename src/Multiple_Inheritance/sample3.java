package Multiple_Inheritance;

public class sample3 implements sample1,sample2
{
	public void addition(int a, int b)
	{
		System.out.println(a+b);
	}
	
	public void subtraction(int c, int d)
	{
		System.out.println(c-d);
	}
	
	public void multiplication(int x, int y)
	{
		System.out.println(x*y);
	}
	
	public void division(int p, int q)
	{
		System.out.println(p/q);
	}
	
	public static void main(String[] args) 
	{
		sample3 s3=new sample3();
		s3.addition(5, 75);
		s3.subtraction(20, 15);
		s3.multiplication(10, 25);
		s3.division(50, 5);
		
	}
	
}
