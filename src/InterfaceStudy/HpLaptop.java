package InterfaceStudy;

public interface HpLaptop
{
	void ram();
	
	default void window10()
	{
		System.out.println("window10  for hp");
		
	}

}
