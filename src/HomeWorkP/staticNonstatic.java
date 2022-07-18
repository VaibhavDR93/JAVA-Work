package HomeWorkP;

public class staticNonstatic 
{
	int a=5;
	static int b=10;

	public static void main(String[] args) 
	{
		test1();
		staticNonstatic sn=new staticNonstatic();
		sn.test2();

	}
	public static void test1()
	{
		int c=1;
	//	int sum=c+a; static method can access only static member can not access non static member
		int sum=c+b;
		System.out.println(sum);
		
	}
	public void test2()
	{
		int d=1;
		int sum=d+a+b;//non static method can access both static member &  non static member
		System.out.println(sum);
	}

}
