package HomeworkAbstract;

public class Car extends Vehicle  //concerete class for abstract class
{
	
	@Override
	void start() 
	{
		
		System.out.println("Start with key");
		
	}
	
	public static void main(String[] args) 
	{
		Car c=new Car();
		c.start();
		 
		System.out.println(c.name+"car");
		System.out.println(c.noOfTyers+4);
		
	
	}
	

}
