package Array;

public class demo3_Char_Array 
{
	public static void main(String[] args) 
	{
		char [] ch=new char [4];
		
		ch[0]='F';
		ch[1]='A';
		ch[2]='D';
		ch[3]='B';
		
		System.out.println(ch[2]);
		System.out.println(ch.length);
		
		System.out.println("---print all data from char Array---");
		
		for(int i=0; i<=ch.length-1; i++)
		{
			System.out.println(ch[i]);
		}
		
	}
	
}
