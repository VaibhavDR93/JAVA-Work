package AbstractClass;

public class ConcerentClass extends AbstractSample
{

	public static void main(String[] args)
	{
		ConcerentClass cc=new ConcerentClass();// create object for concrent class
		cc.test();//method from abstractsample class
		cc.test1();//method from concrentclass
		cc.demo();//own method from concrentclass
		
		AbstractSample.test2();//static method from abstractsample class
		
		

	}
	public void demo()
	{
		System.out.println("method from cc");
	}
	
	@Override
	public void test1()
	{
		System.out.println("now i am completed in concerent class");
		
	}
	

}
