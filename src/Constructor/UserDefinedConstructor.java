package Constructor;

public class UserDefinedConstructor 
{
	     int a;//1variable declaration
	     int b;//1variable declaration
	     int c;
	     int d;
	
	
	
	public UserDefinedConstructor()//user define constructor withot pararmeter
	{
		//user definde constructor
		//the constructor is called when objectb of class is created
		//initialize or assine value of data member/variable
		a=10;
		b=20;	
		c=50;
		d=100;
	}

	public static void main(String[] args)
	{
		UserDefinedConstructor UDC=new UserDefinedConstructor();//object of class is created
		UDC.add();
		UDC.sub();
		

	}
	public void add()
	{
		int sum=a+b;
		System.out.println(sum);
	}
	public void sub() 
	{
		int sub=c-d;
		System.out.println(sub);
		
	}

}
