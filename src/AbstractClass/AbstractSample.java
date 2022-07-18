package AbstractClass;

public abstract class AbstractSample {

	public static void main(String[] args)
	{
		//we cant create object of abstract class because of method is incomplete it does not have body

	}
	public void test()
	{
		System.out.println(" i am test complete method");
	}
	public abstract void test1(); //incomplete method--->dont have body
	
	public static void test2() 
	{
		System.out.println("i am static complite method");
	}
	//public static void test3(); we cant use static for  abstract method
	

}
