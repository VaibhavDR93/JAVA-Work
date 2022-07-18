package HomeworkAbstract;

public class bike extends Vehicle
{

	@Override
	void start()
	{
		System.out.println("start with key");
		
	}
	
	public static void main(String[] args) 
	{
		bike b=new bike();
		b.start();
		
		System.out.println(b.name+"bike");
		System.out.println(b.noOfTyers+2);
	}

}
