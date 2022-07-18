package Array;

import java.util.Arrays;

public class SortMethod {

	public static void main(String[] args) 
	{
		int a[]= {1,3,2,4,6,5};
		
	
		
		for (int i=0;i<=a.length-1;i++) 
		{
			System.out.println(a[i]);
		}
		System.out.println("============");
		//we need to use sort method
		Arrays.sort(a);
		for (int i=0;i<=a.length-1;i++) 
		{
			System.out.println(a[i]);
		}
		System.out.println("=====================");
		for (int i=a.length-1;i>=0;i--) 
		{
			System.out.println(a[i]);
		}
		
		

	}

}
