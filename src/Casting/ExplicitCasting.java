package Casting;

public class ExplicitCasting
{    //converting higher data type info to lower data type info is  callerd explicit casting
	//it is also called narrowing casting
	//where memory size goes on decreasing there is  data loss

	public static void main(String[] args) 
	{
		double a=99.99;
		System.out.println(a);
		
		int b=(int) a;
		System.out.println(b);
		
		short c=(short) b;
		System.out.println(c);

	}

}
