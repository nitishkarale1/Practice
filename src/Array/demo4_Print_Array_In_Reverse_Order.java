package Array;

public class demo4_Print_Array_In_Reverse_Order 
{
	public static void main(String[] args) 
	{
		int A []=new int[5];
		
		A[0]=5;
		A[1]=4;
		A[2]=3;
		A[3]=2;
		A[4]=1;
		
		for (int i=A.length-1; i>=0; i--)
		{
			System.out.println(A[i]);
		}
		
	}
	
}
