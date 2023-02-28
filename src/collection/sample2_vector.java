package collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class sample2_vector 
{
	public static void main(String[] args)
	{
		Vector V=new Vector();
		
		V.add("nitish");
		V.add("rahul");
		V.add("pooja");
		V.add("rutuja");
		V.add("rutuja");
		V.add("akash");
		V.add("pratik");
		V.add("arpita");
		V.add(null);
		V.add(null);
		V.add("piyush");
		
		System.out.println(V.capacity());
		System.out.println(V.isEmpty());
		System.out.println(V.contains("nitish"));
		V.set(8, "prakash");
		System.out.println(V.capacity());
		V.remove(9);
		
		System.out.println("--print all data using iterator cursor--");
		
		Iterator Vitr = V.iterator();
		while(Vitr.hasNext())
		{
			System.out.println(Vitr.next());
		}
		
		System.out.println("--print all data using ListIterator cursor--");
		
		ListIterator Litr = V.listIterator();
		while(Litr.hasNext())
		{
			System.out.println(Litr.next());
		}
		
		System.out.println("--print all data using Enumeration cursor--");
		
		Enumeration enu = V.elements();
		while(enu.hasMoreElements())
		{
			System.out.println(enu.nextElement());
		}
		
		
		
		
	}
}
