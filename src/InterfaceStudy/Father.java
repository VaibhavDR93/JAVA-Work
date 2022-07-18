package InterfaceStudy;

public interface Father 
{
	void home();
	void car();
	
	default void money()
	{
		System.out.println("fathers money");
	}
	
	static void care()
	{
		System.out.println("father care");
	}

}
