package homeWork;

public class MobileParameter {

	public static void main(String[] args) {
		
		MobileParameter MP=new MobileParameter();// created object for non static method
		
		MP.Mobile("Oneplus 9RT", "OnePlus", "128 GB", "OxygenOS", 2022, 42999);//calling NSM from same class
		
		
		

	}
	         //non static regular method with parameter
	public void Mobile(String name,String brand,String storage,String OS,int year,int price)
	{
		System.out.println("Model name   "+name);
		System.out.println("Brand        "+brand);
		System.out.println("Storage      "+storage);
		System.out.println("OS           "+OS);
		System.out.println("Model year   "+year);
		System.out.println("Price        "+price+" Rs");
	}

}
