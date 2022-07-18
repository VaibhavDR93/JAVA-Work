package Methods;

public class MathOperation {

	public static void main(String[] args) //main method
	{
		MathOperation MO=new MathOperation();// created object for same class
		MO.addition(); // calling non static method from same class
		
		sub(); //calling static method from same class
		
		//calling method from another class
		MathOperationDiff MOD=new MathOperationDiff();//created object for another class
		MOD.mul();//calling non static method from another class
		
		MathOperationDiff.div();//calling static method from another class
	}
	public void addition() //non static regular method
	{
		int a=10; //variable declaration & variable inisitization in one line
		int b=5;
		int sum=a+b;
		System.out.println("sum is "+sum);
	}
	
	public static void sub()//static regular method
	{
		int a=5;
		int b=10;
		int subs=a-b;
		System.out.println("sub is "+subs);
	}
	

}
