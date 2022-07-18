package FinalKeywordUse;

public class Test 
{
	int a=10;
	final int b=20;

	public static void main(String[] args) 
	{
		Test t=new Test();
		t.add();

	}
	public void add()
	{
		a=a+10+b; //updating value of a
		System.out.println(a);
		
		//b=b+10; we cant update value of final variable(can not assigne final variable)
	}

}
