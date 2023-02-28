package Logical_Programs;

public class sample32_FindWhiteSpaces 
{
	public static void main(String[] args) 
	{
		String str="ni t  i s h";
		int SpaceCount=0;
		
		for(int i=0; i<=str.length()-1; i++)
		{
			char ch=str.charAt(i);
			
			if(ch==' ')
			{
				SpaceCount++;
			}
		}
		System.out.println(SpaceCount);
		
	}
	
}
