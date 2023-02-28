package Logical_Programs;

public class sample43_Fact_of_Number 
{
	public static void main(String[] args)
	{
		int num=8;
		int fact=1;
		
		for(int i=num; i>=1; i--)
		{
			fact = fact * i;
		}
		
		System.out.println(fact);
	}
	
}
