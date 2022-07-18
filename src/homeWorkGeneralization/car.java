package homeWorkGeneralization;

public class car implements Vehicle
{

	@Override
	public void fuel() {
		System.out.println("fuel capacity is 20Ltr");
		
	}

	@Override
	public void load() {
		System.out.println("load capacity is 1ton");
		
	}

	@Override
	public void gears() {
		System.out.println("4 gears");
		
	}

}
