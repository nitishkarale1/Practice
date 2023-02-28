package LogicalPrograms1;

public class sample13_array_sort 
{
	public static void main(String[] args) 
	{
		int [] ar = new int [] {87,55,32,12,95};
		int temp;
		
		for(int i=0; i<=ar.length-1; i++)
		{
			for(int j=i+1; j<=ar.length-1; j++)
			{
				if(ar[j] < ar[i])
				{
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
				
			}
			
		}
		
		for(int a:ar)
		{
			System.out.print(a+" ");
		}
	}
	
}
