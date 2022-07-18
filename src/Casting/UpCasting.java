package Casting;

public class UpCasting {

	public static void main(String[] args) 
	{
		father f=new father();
		f.bike();
		f.car();
		
		System.out.println("==================");
		
		son s=new son();
		s.bike();
		s.car();
		s.laptop();
		
		System.out.println("==================");
		
		father f1=new son();//up casting
		f1.bike();
		f1.car();
	//	f1.laptop(); only extend propert are casting
		

	}

}
