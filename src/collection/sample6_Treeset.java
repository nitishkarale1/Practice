package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class sample6_Treeset 
{
	public static void main(String[] args) 
	{
		TreeSet<Integer> tr=new TreeSet<Integer>();
		
		tr.add(100);
		tr.add(200);
		tr.add(300);
		tr.add(400);
		tr.add(400);
		//tr.add(null);
		
		System.out.println(tr);
		System.out.println(tr.contains(100));
		System.out.println(tr.size());
		System.out.println(tr.isEmpty());
		
		tr.remove(1);
		tr.add(500);
		System.out.println(tr);
		
		System.out.println("--print all data using Iterator cursor--");
		
		Iterator ts = tr.iterator();
		while(ts.hasNext())
		{
			System.out.println(ts.next());
		}
		
		
		
//		Object s1;
//		for( Object s1:tr)
//		{
//			System.out.println(s1);
//		}
//		
//		
//		}
	
}
}
