package thisAndSuperKeyword;

public class ThisUse 
{
	//this keyword is use to access globale variable from same class
	
	int a=10;//non static global varibale
	static int b=20;//not use thic keword for static global varibale because static cant create its replica

	public static void main(String[] args)
	{
		ThisUse tu=new ThisUse();
		tu.test();

	}
	public void test()
	{
		int a=30;//local variable
		System.out.println("local value of a is "+a);
		System.out.println("global value of a is "+this.a);
		
		int add1=1+a;
		System.out.println("value of add1 is "+add1);
		
		int add2=a+this.a;
		System.out.println("value of add2 is "+add2);
		
		
		
	}

}
