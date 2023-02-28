package Star_pattern;

public class sample5 
{
	public static void main(String[] args) 
	{
		//*      //*
		//**     //**
		//***    //***
		//**     //**
		//*      //*
		
		int star=1; // 2, 3 --  2, 1, 0
		//           6<=5
		for(int i=1; i<=5; i++)
			
		{//               2<=1
			for(int j=1; j<=star; j++)
			{
				System.out.print("*");
			}
			System.out.println();
			
			 //5<3
			if(i<3)
			{
				star++;
			}
			else
			{
				star--;
			}
			
		}
		
	}
	
}
