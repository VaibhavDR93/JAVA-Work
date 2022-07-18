package Array;

public class Array2 {

	public static void main(String[] args) 
	{
		int rollnum[]= {1,2,3,4,5};//declaration + initialization
		
		for(int i=0;i<=rollnum.length-1;i++)
		{
			System.out.println(rollnum[i]);
		}
		System.out.println("=====================");
		
		for(int i=rollnum.length-1;i>=0;i--) 
		{
			System.out.println(rollnum[i]);
		}

	}

}
