package Logical_Programs;

import java.util.HashMap;
import java.util.Set;

public class sample47_FindDuplicateCharactersFromString 
{
	public static void main(String[] args) 
	{
		String str="level";
		
		HashMap<Character, Integer> hs=new HashMap<Character, Integer>();
		
		for(int i=0; i<=str.length()-1; i++)
		{
			char ch=str.charAt(i);
			
			if(hs.containsKey(ch))
			{
				hs.put(ch, hs.get(ch)+1);
			}
			else
			{
				hs.put(ch, 1);
			}
		}
		
		Set<Character>allKeys=hs.keySet();
		
		for(char ch1:allKeys)
		{
			if(hs.get(ch1)>1)
			{
				System.out.println(ch1+": "+hs.get(ch1));
			}
			
		}
		
	}
	
}
