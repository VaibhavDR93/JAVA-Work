package Generalization;

public class HDFC implements RBI
{

	@Override
	public void loan() {
		System.out.println("10%");
		
	}

	@Override
	public void withdrawal() {
		System.out.println("withdrawal limit is 70k");
		
	}

	@Override
	public void deposit() {
		System.out.println("deposit limit is 2L");
		
	}

}
