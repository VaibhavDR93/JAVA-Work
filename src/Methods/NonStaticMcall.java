package Methods;

public class NonStaticMcall     //class
{

	public static void main(String[] args) //main method
	{
		//object create always in main method
		//object creation synatx---> classname objectname = new classname();
		
		NonStaticMcall NSM=new NonStaticMcall();   // object created same class
		
		//after creating object---> call non static methot
		//calling non static method syntax----> objectname.methodname();
		
		NSM.game();  // calling non static method from same class
		
		//non static method calling from diffrent class
		//1.create object
		
		NonStaticMdiffClass NSMDC=new NonStaticMdiffClass(); //object for diffrent class
		
		//2.calling non static method from diffrent class
		
		NSMDC.diffrent();  // calling non static method from another class
		
		
	}
	public void game()   // game non static regular method
	{
		System.out.println("i am non static method from same class");
	}
	
     
}
