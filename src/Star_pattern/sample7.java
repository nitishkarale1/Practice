package Star_pattern;

public class sample7 
{
	public static void main(String[] args) 
	{
		//*****
		// ****
		//  ***
		//   **
		//    *
		//   **
		//  ***
		// ****
		//*****
		
		int star=5;
		int space=0;
		
		for(int i=1; i<=9; i++)
		{
			for(int j=1; j<=space; j++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=star; j++)
			{
				System.out.print("*");
			}
			System.out.println();
			
			if(i<5)
			{
				space++;
				star--;
			}
			else
			{	
				space--;
				star++;
			}
		}
		
		
	}
	
}
