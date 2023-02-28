package Logical_Programs;

import java.util.HashMap;
import java.util.Set;

public class sample35_findDuplicateCharachtersInAString 
{
	public static void main(String[] args) 
	{
		String str="indian";
		
		HashMap<Character, Integer> hs=new HashMap<Character, Integer>(); 
		
		for(int i=0; i<=str.length()-1; i++)
		{
			char s1=str.charAt(i);
			
			if(hs.containsKey(s1))
			{
				hs.put(s1, hs.get(s1)+1);
			}
			else
			{
				hs.put(s1, 1);
			}
			
		}
		Set<Character> allKeys = hs.keySet();
		for(Character key:allKeys)
		{
			if(hs.get(key)>1)
			{
				System.out.println(key+": "+hs.get(key));
			}
		}
		
		
		
	}
	
}
