package logicalsPrograms;

public class noOfWhiteSpaceInString {

	public static void main(String[] args) 
	{
		String a=" s   hi  nd e";
		int count=0;
		for(int i=0;i<=a.length()-1;i++) 
		{
			char mychar = a.charAt(i);
			if(mychar==' ') 
			{
				count++;
			}
		}
		System.out.println("number of white space in "+a+" is "+count);
		
		System.out.println("===================================================");
		countstringVowel();

	}
	public static void countstringVowel() 
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
		System.out.println("======================================");
		
	}

}
