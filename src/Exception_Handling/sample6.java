package Exception_Handling;

public class sample6 
{
	public static void main(String[] args) 
	{
		int [] ar=new int [5];
				
		try 
		{
			ar[8]=100;
		}
		
		catch(ArithmeticException a)
		{
			System.out.println("Arithmetic Exception Handled");
		}
		
		catch(ArrayIndexOutOfBoundsException b)
		{
			System.out.println("ArrayIndexOutOfBounds Exception Handled");	
		}
		
		catch(Exception c)
		{
			System.out.println("Generic Exception Handled");
			//c.printStackTrace();
		}
	
		System.out.println("Hello");
	}
	
}
