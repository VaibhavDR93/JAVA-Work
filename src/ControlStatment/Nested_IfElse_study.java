package ControlStatment;

public class Nested_IfElse_study {

	public static void main(String[] args) {
		// if UN is valid--->enter PWD
		//if PWD is valid-->login success
		//else pwd is invalid -->incorrect pwd
		
		String UN="Vaibhav";
		String PWD="vaibhav143";
		
		if (UN=="Vaibhav") {
			System.out.println("enter pwd");
			
			if (PWD=="vaibhav14") 
			{
				System.out.println("login success");
			}
			else {
				System.out.println("incorrect pwd");
			}
		}
		else {
			System.out.println("incorrect un");
		}

	}

}
