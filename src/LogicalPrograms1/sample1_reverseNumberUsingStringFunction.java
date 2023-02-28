package LogicalPrograms1;

public class sample1_reverseNumberUsingStringFunction 
{
	public static void main(String[] args) 
	{
		int orgNum=9876;
		
		String num=Integer.toString(orgNum);
		String rev="";
		
		for(int i=num.length()-1; i>=0; i--)
		{
			rev=rev+num.charAt(i);
		}
		int revNum=Integer.parseInt(rev);
		System.out.println(revNum);
	}
	
}
