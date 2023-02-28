package Logical_Programs;

import java.util.Scanner;

public class sample11_Armstrong_Number 
{
	public static void main(String[] args)
	{
		System.out.println("Enter Number: ");
		
		Scanner scan=new Scanner(System.in);
		int OrgNum = scan.nextInt();
		
		int sum=0;
		
		for(int i=OrgNum; i>0; i=i/10)
		{
			int rem=i % 10;
			
			sum=sum + (rem*rem*rem);
		}
		if (OrgNum==sum)
		{
			System.out.println("Given number "+OrgNum+" is an Armstrong number");
		}
		else
		{
			System.out.println("Given number "+OrgNum+" is not an Armstrong number");
		}
		
	}
}
