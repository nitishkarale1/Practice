package LogicalPrograms1;

import java.util.HashMap;
import java.util.Set;

public class sample6_FindDuplicateCharactersFromString 
{
	public static void main(String[] args) 
	{
		String s1="Aurangabad";
		String s2=s1.toLowerCase();
		
		HashMap<Character, Integer> hs=new HashMap<Character, Integer>();
		
		for(int i=0; i<=s1.length()-1; i++)
		{
			char ch=s1.charAt(i);
			
			if(hs.containsKey(ch))
			{
				hs.put(ch, (hs.get(ch)+1));
			}
			else
			{
				hs.put(ch, 1);
			}
		}
		
		Set<Character>allKeys=hs.keySet();
		for(char key:allKeys)
		{
			if(hs.get(key)>1)
			{
				System.out.println(key+": "+hs.get(key));
			}
				
		}
		
	}
	
}
