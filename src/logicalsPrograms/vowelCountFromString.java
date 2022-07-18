package logicalsPrograms;

public class vowelCountFromString {

	public static void main(String[] args) 
	{
		VowelCount();
		System.out.println("======================================");
		vowelCount2();

	}
	public static void VowelCount() 
	{
		String a="welcome";
		int count=0;
		for(int i=0;i<=a.length()-1;i++) 
		{
			if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u') 
			{
				count++;
			}
			
		}
		System.out.println("number of vowel are "+count);
		
		
	}
	public static void vowelCount2()
	{
		String x="welcome";
		int count=0;
		for(int i=0;i<=x.length()-1;i++) 
		{
			char chars = x.charAt(i);
			switch(chars) 
			{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
				break;
			
			}
			
		}
		System.out.println("number of vowel are "+count);
		
	}
	

}
