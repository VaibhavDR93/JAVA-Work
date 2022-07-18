package pattern;

public class starpattern {

	public static void main(String[] args) 
	{
		// * * * * * 
		// * * * * *
		// * * * * *
		// * * * * *
		// * * * * *
		//row-->5 col-->5
		for(int i=1;i<=5;i++)// outer for loop--> row
		{
		      for(int j=1;j<=5;j++)//inner for loop--> column
		      {
		         System.out.print("* ");
		      }
		     System.out.println();
		}
		System.out.println("================================");
		// *
		// **
		// ***
		// ****
		// *****
		//row-->5 col-->5   star count=1
		
		int star=1;
		for(int i=1;i<=5;i++) 
		{
			for(int j=1;j<=star;j++) 
			{
				System.out.print("*");
			}
			System.out.println();
			star++;
			
		}
		System.out.println("================================");
		// *****
		// ****
		// ***
		// **
		// *
		//row-->5 col-->5   star count=5
		int star1=5;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=star1;j++) 
			{
				System.out.print("*");
			}
			System.out.println();
			star1--;
		}
		System.out.println("================================");
		//     *
		//    ** 
		//   *** 
		//  ****
		// *****
		//row-->5 col-->5   star count=1 space=4
		int star2=1;
		int space=4;
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=space;j++) 
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star2;j++) 
			{
				System.out.print("*");
			}
			System.out.println();
			space--;
			star2++;
			
		}
		System.out.println("================================");
            // *****    
			//  **** 
			//   ***   
			//    ** 
			//     *
		//row-->5 col-->5   star count=5, initially space=0
		int star3=5;
		int space1=0;
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=space1;j++) 
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star3;j++) 
			{
				System.out.print("*");
			}
			System.out.println();
			space1++;
			star3--;
		}
		


	}

}
