package Logical_Programs;

import java.util.Arrays;

public class sample2_compare_2_Integer_Arrays 
{
	
	public static void main(String[] args) 
	{
		
		int ar1[]= {10,20,30,40};
		int ar2[]= {20,30,50,10};
		int ar3[]= {10,20,30,40};
		
		System.out.println(Arrays.equals(ar1, ar2));

		System.out.println(Arrays.equals(ar2, ar3));
		
		System.out.println(Arrays.equals(ar1, ar3));
		
	}
}
