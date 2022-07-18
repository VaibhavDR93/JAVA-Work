package ControlStatment;

public class Else_if_test {

	public static void main(String[] args) {
		// if marks>=60 print you are in dist
				//else marks>=50 print 1st class
				//else marks>=40 print pass
				//else youare fail
				int marks=400;
				if (marks>=60 & marks<100) 
				{
					System.out.println("you are in dist");
					}
				else if (marks>=50 & marks<60) 
				{
					System.out.println("you are in 1st class");
				}
				else if (marks>=40 & marks<50 )
				{
					System.out.println("you are pass");
				} 
				else if (marks>100) {
					System.out.println("invalid marks range plz enter valid value 0 to 100");
				}
				else {
					System.out.println("you are fail");
				}

	}

}
