package Logical_Programs;

public class sample34_CountDigitsInANumber 
{
	public static void main(String[] args) 
	{
		int num1=123400;
		int count=0;
		
//		for(int i=num1; i>0; i=i/10)
//		{
//			count++;
//		}
//		System.out.println(count);
		
		
//		while(num1>0) 
//		{
//			num1=num1/10;
//			count++;
//		}
//		System.out.println(count);
		
		
		String num2=Integer.toString(num1);
		
		for(int i=0; i<=num2.length()-1; i++)
		{
			char ch=num2.charAt(i);
			
			if(ch>=0)
			{
				count++;
			}
		}
		System.out.println(count);
	}
	
	
}
