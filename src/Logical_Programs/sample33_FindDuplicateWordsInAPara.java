package Logical_Programs;

import java.util.HashMap;
import java.util.Set;

public class sample33_FindDuplicateWordsInAPara 
{
	public static void main(String[] args) 
	{
		String str="rutuja nitish pooja arpita pratik rutuja pooja";
		String[] ar = str.split(" ");
			
		HashMap<String, Integer> mp=new HashMap<String, Integer>();
		
		for(int i=0; i<=ar.length-1; i++)
		{
			String str1 = ar[i];
			
			if (mp.containsKey(str1))
			{
				mp.put(str1, mp.get(str1)+1);
			}
			else
			{
				mp.put(str1, 1);
			}
			
		}
		
		Set<String> keys = mp.keySet();
		for(String key:keys)
		{
			if (mp.get(key)>1) 
			{
				System.out.println(key+": "+mp.get(key));
			}
		}
		
	}
	
}