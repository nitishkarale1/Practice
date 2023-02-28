package Star_pattern;

public class sample14 
{
	public static void main(String[] args) 
	{	
		// 12345
		// 1234
		// 123
		// 12
		// 1
		
		int rows=5;
		//        5
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=rows-i+1; j++)
			{
				System.out.print(j);
			}	
			System.out.println();
		}
		
	}
	
}
