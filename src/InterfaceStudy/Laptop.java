package InterfaceStudy;

public class Laptop implements DellLaptop
{

	public static void main(String[] args)
	{
		Laptop l=new Laptop();
		l.ram();
		l.os();
		l.window10();
		

	}

	@Override
	public void ram() {
		System.out.println("ram method completed in laptop class");
		
	}

	@Override
	public void os() {
		System.out.println("os method completed in laptop class");
		
	}

	@Override
	public void window10() {
		DellLaptop.super.window10();//super use for same method name 
		
	}

}
