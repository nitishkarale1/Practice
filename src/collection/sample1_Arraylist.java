package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class sample1_Arraylist 
{
	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList(5);
		al.add("nitish");
		al.add("rahul");
		al.add("pooja");
		al.add("rutuja");
		al.add("akash");
		al.add("pratik");
		al.add("arpita");
		al.add("rahul");
		al.add(null);
		al.add(null);
		al.add("piyush");
		
		System.out.println(al);
		System.out.println(al.get(4));
		System.out.println(al.contains("pooja"));
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		al.add(1, "neha");
		al.remove(10);
		System.out.println(al.size());
		al.set(2, "priya");
		System.out.println(al.get(2));
		
		System.out.println("---print all data using iterator---");
		
		Iterator itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("---print all data using Listiterator---");
		
		ListIterator Litr = al.listIterator();
		while(Litr.hasNext())
		{
			System.out.println(Litr.next());
		}
		
		System.out.println("---print all data using for loop---");
		
		for(int i=0; i<=al.size()-1; i++)
		{
			System.out.println(al.get(i)+" ");
		}
		
	}
}
