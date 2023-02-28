package Logical_Programs;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class sample30_FindDuplicateCharactersFromString 
{
	public static void main(String [] args)
	{
		System.out.println("Enter Name: ");
		
		Scanner scan=new Scanner(System.in);
		String Name=scan.next();
		
		HashMap<Character, Integer> mp=new HashMap<Character, Integer>();
		
		for(int i=0; i<=Name.length()-1; i++)
		{
			char ch=Name.charAt(i);
			if(mp.containsKey(ch))
			{
				mp.put(ch, mp.get(ch)+1);
			}
			else
			{
				mp.put(ch, 1);
			}
		
		}
		
		Set<Character> keys = mp.keySet();
		for(char key:keys)
		{
			if (mp.get(key)>1)
			{
				System.out.println(key+": "+mp.get(key));
			}
		}
		
	}

}
