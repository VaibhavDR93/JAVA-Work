package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorStudy {

	public static void main(String[] args)
	{
		Vector v=new Vector();
		v.add("vaibhav");
		v.add("vaibhav");
		v.add('V');
		v.add("vaibhav");
		v.add(null);
		v.add(null);
		v.add(555);
		v.add(5.77);
		v.add("rohan");
		v.add(true);
		v.add("rocky");
		System.out.println(v);
		System.out.println(v.get(10));
		System.out.println(v.elementAt(5));
		System.out.println(v.remove(10));
		System.out.println(v);
		System.out.println("===========================");
		for (Object a: v)
		{
			System.out.println(a);
		}
		System.out.println("===========================");
		
 //2.by using cursor enumeration-->it is not universial cursor use to 1 type of collection object i.e vector(legacy class)
		
		Enumeration e = v.elements();
		while (e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		System.out.println("===========================");
		
		Iterator it = v.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("===========================");

	}

}
