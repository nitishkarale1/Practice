package Logical_Programs;

import java.util.HashMap;
import java.util.Set;

public class sample46_find_Duplicate_Words 
{
	public static void main(String[] args)
	{
		String str="abc bc ab abc def cd bc abc";
		
		String [] ar=str.split(" ");
		
		HashMap<String, Integer> hs=new HashMap<String, Integer>();
		
		for(int i=0; i<=ar.length-1; i++)
		{
			String s1=ar[i];
			
			if(hs.containsKey(s1))
			{
				hs.put(s1, hs.get(s1)+1);
			}
			else
			{
				hs.put(s1, 1);
			}
		}
		
		Set<String> allKeys = hs.keySet();
		
		for(String s2:allKeys)
		{
			if(hs.get(s2)>1)
			{
				System.out.println(s2+": "+hs.get(s2));
			}
		}
		
		
	}
	
}
