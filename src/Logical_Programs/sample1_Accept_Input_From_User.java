package Logical_Programs;

import java.util.Scanner;

public class sample1_Accept_Input_From_User 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter num: ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int num1=sc.nextInt();
		
		int num2=num1 * num;
		
		System.out.println(num2);
	}
	
}
