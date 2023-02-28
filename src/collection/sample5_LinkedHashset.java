package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class sample5_LinkedHashset 
{
	public static void main(String[] args) 
	{
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add("nitish");
		lhs.add(101);
		lhs.add(101);
		lhs.add("pratik");
		lhs.add("sagar");
		lhs.add(null);
		lhs.add(null);
		
		System.out.println(lhs);
		System.out.println(lhs.contains(101));
		System.out.println(lhs.isEmpty());
		System.out.println(lhs.size());
		lhs.remove(3);
		System.out.println(lhs);
		
		System.out.println("--print all data using Iterator cursor--");
		
		Iterator lhsitr = lhs.iterator();
		while(lhsitr.hasNext())
		{
			System.out.println(lhsitr.next());
		}
		
		System.out.println("--pint all data using for each loop--");
		
		for(Object lh1:lhs)
		{
			System.out.println(lh1);
		}
		
		
	}
	
}
