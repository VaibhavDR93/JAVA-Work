package logicalsPrograms;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) 
	{
		factorialNum();
		System.out.println("=================");
		factorialNumUsingUserInput();

	}
	public static void factorialNum()
	{
		//6!--->6*5*4*3*2*1
		int num=6;
		int num1=1;
		for(int i=num;i>=1;i--) 
		{
			num1=num1*i;
		}
		System.out.println("factorial is "+num1);
	}
	public static void factorialNumUsingUserInput() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter factorial num");
		int factorialnum = sc.nextInt();
		int number=1;
		for(int i=factorialnum;i>=1;i--)
		{
			number=number*i;
			
		}
		System.out.println("factorial is "+number);
		
	}

}
