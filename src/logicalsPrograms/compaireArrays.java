package logicalsPrograms;

import java.util.Arrays;

public class compaireArrays {

	public static void main(String[] args)
	{
		compairArray();
    }
	public static void compairArray() 
	{
		int a[]= {1,2,3};
		int b[]= {4,5,6};
		int c[]= {1,2,3};
		System.out.println(Arrays.equals(a, b));
		System.out.println(Arrays.equals(b, b));
		System.out.println(Arrays.equals(a, c));
	}

}
