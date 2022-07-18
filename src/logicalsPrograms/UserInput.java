package logicalsPrograms;

import java.util.Scanner;

public class UserInput 
{
	public static void main(String[]arg) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of a ");
		int a = sc.nextInt();
		
		System.out.println("enter value of b ");
		int b = sc.nextInt();
		
		int sum = a+b;
		System.out.println("sum is "+sum);
		
		
	}

}
