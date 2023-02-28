package Logical_Programs;

import java.util.HashMap;
import java.util.Set;

public class demo1
{
	public static void main(String[] args) 
	{
		String org="aurangabad";
		
		HashMap<Character, Integer> hs=new HashMap<Character, Integer>();
		
		for(int i=0; i<=org.length()-1; i++)
		{
			char ch = org.charAt(i);
			
			if(hs.containsKey(ch))
			{
				hs.put(ch, (hs.get(ch)+1));
			}
			
			else
			{                      //a 3
				hs.put(ch, 1);     //b 2
			}
		}
		
		Set<Character> allKeys = hs.keySet();
		
		for(Character key:allKeys)
		{
			if(hs.get(key)>1)
			{
				System.out.println(key+":"+hs.get(key));
			}
			
		}
		
	}
	
}
