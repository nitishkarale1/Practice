
package Exception_Handling;
public class sample2 
{
	public static void main(String[] args) 
	{
		int [] ar=new int [5];
		ar[0]=50;
		ar[1]=60;
		ar[2]=70;
		ar[3]=80;
		ar[4]=90;
		
		
		try
		{
			ar[5]=100;
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException Handled");
		}
		
		System.out.println(ar[2]);
		
	}
	
}
