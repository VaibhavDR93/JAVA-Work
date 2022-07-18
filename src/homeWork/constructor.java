package homeWork;

public class constructor //class name
{
	String name;
	float height;
	char grade;
	
	public constructor() //user defined constructor without parameter
	{
		 name="Vaibhav";
		 height=5.9f;
		 grade='A';
		
	}

	public static void main(String[] args)
	{//constructor is called when object of class is created
		constructor CON=new constructor();
		CON.student();
		
		
	}
	public void student() 
	{
		System.out.println(name);
		System.out.println(height+" ft");
		System.out.println(grade);
		
		
	}
	

}
