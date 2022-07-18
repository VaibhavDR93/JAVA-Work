package Methods;

public class Parameter {

	public static void main(String[] args) 
	{
		Parameter PR=new Parameter(); //created object for same class non static method
		PR.StudentInfo(); // calling non static method withot parameter from same class
		PR.StudentInfo("vaibhav", "OP44444", "Software testing", 3, 'A');
		
		Parameter.stinfo(45);

	}
	public void StudentInfo() // non static method withot parameter
	{           
		// name, PRN, cource, year, grade
		String name="Vaibhav";
		String PRN="OP1234567";
		String cource="Engineering";
		int year=4;
		char grade='A';
		System.out.println("<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>");
		System.out.println("Student name is "+name);
		System.out.println("Student PRN is "+PRN);
		System.out.println("Student cource is "+cource);
		System.out.println("Student year is "+year);
		System.out.println("Student grade is "+grade);
		System.out.println("<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>");
		
		
	}
   public void StudentInfo(String name,String PRN,String cource,int year,char grade) {//non static method with parameters
	   System.out.println("Student name is "+name);
	   System.out.println("Student PRN is "+PRN);
		System.out.println("Student cource is "+cource);
		System.out.println("Student year is "+year);
		System.out.println("Student grade is "+grade);
   }
   public static void stinfo(int name) {
	   System.out.println("my name is  "+name);
   }
}
