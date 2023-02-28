package Logical_Programs;

public class demo2
{
	public static void main(String[] args) 
	{
		String org="abc";
		String rev="";
		//      i=2
		for(int i=org.length()-1; i>=0; i--)
		{
			rev=rev+org.charAt(i);
		}
		
		System.out.println(rev);
	}
}
