package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetStudy {

	public static void main(String[] args) 
	{
		HashSet  hs=new HashSet();//generaic hashset
		
		hs.add("vaibhav");
		hs.add('a');
		hs.add("vaibhav");
		hs.add(null);
		hs.add(null);
		hs.add(55);
		hs.add(55.55);
		hs.add(true);
		
		System.out.println(hs);
		System.out.println(hs.size());
		//System.out.println(hs.clone());
		System.out.println(hs.isEmpty());
		System.out.println(hs.contains('a'));
		System.out.println(hs.remove(55.55));
		System.out.println(hs);
		System.out.println("========================");
		// retrive data
		//for(int i=0;i<=hs.size()-1;i++) 
		//{
		//	System.out.println(hs.get(i));
		//}
		System.out.println("========================");
		for(Object a:hs) 
		{
			System.out.println(a);
		}
		System.out.println("========================");
		
		Iterator it = hs.iterator();
		while(it.hasNext()) 
		{
			System.out.println(it.next());
		}
		
		HashSet<Integer> ihs = new HashSet<>();
		ihs.add(0);
		ihs.add(2);
		ihs.add(1);
		ihs.add(3);
		
		System.out.println(ihs);
		
	

	}

}
