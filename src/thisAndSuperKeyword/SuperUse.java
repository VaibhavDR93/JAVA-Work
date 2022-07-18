package thisAndSuperKeyword;

public class SuperUse extends test
{
	int p=40;//global variable

	public static void main(String[] args) 
	{
		SuperUse su=new SuperUse();
		su.test1();
	 

	}
	public void test1()
	{
		int p=20;
		System.out.println("local value of p is "+p);
		System.out.println("globale value of p from same class is "+this.p);
		System.out.println("globale value of p from super class is "+super.p);
		
	}

}
