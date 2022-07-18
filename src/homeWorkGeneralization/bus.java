package homeWorkGeneralization;

public class bus implements Vehicle
{

	@Override
	public void fuel() {
		System.out.println("fuel capacity is 50Ltr");
		
	}

	@Override
	public void load() {
		System.out.println("load capacity is 10ton");
		
	}

	@Override
	public void gears() {
		System.out.println("5 gears");
		
	}

}
