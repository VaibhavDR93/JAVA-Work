package homeworkArray;

public class multiDimArray {

	public static void main(String[] args)
	{
		char grade[][]= {{'a','b','k'},{'c','d','l'},{'e','f','m'},{'g','h','n'},{'i','j','o'}};
		    
		//dynamic coding
		for(int i=0;i<=grade.length-1;i++) 
		{
			for(int j=0;j<=grade[j].length-1;j++)
			{
				System.out.print(grade[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("================");
		//static coding
		for(int i=0;i<=4;i++) 
		{
			for(int j=0;j<=1;j++)
			{
				System.out.print(grade[i][j]+" ");
			}
			System.out.println();
		}

	}

}
