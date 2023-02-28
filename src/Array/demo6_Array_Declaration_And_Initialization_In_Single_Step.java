package Array;

import java.util.Arrays;

public class demo6_Array_Declaration_And_Initialization_In_Single_Step 
{
	public static void main(String[] args)
	{
		String [] A= {"rahul","nitish","rutuja","pooja","akash"};
		
		System.out.println(A.length);
		System.out.println(A[2]);
		
		Arrays.sort(A);
		
		String S = Arrays.toString(A);
		System.out.println(S);
		
		System.out.println("--print all data from Array--");
		
		for(int i=0; i<=A.length-1; i++)
		{
			System.out.println(A[i]);
		}
		
	}
	
}
