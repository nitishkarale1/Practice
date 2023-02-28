package LogicalPrograms1;

public class sample3_primeNumbers 
{
	public static void main(String[] args) 
	{
		int num=18;
		int count=0;
		
		for(int i=2; i<num; i++)
		{
			if(num % i==0)
			{
				count++;
				break;
			}
			
		}
		if(count==1)
		{
			System.out.println("given no. "+num+" is not a Prime no.");
		}
		else
		{
			System.out.println("given no. "+num+" is a Prime no.");
		}
	}
	
}
