package homeworkLogicalProgram;

public class vowaleCount {

	public static void main(String[] args)
	{
		vowal();
		vowalUsingSwitchCase();

	}
	public static void vowal()
	{
		String str="vaibhav shinde";
		int count=0;
		
		for(int i=0;i<=str.length()-1;i++) 
		{
			char ch = str.charAt(i);
			if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u'))
			{
				count++;
				System.out.print(ch);
				
			}
			
			
		}
		System.out.println();
		System.out.println("number of vowal are "+count);
	}
	public static  void vowalUsingSwitchCase() 
	{
		String str="vaibhavshinde";
		int count1=0;
		for(int i=0;i<=str.length()-1;i++) 
		{
			char ch = str.charAt(i);
			switch (ch)
			{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				
				count1++;
				break;
					
			}
		}
		System.out.println("num of vowal are "+count1);
	}

}
