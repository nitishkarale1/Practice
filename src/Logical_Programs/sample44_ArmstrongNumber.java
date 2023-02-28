package Logical_Programs;

public class sample44_ArmstrongNumber 
{
	public static void main(String[] args) 
	{
		int num=155;
		int num1=0;//0, 343, 370
		//         370           
		for(int i=num; i>0; i=i/10)
		{
			int rem=i%10;
			
			num1=num1+(rem*rem*rem);
		}
		
		if(num==num1)
		{
			System.out.println("given number is a ArmStrong number.");
		}
		else
		{
			System.out.println("given number is not a ArmStrong number.");
		}
	}
	
}
