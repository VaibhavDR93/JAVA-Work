package pattern;

public class starPattern2 {

	public static void main(String[] args)
	{
		eg1();
		System.out.println("========================");
		eg2();
		System.out.println("========================");
		eg3();
		System.out.println("========================");
		eg4();
		System.out.println("========================");
		eg5();
		System.out.println("========================");
		eg6();
		System.out.println("========================");
		eg7();
		System.out.println("========================");
		eg8();

	}
	public static void eg1()
	{
	//	   *
	//	  ***
	//	 *****
	//	*******
	// row=4  col=7 star=1  space=3
		
		int star=1;
		int space=3;
		for(int i=1;i<=4;i++) 
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++) 
			{
				System.out.print("*");
			}
			System.out.println();
			space--;
			star=star+2;
		}
	}
	public static void eg2() 
	{
//		    *******
//		     *****
//		      ***
//		       *
		//row=4  col=7 star=7  space=0
		int star=7;
		int space=0;
		for(int i=1;i<=4;i++) 
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++) 
			{
				System.out.print("*");
			}
			System.out.println();
			space++;
			star=star-2;
		}
		
	}
	public static void eg3()
	{
//		        *
//		       * *
//		      * * *
//		     * * * *
		//row=4  col=7 star=1  space=3
		int star=1;
		int space=3;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			space--;
			star++;	
		}
		
	}
	public static void eg4()
	{
//		    * * * *
//		     * * *
//		      * *
//		       *
		//row=4  col=7 star=4  space=0
		int star=4;
		int space=0;
		for(int i=1;i<=4;i++) 
		{
			for(int j=1;j<=space;j++) 
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++) 
			{
				System.out.print("* ");
			}
			System.out.println( );
			star--;
			space++;
		}
	}
	public static void eg5() 
	{
//		*****
//		****
//		***
//		**
//		*
//		**
//		***
//		****
//		*****
		//row=9  col=5 star=5  
		int star=5;
		for(int i=1;i<=9;i++) 
		{
			for(int j=1;j<=star;j++) 
			{
				System.out.print("*");
			}
			System.out.println();
			if(i<5)
			{
				star--;
			}
			else 
			{
				star++;
			}
		}	
	}
	public static void eg6() 
	{
//		*
//		**
//		***
//		****
//		*****
//		****
//		***
//		**
//		*
		//row=9  col=5 star=5 
		int star=1;
		for(int i=1;i<=9;i++) 
		{
			for(int j=1;j<=star;j++) 
			{
				System.out.print("*");
			}
			System.out.println();
			if(i<5)
			{
				star++;
			}
			else 
			{
				star--;
			}
		}	
	}
	public static void eg7()
	{
//		  *
//		 **
//		***
//	   ****
//	  *****
//	   ****
//	    ***
//	     **
//	      *
		//row=9  col=5 star=1  space=4
		int star=1;
		int space=4;
		for(int i=1;i<=9;i++) 
		{
			for(int j=1;j<=space;j++) 
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++) 
			{
				System.out.print("*");
			}
			System.out.println();
			if(i<5) 
			{
				star++;
				space--;
			}
			else
			{
				star--;
				space++;
			}
			
		}
		
	}
	public static void eg8() 
	{
//		*       *
//		**     **
//		***   ***
//		**** ****
//		*********
//		**** ****
//		***   ***
//		**     **
//		*       *
		//row=9  col=9 star=1  space=4 star1=1 space1=4
		int star=1;
		int space=4;
		int star1=1;
		int space1=4;
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=star;j++) 
			{
				System.out.print("*");
			}
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=space1;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star1;j++) 
			{
				System.out.print("*");
			}
			System.out.println();
			if(i<5) 
			{
				star++;
				space--;
				space1--;
				star1++;
			}
			else
			{
				star--;
				space++;
				space1++;
				star1--;
			}
		}
		
	}

}
