package logicalsPrograms;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) 
	{
		fixReverseStrin();
		UserInputReverseStrin();

	}
	public static void fixReverseStrin() 
	{
		String a="vaibhav";
		for(int i=a.length()-1;i>=0;i--) 
		{
			System.out.print(a.charAt(i));
		}
		System.out.println();
	}
	public static void UserInputReverseStrin() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string ");
		String b = sc.next();//original string
		String c="";//blank string
		for(int i=b.length()-1;i>=0;i--) 
		{
			
			c=c+b.charAt(i);
		}
		System.out.println("original string is "+b);
		System.out.println("reverse string is "+c);
		
	}

}
