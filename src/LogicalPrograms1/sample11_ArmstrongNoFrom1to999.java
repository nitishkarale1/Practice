package LogicalPrograms1;

public class sample11_ArmstrongNoFrom1to999 
{
	public static void main(String[] args) 
	{
		int num=999;
		int rem=0;
		int num1=0;
			
		for(int i=1; i<num; i++)
		{
			for(int j=i; j>0; j=j/10)
			{
				rem=j % 10;
				num1=num1+(rem*rem*rem);
				
			}
			if(num1==i)
			{
				System.out.println(num1);
			}
			num1=0;
		}
		
	}
	
}
