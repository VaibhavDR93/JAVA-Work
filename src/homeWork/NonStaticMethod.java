package homeWork;

public class NonStaticMethod   //class
{

	public static void main(String[] args) //main method
	{
		NonStaticMethod Device=new NonStaticMethod(); //created object for same class
		
		Device.electronic();  // calling non static regular method from same class
		
		DiffrentClassMethod Device2=new DiffrentClassMethod();//created object for another class
		
		Device2.Money(); // calling non static regular method from another class

	}
	
	public void electronic() // non static regular method
	{
		String laptop;
		laptop="HP";
		System.out.println("I have "+laptop+" laptop.");
	}

}
