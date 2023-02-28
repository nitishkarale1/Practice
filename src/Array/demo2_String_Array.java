package Array;

public class demo2_String_Array 
{
	public static void main(String[] args) 
	{
		String [] ar=new String [5];
		
		ar[0]="Sagar";
		ar[1]="Akash";
		ar[2]="Suyog";
		ar[3]="Swapnil";
		ar[4]="Prasad";
		
		System.out.println(ar[3]);
		System.out.println(ar.length);
		
		System.out.println("---print all data from String Array---");
		
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}
	}
	
}
