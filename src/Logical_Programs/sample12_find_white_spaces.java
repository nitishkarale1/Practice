package Logical_Programs;

public class sample12_find_white_spaces
{
	public static void main(String[] args) 
	{
		String s1="a bc  de f g";
		int count=0;
		
		for(int i=0; i<=s1.length()-1; i++)
		{
			char Ch = s1.charAt(i);
			if(Ch==' ')
			{
				count++;
			}	
		}
		System.out.println(count);
	}
}
