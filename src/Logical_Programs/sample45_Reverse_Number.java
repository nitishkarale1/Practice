package Logical_Programs;

public class sample45_Reverse_Number 
{
	public static void main(String[] args) 
	{
		int num1=123456789;
		
		String num2=Integer.toString(num1);
		String num3="";
		
		for(int i=num2.length()-1; i>=0; i--)
		{
			num3=num3+num2.charAt(i);
		}
		System.out.println(Integer.parseInt(num3));
	
	}
	
}
