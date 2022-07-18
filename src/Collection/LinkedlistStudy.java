package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedlistStudy {

	public static void main(String[] args) {
		
		LinkedList ll=new LinkedList<>();
		ll.add("vaibhav");
		ll.add('V');
		ll.add("vaibhav");
		ll.add(null);
		ll.add(null);
		ll.add(555);
		ll.add(5.77);
		ll.add("rohan");
		ll.add(true);
		System.out.println(ll);
		System.out.println(ll.size());
		System.out.println(ll.isEmpty());
		System.out.println(ll.indexOf("vaibhav"));
		System.out.println(ll.lastIndexOf("vaibhav"));
		System.out.println(ll.contains(null));
		System.out.println(ll.get(2));
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		System.out.println(ll.peek());
		System.out.println(ll);
		System.out.println(ll.poll());
		System.out.println(ll);
		System.out.println(ll.pop());
		System.out.println(ll);
		System.out.println(ll.remove(true));
		System.out.println(ll);
		System.out.println("============================");
		//retrive data
		
		for(int i=0;i<=ll.size()-1;i++) 
		{
			System.out.println(ll.get(i));
		}
		System.out.println("============================");
		//for each loop
		for(Object fe:ll)
		{
			System.out.println(fe);
		}
		System.out.println("============================");
		//iterator
		Iterator it = ll.iterator();
		while(it.hasNext()) 
		{
			System.out.println(it.next());
		}
		System.out.println("============================");
		//listiterator
		ListIterator li = ll.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}

	}

}
