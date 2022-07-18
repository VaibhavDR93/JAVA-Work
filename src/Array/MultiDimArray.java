package Array;

public class MultiDimArray {



	public static void main(String[] args) 
	{
		//int a[]=new int[3]; singl dimentional
		//array decleration
		
		int a[][]=new int[2][2];
		
		//array assign value
		a[0][0]=1;
		a[0][1]=2;
		a[1][0]=3;
		a[1][1]=4;
		
		//usage
	//	System.out.println(a[0][0]);
	//	System.out.println(a[0][1]);
	//	System.out.println(a[1][0]);
	//	System.out.println(a[1][1]);
		
		//usage using for loop
		
		for(int i=0;i<=1;i++) //for row//outer
		{
			for(int j=0;j<=1;j++) //for column//inner 
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
			
		}
		
		//declaration & assign at a time
		String n[][]= {{"my","name","is"},{"vaibhav","ramling","shinde"}};
		
		for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=2;j++) 
			{
				System.out.print(n[i][j]+" ");
			}
			System.out.println();
		}
		
		
		

	}

}
