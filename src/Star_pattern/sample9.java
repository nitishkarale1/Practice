package Star_pattern;

public class sample9 
{
	public static void main(String[] args) 
	{
		int space=6;
		int star=1;
		
		for(int i=1; i<=7; i++)
		{
			for(int j=1; j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=star; j++)
			{
				System.out.print("*");
			}
			System.out.println();
			
			if(i<4)
			{
				star=star+4;
				space=space-2;
			}
			else
			{
				star=star-4;
				space=space+2;
			}
		}
		
	}
	
}
