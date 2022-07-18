package logicalsPrograms;

import java.util.Scanner;

public class MultiplicationWithoutUsingOperator {

	public static void main(String[] args) 
	{
		mul();
		mulUsingUserInput();

	}
	public static void mul() 
	{
		//5*6
				//5+5+5+5+5+5
				
				int a=5;
				int b=6;
				int sum=0;
				for(int i=1;i<=b;i++) 
				{
					sum=sum+a;
				}
				System.out.println("multiplication is "+sum);
				
	}
	public static void mulUsingUserInput() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first value");
		int x = sc.nextInt();
		System.out.println("enter second value");
		int y = sc.nextInt();
		int sum = 0;
		for(int i=1;i<=y;i++) 
		{
			sum=sum+x;
		}
		System.out.println("multiplication is "+sum);
	}

}
