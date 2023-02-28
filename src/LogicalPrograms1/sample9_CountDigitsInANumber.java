package LogicalPrograms1;

public class sample9_CountDigitsInANumber 
{
	public static void main(String[] args) 
	{
		int num=123;
		int count=0;
		
//		for(int i=num; i>0; i=i/10)
//		{
//			count++;
//		}
//		System.out.println(count);
		
		while(num>0)
		{
			num=num/10;
			
			count++;
		}
		System.out.println(count);
		
	}
	
}
