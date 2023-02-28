package Exception_Handling;

public class sample1
{
	public static void main(String[] args) 
	{
		int a=20;
		int b=2;
		
		int c=0;
		
		try
		{
			c=a/b;
		}
		catch (ArithmeticException e) 
		{
			System.out.println("Exception Handled");
		}
		
		System.out.println(c);
	}
		
}
