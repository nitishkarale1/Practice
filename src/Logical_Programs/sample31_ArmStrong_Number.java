package Logical_Programs;

public class sample31_ArmStrong_Number
{
	public static void main(String[] args) 
	{
		int num1=153;
		int num2=0;    //  27  147  
		
		for(int i=num1; i>0; i=i/10)
		{
			int rem=i % 10;
			num2=num2+(rem*rem*rem);
		}
		System.out.println(num2);
		
		if(num1==num2)
		{
			System.out.println("Given number "+num1+" is a Armstrong number.");
		}
		else
		{
			System.out.println("Given number "+num1+" is not a ArmStrong number.");
		}
		
	}
}
