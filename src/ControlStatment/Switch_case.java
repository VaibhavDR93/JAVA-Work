package ControlStatment;

public class Switch_case {

	public static void main(String[] args) {
		//1--> welcome to 1st year engg
		//2--> welcome to 2st year engg
		//3--> welcome to 3st year engg
		//4--> welcome to 4st year engg
		
		int year=5;
		
		switch (year) {
		case 1:System.out.println("welcome to 1st year engg");
		break;
		case 2:System.out.println("welcome to 2st year engg");
		break;
		case 3:System.out.println("welcome to 3st year engg");
		break;
		case 4:System.out.println("welcome to 4st year engg");
		break;


		default:System.out.println("plz enter year between 1-4");
			break;
		}
		
		String week="friday";
		
		switch (week) {
		case "monday":System.out.println("this is 1st day of week");
		break;
		case "tuesday":System.out.println("this is 2nd day of week");
		break;
		case "wednesday":System.out.println("this is 3rd day of week");
		break;
		case "thursday":System.out.println("this is 4th day of week");
		break;
		case "friday":System.out.println("this is 5th day of week");
		break;
		case "saturday":System.out.println("this is 6th day of week");
		break;
		case "sunday":System.out.println("this is last day of week");
		break;

		default:System.out.println("plz enter valid day name");
			break;
		}

	}

}
