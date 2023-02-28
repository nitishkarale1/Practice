package Logical_Programs;

import java.util.Scanner;

public class sample9_find_even_no_from_1_to_100 
{
	public static void main(String[] args)
	{
//		System.out.println("Enter Number: ");
//		Scanner scan=new Scanner(System.in);
//		int num1 = scan.nextInt();
		
		int num1=100;
		
		for (int i=1; i<=num1; i++ )
		{
			if (i % 2 == 0)
			{
				System.out.print(i+"," + " ");
			}	
			
		}
		
	}
	
}
