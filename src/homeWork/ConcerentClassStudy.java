package homeWork;

public class ConcerentClassStudy extends AbstractClassStudy
{

	public static void main(String[] args)
	{
		ConcerentClassStudy ccs=new ConcerentClassStudy();
		ccs.test();
		ccs.test1();
		ccs.test1(05);
		ccs.test2();

	}

	@Override
	public void test1()
	{
		System.out.println("now i am complete method test1 in concrent class");
		
	}

	@Override
	public void test1(int a) 
	{
		System.out.println("value of a is "+a);
		
	}

	@Override
	public void test2()
	{
		System.out.println("now i am complete method test2 in concrent class");
		
	}

}
