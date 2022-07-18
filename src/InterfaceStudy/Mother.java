package InterfaceStudy;

public interface Mother 
{
	void love();
	void kindness();
	
	default void money()
	{
		System.out.println("mothers money");
	}
	
	static void care() 
	{
		System.out.println("mothere care");
		
	}

}
