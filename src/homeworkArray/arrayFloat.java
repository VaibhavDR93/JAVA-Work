package homeworkArray;

public class arrayFloat {

	public static void main(String[] args)
	{
		float height[]= {5.2f,5.3f,5.4f,5.5f};
		
		for(int i=0;i<=height.length-1;i++)
		{
			System.out.println(height[i]);
		}
		System.out.println("=====================");
		
		for(int i=height.length-1;i>=0;i--)
		{
			System.out.println(height[i]);
		}
		System.out.println("=====================");
		
		boolean result[]= {true,false,};
		
		for(int i=0;i<=result.length-1;i++)
		{
			System.out.println(result[i]);
		}
		System.out.println("=====================");
		
		int table[]=new int[10];
		
		table[0]=2;
		table[4]=10;
		table[9]=20;
		
		for(int i=0;i<=table.length-1;i++) {
			System.out.println(table[i]);
		}
		
	
		
				

	}

}
