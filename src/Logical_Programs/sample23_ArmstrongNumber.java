package Logical_Programs;

public class sample23_ArmstrongNumber 
{
	public static void main(String[] args) 
	{
		int num=374;
		int sum=0;
		
		for(int i=num; i>0; i=i/10)
		{
			int rem= i % 10;
			sum=sum+(rem*rem*rem);
		}
		
		if(sum==num)
		{
			System.out.println("Given number is a Armstrong number.");
		}
		else
		{
			System.out.println("Given number is not a Armstrong number.");
		}
	}
	
}
