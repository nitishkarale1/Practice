package Logical_Programs;

public class sample7_Pallindrome 
{
	
	public static void main(String[] args) 
	{
		String Org="level";
		
		String Rev="";
		
		for(int a=Org.length()-1; a>=0; a--)
		{
			Rev=Rev+Org.charAt(a);
		}
		
		System.out.println("Original String: "+Org);
		System.out.println("Reverse String: "+Rev);
		
		if (Org.equals(Rev))
		{
			System.out.println("Hence The Given String Is Pallindrome");
		}
		else
		{
			System.out.println("Hence The Given String Is not pallindrome");
		}
	}
}
