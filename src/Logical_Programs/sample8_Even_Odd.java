package Logical_Programs;

import java.util.Scanner;

public class sample8_Even_Odd 
{
	
	public static void main(String[] args) 
	{
		System.out.println("Enter Number: ");
		
		Scanner scan=new Scanner(System.in);
		int num1 = scan.nextInt();
	
		if (num1 % 2 == 0)
		{
			System.out.println("Given Number Is Even.");
		}
		else
		{
			System.out.println("Given Number Is Odd");
		}	
		
	}
}
