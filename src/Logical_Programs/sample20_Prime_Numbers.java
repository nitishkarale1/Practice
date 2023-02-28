package Logical_Programs;

import java.util.Scanner;

public class sample20_Prime_Numbers 
{
	public static void main (String [] args)
	{
		System.out.println("Enter number: ");
		Scanner sc=new Scanner(System.in);
		int X=sc.nextInt();
		int count=0;
		
		for(int i=2; i<X; i++)
		{
			if(X % i==0)
			{
				count++;
				break;
			}
		}
		
		if(count==1)
		{
			System.out.println("the given number is not a prime number.");
		}
		else
		{
			System.out.println("the given number is a prime number.");
		}
		
	}
}
