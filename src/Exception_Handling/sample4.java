package Exception_Handling;

public class sample4
{
	public static void main(String[] args) 
	{
		int [] ar=new int[5];
		
		
		
		try 
		{
			ar[8]=20;
		} 
		
		catch (ArithmeticException e) 
		{
			System.out.println("ArithmeticException Handled");
		}
		
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("ArrayIndexOutOfBoundsException Handled");
		}
		
		catch (StringIndexOutOfBoundsException f) 
		{
			System.out.println("StringIndexOutOfBoundsException Handled");
		}
		
		System.out.println("Hello");
		
	}
	
}
