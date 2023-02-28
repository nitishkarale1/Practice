package Array;

import java.util.Arrays;

public class demo9_MultidimensionalArray_Declaration_initialization_in_Single_Step 
{
	public static void main(String[] args) 
	{
		int A[][]= {{10,30,20,40},{50,70,60,80},{100,120,110,90}};
		
		System.out.println(A[2][1]);
		System.out.println(A.length);
		
		System.out.println("---print all data from Array---");
		
		for(int i=0; i<=2; i++)
		{
			for(int j=0; j<=3; j++)
			{
				System.out.print(A[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
}
