package homeWork;

public class ConstructorWithParameter
{
	String name;
	float age;
	float height;
	int passedYear;
	char grade;
	
	public ConstructorWithParameter() //user defined constructor without pararmeter
	{
		name="Vaibhav";
		age=25.5f;
		height=5.9f;
		passedYear=2017;
		grade='A';
		}
	public ConstructorWithParameter(String N,float A,float H,int P,char G) ///user defined constructor with pararmeter
	{
		name=N;
		age=A;
		height=H;
		passedYear=P;
		grade=G;
	}
	

	public static void main(String[] args) 
	{
		ConstructorWithParameter CWP=new ConstructorWithParameter();
		CWP.StudentInfo();
		
		ConstructorWithParameter CWP1=new ConstructorWithParameter("Rohit", 26.5F, 6.1F, 2017, 'A');
		CWP1.StudentInfo();
		
		}
	public void StudentInfo()//non static method
	{
		System.out.println("my name is           "+name);
		System.out.println("my age is            "+age);
		System.out.println("my height is         "+height+" ft");
		System.out.println("my passOut year is   "+passedYear);
		System.out.println("my grade is          "+grade);
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>");
		
		
	}

}
