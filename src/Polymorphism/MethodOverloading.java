package Polymorphism;

public class MethodOverloading 
{  //declaring multiple method with same method name but with diff arguments

	public static void main(String[] args)
	{
		MethodOverloading mo=new MethodOverloading();
		mo.add();
		mo.add(5, 10);
		

	}
	public void add() 
	{
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println(sum);
	}
	public void add(int a, int b)
	{
		System.out.println(a+b);
	}

}
