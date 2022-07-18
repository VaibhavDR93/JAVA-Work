package Array;

public class StringArray {

	public static void main(String[] args) 
	{
		String name[]=new String[6];
		
		name[0]="vaibhav";
		name[1]="vivek";
		name[2]="";
		
		for(int i=0;i<=name.length-1;i++)
		{
			System.out.println(name[i]);
		}
		System.out.println("==================");
		
		for(int i=name.length-1;i>=0;i--)
		{
			System.out.println(name[i]);
		}
		
			
		

	}

}
