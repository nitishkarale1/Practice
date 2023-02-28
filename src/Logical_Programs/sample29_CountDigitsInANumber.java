package Logical_Programs;

public class sample29_CountDigitsInANumber 
{
	int num1;
	int num2;
	
	sample29_CountDigitsInANumber(int a, int b)
	{
		num1=a;
		num2=b;
	}
	
	public void Addition()
	{
		int sum=num1+num2;
		System.out.println(sum);
	}
	
	
	public static void main(String[] args) 
	{
		sample29_CountDigitsInANumber Add=new sample29_CountDigitsInANumber(15,20);
		Add.Addition();
		
		
		int num=155324;
		int count=0;
		
		
		for(int i=num; i>0; i=i/10)
		{
			count++;
		}
		System.out.println(count);
		
	}
	
}
