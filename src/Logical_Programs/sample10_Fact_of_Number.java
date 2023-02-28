package Logical_Programs;

import java.util.Scanner;

public class sample10_Fact_of_Number 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Number: ");
		
		Scanner scan=new Scanner(System.in);
		int num = scan.nextInt();
		
		int fact=1;  
		
		for(int i=num; i>=1; i--)
		{
			fact=fact*i;    
		}
		System.out.println(fact);
		
	}
}
