package InterfaceStudy;

public class ImplementationOfInterface implements InterfaceImplementation
{

	public static void main(String[] args)
	{
		System.out.println("value of a"+a);//calling variable of interface
		
		ImplementationOfInterface ioi=new ImplementationOfInterface();
		ioi.a();
		ioi.b();
		ioi.c();
		
		
	

	}

	@Override
	public void a(){
		
		System.out.println("method a completed in implement class");
	}

	@Override
	public void b() {
		System.out.println("method b completed in implement class");
		
	}

	@Override
	public void c() {
		System.out.println("method c completed in implement class");
		
	}

}
