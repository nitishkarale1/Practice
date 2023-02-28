package Array;

import java.util.Arrays;

public class demo5_Array_Sorting
{
	public static void main(String[] args)
	{
		int A[]=new int[4];
		A[0]=300;
		A[1]=100;
		A[2]=400;
		A[3]=200;
		
		Arrays.sort(A);
		
		System.out.println("---print all data in Ascending order---");
		
		for(int i=0; i<=A.length-1; i++) 
		{
			System.out.println(A[i]);
		}
		
		System.out.println("---print all data in Descending order---");
		
		for(int i=A.length-1; i>=0; i--)
		{
			System.out.println(A[i]);
		}
	}
	
}
