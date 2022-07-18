package ControlStatment;

public class ifElse_Study {

	public static void main(String[] args) {
		// if marks is grater than or equal to 40 then print you are pass
		// else you are fail
		
		int marks=20;
		if (marks>=40) {
			
			System.out.println("you are pass");
			
		}
		else {
			System.out.println("you are fail");
		}
		//if season is summer it is hot
		//else it is not a summer season
		
		String season="summer";
		if (season=="summer") {
			System.out.println("its hot");
			}
		else {
			System.out.println("its not a summer season");
		}
        //if day sunday then print its holiday
		//else it is a another day
		
		String day="monday";
		if (day=="sunday") {
			
			System.out.println("its a holiday");
			}
		else {
			System.out.println("it is another day");
		}
	}

}
