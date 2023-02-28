package Logical_Programs;

import java.util.Arrays;
import java.util.Scanner;

public class sample3_Accept_Input_From_User 
{
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter first name:");
		String S1 = scan.next();
		
		System.out.println("enter second name:");
		String S2 = scan.next();
		
		System.out.println(S1.equals(S2));
		
	}
}
