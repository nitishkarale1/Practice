package Logical_Programs;

public class sample50_Armstrong_no_from_1_to_10000 
{
	public static void main(String[] args) 
	{
		int num=10000;
		int rem=0;
		int sum=0;
		
		System.out.println("~Armstrong No. from 1 to 10000~");
		
		for(int i=1; i<=num; i++)
		{	
			//if(i<=999)
			{
				for(int j=i; j>0; j=j/10)
				{
					rem=j % 10;
					sum=sum+(rem*rem*rem);
				}
				
				if(sum==i)
				{
					System.out.println(i);
				}
				sum=0;
			}
		
			
//			else if(i>999 & i<9999)
//			{
//				for(int j=i; j>0; j=j/10)
//				{
//					rem=j % 10;
//					sum=sum+(rem*rem*rem*rem);
//				}
//				
//				if(sum==i)
//				{
//				System.out.println(i);
//				}
//				sum=0;
//				
//			}
			
		}
		
//		int num=407;
//		int sum=0;
	//	
//		for(int i=num; i>0; i=i/10)
//		{
//			int rem=0;
//			
//			rem=i % 10;
//			sum=sum+(rem*rem*rem);
//			
//		}
//		if(num==sum)
//		{
//			System.out.println(num+": given no. is an Armstrong No.");
//		}
    }			
}
