package Logical_Programs;

import java.util.Arrays;

public class sample38_Compare_two_Integer_Arrays 
{
	public static void main(String [] args)
	{
		int [] ar1= {10,20,30,40};
		int [] ar2= {40,50,60,70};
		int [] ar3= {10,20,30,40};
		
		System.out.println(Arrays.equals(ar1, ar2));
		System.out.println(Arrays.equals(ar2, ar3));
		System.out.println(Arrays.equals(ar1, ar3)); //data or info comparison
		
		System.out.println(ar1==ar3); //address comparison
	}
		
}
