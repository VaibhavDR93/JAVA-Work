package homeWorkGeneralization;

public class VehicleGeneraliz {

	public static void main(String[] args)
	{
		car c=new car();
		c.fuel();
		c.load();
		c.gears();
		System.out.println("==========================");
		
		bus b=new bus();
		b.fuel();
		b.load();
		b.gears();
		System.out.println("==========================");
		
		truck t=new truck();
		t.fuel();
		t.load();
		t.gears();

	}

}
