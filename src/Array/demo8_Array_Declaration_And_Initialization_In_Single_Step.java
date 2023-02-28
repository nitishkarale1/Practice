package Array;

import java.util.Arrays;

public class demo8_Array_Declaration_And_Initialization_In_Single_Step 
{
	public static void main(String[] args) 
	{
		int D[]= {50,30,10,20,40};
		
		System.out.println(D.length);
		System.out.println(D[2]);
		
		System.out.println("---print all data from Array---");
		
		Arrays.sort(D);
		
		for(int i=0; i<=D.length-1; i++)
		{
			System.out.println(D[i]);
		}
	}
	
}
