package LogicalPrograms1;

import java.util.HashMap;
import java.util.Set;

public class demo_findFirstNonRepeatedCharacter 
{
	static public void main(String[] args) 
	{
		String str="imagine";
		
		HashMap<Character, Integer> hs=new HashMap<Character, Integer>();
		
		for(int i=0; i<=str.length()-1; i++)
		{
			char ch=str.charAt(i);
			
			if (hs.containsKey(ch))
			{
				hs.put(ch, hs.get(ch)+1);
			}
			else
			{
				hs.put(ch, 1);
			}
			
		}
		
		for(int i=0; i<=str.length()-1; i++)
		{
			char ch=str.charAt(i);
			
			if(hs.get(ch)==1)
			{
				System.out.println(ch);
				break;
			}
			
		}
		
	}
	
}
