package HomeworkPolly;

public class MainMethodOverload
{
	
	//can we overlod main method --->yes
	
	public static void main(String[] args) 
	{
		System.out.println("a");
		main();
		
	}
	
	public static void main()
	{
		System.out.println("b");
	}

}
