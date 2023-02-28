package Logical_Programs;

import java.util.HashMap;
import java.util.Set;

public class demo 
{
	public static void main(String[] args) 
	{
		HashMap<String, Integer> hs=new HashMap<String, Integer>();
		
		hs.put("Rahul", 101);
		hs.put("Sagar", 102);
		hs.put("Akash", 103);
		hs.put("Akshay", 104);
		
		System.out.println(hs.containsKey("Akash"));
		System.out.println(hs.get("Sagar"));
		
		Set<String> allKeys = hs.keySet();
		System.out.println(allKeys);
		
		for(String key:allKeys)
		{
			System.out.println(key+" "+(hs.get(key)));
		}
		
	}
	
}
