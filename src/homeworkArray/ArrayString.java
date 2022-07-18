package homeworkArray;

import java.util.Arrays;

public class ArrayString {

	public static void main(String[] args)
	{
		
		String a[]= {"i","love","my","india"};
		
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("=========================");
          Arrays.sort(a);//sort method 
          for(int i=0;i<=a.length-1;i++)
  		{
  			System.out.println(a[i]);
  		}
	}

}
