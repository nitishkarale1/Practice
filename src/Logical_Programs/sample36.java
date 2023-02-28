package Logical_Programs;

public class sample36 
{
	public static void main(String[] args) 
	{
		int vCount=0;
		int cCount=0;
		
		String str="ae gh ioa fk ui mpln";
		
		//str=str.toLowerCase();
		
		String []ar=str.split(" ");
		for(int a=0; a<=ar.length-1; a++)
		{
			System.out.println(ar[a]);
		}
		
		System.out.println("-_-_-_-_-_-_-_-_-_-_-_-");
	
		for(int i=0; i<str.length(); i++)
		{	
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
			{
				vCount++;
			}
			else if(str.charAt(i)>='a' & str.charAt(i)<='z') 
			{
				cCount++;
			}
		}
		
		if(vCount==cCount)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		
		
		System.out.println("Vowels count: "+vCount);
		System.out.println("Consonant count: "+cCount);
		
	}
	
}
