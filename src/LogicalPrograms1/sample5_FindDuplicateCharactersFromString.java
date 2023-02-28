package LogicalPrograms1;

import java.util.HashMap;
import java.util.Set;

public class sample5_FindDuplicateCharactersFromString
{
	private static final int HashMap = 0;

	public static void main(String[] args) 
	{
		String str="little";
		
		HashMap<Character, Integer> hs=new HashMap<Character, Integer>();
		
		for(int i=0; i<=str.length()-1; i++)
		{
			char ch = str.charAt(i);
			
			if(hs.containsKey(ch))
			{
				hs.put(ch, (hs.get(ch)+1));
			}
			else
			{
				hs.put(ch, 1);
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
