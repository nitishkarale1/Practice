package Exception_Handling;

public class sample3 
{
	public static void main(String[] args) 
	{
		String str="Nitish";
		
		try 
		{
			System.out.println(str.charAt(9));
		}
		
		catch (StringIndexOutOfBoundsException a)
		{
			System.out.println("StringIndexOutOfBoundsException Handled");
		}
		
		System.out.println(str.substring(3,5));
		
	}
	
}
