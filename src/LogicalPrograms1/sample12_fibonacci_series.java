package LogicalPrograms1;

public class sample12_fibonacci_series
{
	public static void main(String[] args) 
	{
		int num1=0;
		int num2=1;
		int num3;
		
//		System.out.println(num1);
//		System.out.println(num2);
		for(int i=3; i<=10; i++)
		{
			num3=num1+num2;
			System.out.println(num3);
			num1=num2;
			num2=num3;
		}
		
	}
	
}
