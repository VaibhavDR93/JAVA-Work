package logicalsPrograms;

public class ReverseEvenPositionString {

	public static void main(String[] args) 
	{
		String s="I LOVE MY WORK";
		
		String ary[] = s.split(" ");//{"I","LOVE","MY","WORK"}
		                             // 0     1     2     3
		for(int i=0;i<=ary.length-1;i++) 
		{
			if(i%2!=0)
			{
				String s1 = ary[i];
				ary[i]=reverseString(s1);
				
				
			}
		}
		for(int i=0;i<=ary.length-1;i++)
		{
			System.out.print(ary[i]+" ");
		}



	}
	public static String reverseString(String input)
	{
		String reverse="";
		for(int i=input.length()-1;i>=0;i--) 
		{
			reverse=reverse+input.charAt(i);
		}
		return reverse;
	}

}
