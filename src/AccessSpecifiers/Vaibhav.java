package AccessSpecifiers;

public class Vaibhav {

	public static void main(String[] args)
	{
		Vaibhav v=new Vaibhav();
		v.test1();//calling private method-->(visible only within class)
		v.test2();//calling default method-->(visible only within package)
		v.test3();//calling protected method-->(visible only within package=inheritance will be provide out of package)
		v.test4();//calling public method-->(visible throught project)

	}
	
	private void test1()
	{
		System.out.println("i am private method test1");
	}
	void test2()
	{
		System.out.println("i am default method test2");
	}
	protected void test3() 
	{
		System.out.println("i am protected method test3");
	}
	public void test4() 
	{
		
		System.out.println("i am public method test4");
	}

}
