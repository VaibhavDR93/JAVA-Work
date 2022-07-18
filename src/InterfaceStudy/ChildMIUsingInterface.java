package InterfaceStudy;

public class ChildMIUsingInterface implements Father,Mother
{

	public static void main(String[] args) {
		
		ChildMIUsingInterface c=new ChildMIUsingInterface();
		c.love();
		c.kindness();
		c.home();
		c.car();
		c.money();
		Father.care();
		Mother.care();

	}

	@Override
	public void love() {
		System.out.println("love method completed by child");
		
	}

	@Override
	public void kindness() {
		System.out.println("kindness method completed by child");
		
	}

	@Override
	public void home() {
		System.out.println("home method completed by child");
		
	}

	@Override
	public void car() {
		System.out.println("car method completed by child");
		
	}

	@Override
	public void money() {
		Father.super.money();
		Mother.super.money();
		
	}

}
