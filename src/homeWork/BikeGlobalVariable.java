package homeWork;

public class BikeGlobalVariable 
{
	String name;
	String colour;
	byte avg;
	int weight;
	int speed;
	
	public void BikeInfo() {
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("Bike name    "+name);
		System.out.println("Bike colour  "+colour);
		System.out.println("Bike avg     "+avg+" km/ltr");
		System.out.println("Bike weight  "+weight+" kg");
		System.out.println("Bike speed   "+speed+" km/hr");
	}
	
	public static void main(String[] args)
	{
		BikeGlobalVariable Bullet=new BikeGlobalVariable();
		Bullet.name="Bullet350";
		Bullet.colour="black";
		Bullet.avg=45;
		Bullet.weight=200;
		Bullet.speed=70;
		
		Bullet.BikeInfo();
		
		BikeGlobalVariable shine=new BikeGlobalVariable();
		shine.name="Shine";
		shine.colour="black";
		shine.avg=55;
		shine.weight=150;
		shine.speed=45;
		
		shine.BikeInfo();
		
		
	}

}
