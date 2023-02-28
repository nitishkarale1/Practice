package Star_pattern;

public class sample6
{
	public static void main(String[] args) 
	{
		//*           
		//**          
		//***         
		//****        
		//*****      
		//****        
		//***
		//**
		//*
		
		int star=1; // 2, 3, 4, 5, 4, 3, 2, 1, 0         //*
		//          i=5  i<=9                            //**
			for(int i=1; i<=9; i++)                      //***
			{ //        j=  j<=5                         //****
				for(int j=1; j<=star; j++)               //*****
				{                                        //****
				System.out.print("*");                   //***
				}                                        //**
			System.out.println();                        //*
			
			// i<5
			if(i<5)
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
