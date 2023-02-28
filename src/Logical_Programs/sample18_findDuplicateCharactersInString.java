package Logical_Programs;

import java.util.HashMap;
import java.util.Set;

public class sample18_findDuplicateCharactersInString
{
	public static void main(String[] args) 
	{
		String str="nitish";
	
		HashMap<Character, Integer> mp = new HashMap<Character,Integer>();
		
		for(int i=0; i<=str.length()-1; i++)
		{
			char s1 = str.charAt(i);
			if(mp.containsKey(s1))
			{
				mp.put(s1, mp.get(s1)+1);
			}
			else
			{
				mp.put(s1, 1);
			}
		}
		
		Set<Character> keys = mp.keySet();
		for(Character key:keys)
		{
			if(mp.get(key)>1)
			{
				System.out.println(key+": "+mp.get(key));
			}
		}
	}
	
}
