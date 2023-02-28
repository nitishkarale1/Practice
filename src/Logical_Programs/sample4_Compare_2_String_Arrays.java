


package Logical_Programs;

import java.util.Arrays;

public class sample4_Compare_2_String_Arrays 
{
	public static void main(String[] args) 
	{
		String A[]= {"akash","sagar","prasad","mahesh"};
		String B[]= {"akash","Sagar","mahesh","prasad"};
		String C[]= {"akash","sagar","prasad","mahesh"};
		
		System.out.println(Arrays.equals(A, B));
		System.out.println(Arrays.equals(A, C));
		System.out.println(Arrays.equals(B, C));
		
	}
}
