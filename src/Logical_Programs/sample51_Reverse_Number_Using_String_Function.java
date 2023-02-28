package Logical_Programs;

public class sample51_Reverse_Number_Using_String_Function
{
	public static void main(String[] args)
	{	
		int orgNum = 112233;
		String org = Integer.toString(orgNum);  //convert number to string

		String rev ="";
		for (int i = org.length() - 1; i >= 0; i--) 
		{
			rev = rev + org.charAt(i);
		}
		System.out.println(rev);
		
		int revNum = Integer.parseInt(rev);
		//System.out.println(revNum);
		
		System.out.println(orgNum+revNum);
		
	}
	
}
