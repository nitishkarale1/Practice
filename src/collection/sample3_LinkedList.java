package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class sample3_LinkedList 
{
	public static void main(String[] args) 
	{
		LinkedList ll=new LinkedList();
		ll.add("A");
		ll.add("C");
		ll.add(121.5f);
		ll.add("A");
		ll.add("F");
		ll.add(null);
		ll.add(null);
		
		System.out.println(ll);
		System.out.println(ll.contains("C"));
		System.out.println(ll.isEmpty());
		ll.remove("F");
		System.out.println(ll.get(3));
		ll.set(2, 155.75f);
		System.out.println(ll);
		System.out.println(ll.size());
		
		System.out.println("--print all data using Iterator cursor--");
		Iterator llitr = ll.iterator();
		while(llitr.hasNext())
		{
			System.out.println(llitr.next());
		}
		
		System.out.println("--print all data using List Iterator cursor--");
		
		ListIterator llitr1 = ll.listIterator();
		while(llitr1.hasNext())
		{
			System.out.println(llitr1.next());
		}
		
		
		
	}
	
}
