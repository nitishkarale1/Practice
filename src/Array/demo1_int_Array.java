package Array;

public class demo1_int_Array
{
	public static void main(String[] args) 
	{
		//array declaration
		
		int [] ar=new int[7];
		
		//array initialization
		
		ar[0]=100;
		ar[1]=500;
		ar[2]=300;
		ar[3]=200;
		ar[4]=400;
		ar[5]=600;
		ar[6]=700;
		//array usage
		
		System.out.println(ar[6]);
		System.out.println(ar.length);
		
		System.out.println("---print all data from int array---");
		
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}
		
		
	}
	
}
