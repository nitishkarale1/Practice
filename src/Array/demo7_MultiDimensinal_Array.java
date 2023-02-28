package Array;

public class demo7_MultiDimensinal_Array 
{
	public static void main(String[] args) 
	{
		int [][] A=new int[2][3];
		
		A[0][0]=20;
		A[0][1]=40;
		A[0][2]=10;
		A[1][0]=30;
		A[1][1]=60;
		A[1][2]=50;
		
		System.out.println(A[0][2]);
		System.out.println(A.length);
		
		System.out.println("---Print all data from Array---");
		
		for(int i=0; i<=1; i++)
		{
			for(int j=0; j<=2; j++)
			{
				System.out.print(A[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
}
