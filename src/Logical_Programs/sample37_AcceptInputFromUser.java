package Logical_Programs;

import java.util.Scanner;

public class sample37_AcceptInputFromUser 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Name: ");
		
		Scanner scan=new java.util.Scanner(System.in);
		String str=scan.next();
		System.out.println(str+" Karale");
		
		System.out.println("Enter Number: ");
		int num=scan.nextInt();
		System.out.println(num+num);
	}
	
}
