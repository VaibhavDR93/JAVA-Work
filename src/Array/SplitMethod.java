package Array;

public class SplitMethod {

	public static void main(String[] args) 
	{
		String b="I LOVE YOU MY FAMALY";
		
		//System.out.println(b.split(" "));
		
		String[] c = b.split(" ");
		
		//System.out.println(c);
		
		for(int i=0;i<=c.length-1;i++)
		{
			System.out.println(c[i]);
		}

	}

}
