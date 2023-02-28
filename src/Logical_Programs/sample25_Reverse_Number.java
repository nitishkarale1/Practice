package Logical_Programs;

public class sample25_Reverse_Number
{
	public static void main(String [] args)
	{
		int num1=1234;
		String num2 = Integer.toString(num1);
		
		String num="";
		
		for(int i=num2.length()-1; i>=0; i--)
		{
			num=num+num2.charAt(i);
		}
		System.out.println(Integer.parseInt(num));
	}
}
