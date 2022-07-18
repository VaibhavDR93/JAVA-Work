package ControlStatment;

public class Else_if_Study {

	public static void main(String[] args) {
		// if marks>=60 print you are in dist
		//else marks>=50 print 1st class
		//else marks>=40 print pass
		//else youare fail
		int marks=99;
		if (marks>=60) 
		{
			System.out.println("you are in dist");
			}
		else if (marks>=50) 
		{
			System.out.println("you are in 1st class");
		}
		else if (marks>=40)
		{
			System.out.println("you are pass");
		} 
		else if (marks<40) {
			System.out.println("you are fail");
		}
	//	else {
	//		System.out.println("you are fail");
	//	}

	}

}
