package Generalization;

public class SBI implements RBI
{

	@Override
	public void loan() {
		System.out.println("9%");
		
	}

	@Override
	public void withdrawal() {
		System.out.println("withdrawal limit is 50k");
		
	}

	@Override
	public void deposit() {
		System.out.println("deposit limit is 1L");
		
	}

}
