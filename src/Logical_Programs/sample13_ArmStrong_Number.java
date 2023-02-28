package Logical_Programs;

import java.util.Scanner;

public class sample13_ArmStrong_Number
{
	
	public static void main(String[] args) 
	{
		System.out.print("Enter number: ");
		
		Scanner SC=new Scanner(System.in);
		int num1 = SC.nextInt();
		
		int num2=0;
		
		for (int i=num1; i>0; i=i/10) 
		{
			int rem=i % 10;
			num2=num2+(rem*rem*rem);
		}
		
		if(num1==num2)
		{
			System.out.println("given number "+num1+" is a Armstrong number.");
		}
		else
		{
			System.out.println("given number "+num1+" is not a Armstrong number.");
		}
		
		
		
		
		
		
		
//		String S1="nk  ke sdv cd ss  f";
//		
//		int spaces=0;
//		
//		for(int i=0; i<=S1.length()-1; i++)
//		{
//			char ch = S1.charAt(i);
//			if(ch==' ')
//			{
//				spaces++;
//			}
//		}
//		System.out.println(spaces);
	}
}
