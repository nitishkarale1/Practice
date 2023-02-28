package LogicalPrograms1;

import java.util.HashMap;
import java.util.Set;

public class demo1 
{
	public static void main(String[] args) 
	{
		String s = "a ab ab abc abc abc";
		String ar[] = s.split(" ");
		
		HashMap <String,Integer> map = new HashMap <String,Integer>();
		
		for(int i=0; i<=ar.length-1; i++)
		{
			String s2=ar[i];
			
			if (map.containsKey(s2))
			{
				map.put(s2, (map.get(s2)+1));
			}
			else
			{
				map.put(s2, 1);
			}
		}
		
		Set <String> AllKeys = map.keySet();
		for(String key : AllKeys)
		{
			if (map.get(key)>1) 
			{
				System.out.println(key+" : "+map.get(key));
			}
		}

		
	}
	
}
