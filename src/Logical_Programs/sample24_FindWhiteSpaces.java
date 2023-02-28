package Logical_Programs;

public class sample24_FindWhiteSpaces 
{
	public static void main(String[] args) 
	{
		String str="ni  t i   s h";
		
		int spaces=0;
		
		for(int i=0; i<=str.length()-1; i++)
		{
			char s1 = str.charAt(i);
			
			if(s1==' ')
			{
				spaces++;
			}
		}
		System.out.println(spaces);
		
	}
}
