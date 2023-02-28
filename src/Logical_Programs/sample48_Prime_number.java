package Logical_Programs;

public class sample48_Prime_number
{
	public static void main(String[] args) 
	{
		int num=22;
		int count=0;// 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0
		
		//      i=21  i<=22       //2,3,7,11,13,17,19,
		for(int i=2; i<=num; i++)
		{
			//      j=3  3<21
			for(int j=2; j<i; j++)
			{
				// 21%3==0
				if(i%j==0)
				{
					count++;
					break;
				}
			}
			
			if(count==0)
			{
				System.out.println(i);
			}
			else
			{
				count=0;
			}
			
		}
		
		
		
	}
	
}
