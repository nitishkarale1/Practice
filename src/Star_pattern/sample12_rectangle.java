package Star_pattern;

public class sample12_rectangle
{
	public static void main(String[] args) 
	{
		// *****
		// *   *
		// *   *
		// *****
		
		int rows=4;
		int cols=5;
		
		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=cols; j++)
			{
				if(i==1 || j==1 || i==rows || j==cols)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
	
}
