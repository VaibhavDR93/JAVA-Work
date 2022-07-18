package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListStudy {

	public static void main(String[] args)
	{
		ArrayList a=new ArrayList();//generaic arry list all datatype insert
		a.add("vaibhav");
		a.add('V');
		a.add("vaibhav");
		a.add(null);
		a.add(null);
		a.add(555);
		a.add(5.77);
		a.add("rohan");
		a.add(true);
		a.add("rocky");
		System.out.println(a);
		System.out.println(a.size());
		System.out.println(a.isEmpty());
		System.out.println(a.contains("vai"));
		System.out.println(a.contains("vaibhav"));
		System.out.println(a.get(5));
		System.out.println(a.indexOf("rohan"));
		System.out.println(a.remove(9));//here index left shift
		System.out.println(a);
		//1.
		for(int i=0;i<=a.size()-1;i++)
		{
			System.out.println(a.get(i));
		}
		System.out.println("=====================");
		//2.by using cursor iterator --->it is universial cursor use to all type of collection object
		Iterator it = a.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("=====================");
		
		//3.by using cursor listiterator --->it is not universial cursor use to 3 type of collection object
		ListIterator lit = a.listIterator();
		while (lit.hasNext()) 
		{
			System.out.println(lit.next());
		}
		System.out.println("=====================");
		//4.for each loop
		for (Object b: a) 
		{
			System.out.println(b);
		}
		System.out.println("=====================");
		
		//specific arryList
		ArrayList<Integer> s=new ArrayList<>();//specific arryList insert specific datatype
		
		s.add(null);
		s.add(2);
		s.add(3);
		s.add(4);
		s.add(4);
		System.out.println(s);
		for (Integer d: s)
		{
			System.out.println(d);
		}
		System.out.println("=====================");
		ArrayList<Character> s1=new ArrayList<>();
		s1.add(null);
		s1.add('A');
		s1.add('C');
		s1.add('D');
		System.out.println(s1);
		for (Character e : s1)
		{
			System.out.println(e);
		}
		
		
		
		
		

	}

}
