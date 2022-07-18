package Methods;

public class StaticMethodCall {

	public static void main(String[] args) 
	{
		call();   //calling static method from same class--->StaticMethodCall
		
		StaticMethodDiffClass.diffrentClass(); //calling static method from diffrent class
	}

	public static void call() //regular static method
	{
		System.out.println("hi this is call static method from same class");
	}
	
	
}
