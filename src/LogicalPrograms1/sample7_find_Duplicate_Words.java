package LogicalPrograms1;

import java.util.HashMap;
import java.util.Set;

public class sample7_find_Duplicate_Words
{
	public static void main(String[] args) 
	{
		String str="aa bb cc xyz bb ghi cc bb xyz";
		String s1[]=str.split(" ");
		
		HashMap<String, Integer> hs=new HashMap<String, Integer>();
		
		for(int i=0; i<=s1.length-1; i++)
		{
			String s2=s1[i];
			
			if (hs.containsKey(s2))
			{
				hs.put(s2, (hs.get(s2)+1));
			}
			else
			{
				hs.put(s2, 1);
			}
		}
		
		Set<String> allKeys = hs.keySet();
		for(String key:allKeys)
		{
			if(hs.get(key)>1)
			{
				System.out.println(key+": "+hs.get(key));
			}
		}
		
	}
	
}
