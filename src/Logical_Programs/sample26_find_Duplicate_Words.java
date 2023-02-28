package Logical_Programs;

import java.util.HashMap;
import java.util.Set;

public class sample26_find_Duplicate_Words 
{
	public static void main(String[] args) 
	{
		String str="ab st ab abcd st abc st pqr ab";
		String[] ar = str.split(" ");
		
		HashMap<String, Integer> mp=new HashMap<String, Integer>();
		
		for(int i=0; i<=ar.length-1; i++)
		{
			String s1= ar[i];
			if(mp.containsKey(s1))
			{
				mp.put(s1, mp.get(s1)+1);
			}
			else
			{
				mp.put(s1, 1);
			}
		}
		
		Set<String>keys=mp.keySet();
		for(String key:keys)
		{
			if(mp.get(key)>1)
			{
				System.out.println("Duplicate words: "+key+": "+mp.get(key));
			}
		}
	}
	
}
