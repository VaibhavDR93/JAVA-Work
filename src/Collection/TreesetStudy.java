package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreesetStudy {

	public static void main(String[] args) 
	{
		TreeSet ts=new TreeSet<>();
		//it store only homogeneious data
		//null value not allowed
		//ts.add("vaibhav");
		//ts.add('a');
		ts.add(1);
		//ts.add(null);
		ts.add(2);
		ts.add(4);
		ts.add(5);
		ts.add(3);
		
		System.out.println(ts);
		System.out.println(ts.size());
		System.out.println(ts.contains(55));
		System.out.println(ts.remove(2));
		System.out.println(ts);
		System.out.println("=====================");
		
		for(Object a:ts)
		{
			System.out.println(a);
		}
		System.out.println("=====================");
		Iterator it = ts.iterator();
		while(it.hasNext()) 
		{
			System.out.println(it.next());
		}
	}

}
