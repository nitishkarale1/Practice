package LogicalPrograms1;

public class sample4_ArmStrongNumber 
{
	public static void main(String[] args) 
	{
		int num1=370;
		int num2=0;
		
		for(int i=num1; i>0; i=i/10)
		{
			int rem=i%10;
			num2=num2+(rem*rem*rem);
		}
		System.out.println(num2);
		
		if(num1==num2)
		{
			System.out.println("given no. "+num1+" is a Armstrong no.");
		}
		else
		{
			System.out.println("given no. "+num1+" is a Armstrong no.");
		}
		
	}
	
}
