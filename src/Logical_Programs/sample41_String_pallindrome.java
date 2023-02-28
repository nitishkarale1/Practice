package Logical_Programs;

public class sample41_String_pallindrome 
{
	public static void main(String[] args)
	{
		String s1="INDIA";
		
		String rev="";
		
		for(int i=s1.length()-1; i>=0; i--)
		{
			rev=rev+s1.charAt(i);
		}
		if(s1.equals(rev))
		{
			System.out.println("given String is Pallindrome.");
		}
		else
		{
			System.out.println("given String is not Pallindrome.");
		}
		
		
	}
	
}
