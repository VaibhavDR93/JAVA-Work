package Array;



public class Array1 {

	public static void main(String[] args) 
	{
		// array for char data type 
		//Grade--->A B C D E
		
		  //1.array decleration
		char grade[]=new char[7];
		
		//2.array initialization
		grade[0]='A';
		grade[1]='B';
		grade[2]='C';
		grade[3]='D';
		grade[4]='E';
		grade[5]='F';
		grade[6]='G';
		
		//3.Usage
		System.out.println(grade[0]);
		System.out.println(grade[1]);
		System.out.println(grade[2]);
		System.out.println(grade[3]);
		System.out.println(grade[4]);
		System.out.println(grade[5]);
		System.out.println(grade[6]);
		System.out.println("=====================");
		
		for(int i=0;i<=6;i++) //static coding
		{
			System.out.println(grade[i]);
		}
		System.out.println("=====================");
		
		for(int i=0;i<=grade.length-1;i++)//dynamic coding
		{
			System.out.println(grade[i]);
		}
		System.out.println("=====================");
		
		for(int i=grade.length-1;i>=0;i--) //decrimental order
		{
			System.out.println(grade[i]);
		}
		
		
		
		

	}

}
