package logicalsPrograms;

public class ReversrNumber {

	public static void main(String[] args) 
	{
		reverseNumUsingConvertString();
		reverseNum();

	}
	public static void reverseNumUsingConvertString() 
	{
		int orgnum=123;
		String orgString = Integer.toString(orgnum);
		String revString="";
		
		for(int i=orgString.length()-1;i>=0;i--) 
		{
	
			revString=revString+orgString.charAt(i);
		}
		int revnum = Integer.parseInt(revString);
		System.out.println("original num is "+orgnum);
		System.out.println("reverse num is "+revnum);
	}
	public static void reverseNum() 
	{
		int num=123;
		int revnum=0;
		for(int i=num;i>0;i=i/10) 
		{
			//System.out.print(i%10);
			int reminder = i%10;
			revnum=revnum*10+reminder;
		}
		System.out.println("original num is "+num);
		System.out.println("reverse num is "+revnum);
	}

}
