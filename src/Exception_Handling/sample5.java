package Exception_Handling;

public class sample5
{
	public static void main(String[] args) 
	{
		String s1=new String("nitish");
		
		try 
		{
			System.out.println(s1.charAt(10));
		}
		catch(Exception a)
		{
			System.out.println("Generic Exception Handled");
			a.printStackTrace();
		}
		
		System.out.println("Hi");
		
	}
	
}
