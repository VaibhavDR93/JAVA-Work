package exceptionHandeling;

public class eg1tryANDcatch
{
	public static void main(String[] args)
	{
		int a=10;
		int b=0;
		System.out.println(a);
		System.out.println(b);
		
		try 
		{
			System.out.println(a/b);//risky code
		}
		catch (ArithmeticException e) 
		{
			System.out.println("value of b is not equals to zero");
		}
		System.out.println("hello guys");
		
	}

}
