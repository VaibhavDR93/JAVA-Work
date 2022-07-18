package homeWorkGeneralization;

public class truck implements Vehicle
{
	@Override
	public void fuel() {
		System.out.println("fuel capacity is 80Ltr");
		
	}

	@Override
	public void load() {
		System.out.println("load capacity is 20ton");
		
	}

	@Override
	public void gears() {
		System.out.println("6 gears");
		
	}

}
