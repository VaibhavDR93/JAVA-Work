package logicalsPrograms;

import java.util.Scanner;

public class EvenOddNumber {

	public static void main(String[] args) 
	{
		evenOddNum();
		System.out.println("============");
		evennum();

	}
	public static void evenOddNum() 
	{
		//10%2=0
		//10/2=5
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int a = sc.nextInt();
		if(a%2==0) 
		{
			System.out.println("given number is even");
		}
		else 
		{
			System.out.println("given number is not even");
		}
		
	}
	public static void evennum()
	{
	
		for(int i=1;i<=10;i++)
		{
			if(i%2==0) 
			{
				System.out.println(i);
			}
		
		}
	}

}
