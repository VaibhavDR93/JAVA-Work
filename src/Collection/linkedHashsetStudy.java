package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class linkedHashsetStudy {

	public static void main(String[] args)
	{
		LinkedHashSet lh=new LinkedHashSet();
		
		lh.add("vaibhav");
		lh.add('a');
		lh.add("vaibhav");
		lh.add(null);
		lh.add(null);
		lh.add(55);
		lh.add(55.55);
		lh.add(true);
		
		System.out.println(lh);
		System.out.println(lh.size());
		System.out.println(lh.contains(55));
		System.out.println(lh.remove(55.55));
		System.out.println(lh);
		System.out.println("========================");
		for(Object a:lh) 
		{
			System.out.println(a);
		}
		System.out.println("========================");
		
		Iterator it = lh.iterator();
		while(it.hasNext())
		{
		   System.out.println(it.next());	
		}
		System.out.println("========================");
		//for(int i=0;i<=lh.size()-1;i++) 
		//{
		//	System.out.println(lh.getClass());
		//}
		LinkedHashSet <Integer>ihs=new LinkedHashSet();
		
		ihs.add(0);
		ihs.add(2);
		ihs.add(1);
		ihs.add(3);
		System.out.println(ihs);

	}

}
