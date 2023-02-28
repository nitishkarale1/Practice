package LogicalPrograms1;

public class demo1_countAndCheckVowelsPresentOrNot
{
	public static void main(String[] args)
	{
		String s1="welcome";
		int count=0;
		
		for(int i=0; i<=s1.length()-1; i++)
		{
			char ch=s1.charAt(i);
			
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				count++;
				System.out.print(ch+", ");
			}
			
		}
		System.out.println();
		System.out.println("vowels count: "+count);
	}
	
}
