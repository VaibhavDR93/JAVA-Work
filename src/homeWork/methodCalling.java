package homeWork;

public class methodCalling // class
{

	public static void main(String[] args) // main method
	{
		myName();  // calling static method from same class
		
		DiffrentClassMethod.Location(); // calling static method from diff class

	}
	
	public static void myName()  // regular static method
	{
		String name;      // variable declaration
		name="Vaibhav";   //variable initialization (assine value)
		System.out.println("my name is "+name);  // usage
	}

}
