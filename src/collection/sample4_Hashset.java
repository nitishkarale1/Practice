package collection;

import java.util.HashSet;
import java.util.Iterator;

public class sample4_Hashset 
{
	public static void main(String[] args) 
	{
		HashSet hs=new HashSet();
		hs.add("A");
		hs.add("B");
		hs.add("C");
		hs.add(105);
		hs.add("A");
		hs.add(null);
		hs.add(null);
		
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.contains(105));
		System.out.println();hs.isEmpty();
		hs.remove(105);
		System.out.println(hs);
		
		System.out.println("--print all data using Iterator cursor--");
		
		Iterator hsitr = hs.iterator();
		while(hsitr.hasNext())
		{
			System.out.println(hsitr.next());
		}
		
	}
	
}
