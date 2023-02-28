package Logical_Programs;

public class sample21_CountDigitsInANumber
{
	public static void main(String[] args)
	{
		int num=123456;
		int count=0;
	
//		for(int i=num; i>0; i=i/10)
//		{
//			count++;
//		}
//		System.out.println(count);
//		
//		System.out.println("-----------------------");
//		
//		while(num>0)
//		{
//			num=num/10;
//			count++;
//		}
//		System.out.println(count);
//		
		
		System.out.println("-----------------------");
		String OrgNum = Integer.toString(num);
		
		for(int i=0; i<=OrgNum.length()-1; i++)
		{
			count++;
//			if(i>=0)
//			{
//				count++;
//			}
		}
		System.out.println(count);
	}
	
}
