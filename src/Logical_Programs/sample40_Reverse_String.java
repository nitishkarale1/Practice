package Logical_Programs;

public class sample40_Reverse_String 
{
	public static void main(String[] args)
	{
		String str="ABCD";
		
		String str1="";
		
		for(int i=str.length()-1; i>=0; i--)
		{
			str1=str1+str.charAt(i);
		}
		
		System.out.println(str1);
	}
		
}
