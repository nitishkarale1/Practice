package Logical_Programs;

public class sample15_Reverse_Number_Without_StringFunction 
{
	public static void main(String[] args) 
	{
		int num=121;
		int rev=0;
		
		for(int i=num; i>0; i=i/10)
		{
			int rem=i % 10;
			rev=rev*10+rem;
		}
		System.out.println(rev);
		if(num==rev)
		{
			System.out.println("given number is pallindrome number.");
		}
		else 
		{
			System.out.println("given number is not pallindrome number.");
	
		}
		
	}
}
