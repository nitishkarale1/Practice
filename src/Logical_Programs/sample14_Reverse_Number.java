package Logical_Programs;

public class sample14_Reverse_Number 
{
	public static void main(String[] args)
	{
		int Org=112233;
		
		String S1 = Integer.toString(Org);
		
		 String Rev = "";
		
		for(int i=S1.length()-1; i>=0; i--)
		{
			Rev=Rev+ S1.charAt(i);
		}
		int RevNum = Integer.parseInt(Rev);
		System.out.println(RevNum);
		
	}
}
