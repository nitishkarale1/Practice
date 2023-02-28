package Logical_Programs;

import java.util.Scanner;

public class sample16_Prime_number 
{
	public static void main(String[] args) 
	{
		int A=19;
		int B=0;
		
		for(int i=2; i<A; i++)
		{
			if(A % i==0) 
			{
				B++;
				break;
			}
			
		}
		
		if(B==1)
		{
			System.out.println(A+" is not a prime number.");
		}
		else
		{
			System.out.println(A+" is a prime number.");
		}
		
	}
	
}
