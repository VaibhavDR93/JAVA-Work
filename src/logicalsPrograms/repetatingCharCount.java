package logicalsPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class repetatingCharCount {

	public static void main(String[] args) 
	{
		repetechar();
		System.out.println("================");
		repetString();

	}
	public static void repetechar()
	{
		String str="abcdefabcxyzaxd";
		HashMap<Character, Integer> mp=new HashMap<Character, Integer>();
		
		for(int i=0;i<=str.length()-1;i++) 
		{
			char charvalue = str.charAt(i);
			if(mp.containsKey(charvalue))
			{
				mp.put(charvalue, mp.get(charvalue)+1);
			}
			else 
			{
				mp.put(charvalue, 1);
			}
		}
		//System.out.println(mp);
		Set<Character> keys = mp.keySet();
		List<Character> lis=new ArrayList<>(keys);
		
		for(Character key:lis) 
		{
			System.out.println(key+"---> "+mp.get(key));
		}
		
	}
	public static void repetString() 
	{
		String str="abc xyz abc xyz pqr lmn";
		String[] ary = str.split(" ");
		HashMap<String, Integer> mp=new HashMap<String, Integer>();
		
		for(int i=0;i<=ary.length-1;i++) 
		{
			String s1 = ary[i];
			if(mp.containsKey(s1))
			{
				mp.put(s1, mp.get(s1)+1);
			}
			else 
			{
				mp.put(s1, 1);
			}
		}
		Set<String> keys = mp.keySet();
		for (String key : keys)
		{
			System.out.println(key+"---> "+mp.get(key));
		}
	}

}
