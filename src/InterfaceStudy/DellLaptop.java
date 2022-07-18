package InterfaceStudy;

public interface DellLaptop extends HpLaptop
{
	void os();
	
	default void window10()
	{
		System.out.println("window10 for dell");
		
	}

}
