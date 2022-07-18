package Constructor;

public class UserDefinedWithParameterConstructor
{
	int a;
	int b;
	int c;
	
	public UserDefinedWithParameterConstructor()//user defined without pararmeter constructor
	{
		//initialization (assigne value)
		a=10;
		b=20;
		c=30;
		}
	public UserDefinedWithParameterConstructor(int x) // user defined with one parameter constructor
	{
		a=x;
	}
	public UserDefinedWithParameterConstructor(int x, int y)//user defined with two parameter constructor
	{
		a=x;
		b=y;
	}
	public UserDefinedWithParameterConstructor(int x, int y,int z)//user defined with three parameter constructor
	{
		a=x;
		b=y;
		c=z;
	}
	
	
	

	public static void main(String[] args)
	{
		UserDefinedWithParameterConstructor UDWPC=new UserDefinedWithParameterConstructor();
		UDWPC.addition();
		UserDefinedWithParameterConstructor UDWPC1=new UserDefinedWithParameterConstructor(100);
		UDWPC1.addition();
		UserDefinedWithParameterConstructor UDWPC2=new UserDefinedWithParameterConstructor(10, 20);
		UDWPC2.addition();
		UserDefinedWithParameterConstructor UDWPC3=new UserDefinedWithParameterConstructor(10, 40, 50);
		UDWPC3.addition();

	}
	public void addition() // method without parameter
	{
		int sum=a+b+c;
		System.out.println(sum);
	}

}
