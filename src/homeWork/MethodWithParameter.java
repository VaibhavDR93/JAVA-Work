package homeWork;

public class MethodWithParameter {

	public static void main(String[] args) {// main method
		
		MethodWithParameter MWP=new MethodWithParameter();//created object for non static method
		MWP.addition(5, 10); // calling non static method with parameter
		MWP.sub(10, 20);
		MWP.mul(5, 10);
		MWP.div(50, 5);

	}
	//non static regular method with parameter
	public void addition(int a, int b)
	{
		System.out.println(a+b);
	}
	public void sub(int a, int b)
	{
		System.out.println(a-b);
	}
	public void mul(int a, int b)
	{
		System.out.println(a*b);
	}
	public void div(int a, int b)
	{
		System.out.println(a/b);
	}

}
