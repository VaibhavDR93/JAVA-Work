package homeworkLogicalProgram;

public class numbers {

	public static void main(String[] args) 
	{
		primenum();
		System.out.println("==========================");
		reverseString();
		System.out.println("==========================");
		reversenum();
		System.out.println("==========================");
		reversenum2();
		System.out.println("==========================");
		factorialnum();
		System.out.println("==========================");
		armstrongnum();

	}
	public static void primenum()
	{
		int num=7;
		int count=0;
		for(int i=1;i<=num;i++) 
		{
			if(num%i==0) 
			{
				count++;
			}
		}
		if(count==2) 
		{
			System.out.println("its a prime number");
		}
		else
		{
			System.out.println("its not a prime number");
		}
	}
	public static void reverseString() 
	{
		String str="new";
		String rev="";
		for(int i=str.length()-1;i>=0;i--) 
		{
			rev=rev+str.charAt(i);
		}
		System.out.println("reverse string is "+rev);
	}
	public static void reversenum()
	{
		int orgnum=123;
		String orgstr = Integer.toString(orgnum);
		String revstr="";
		for(int i=orgstr.length()-1;i>=0;i--)
		{
			revstr=revstr+orgstr.charAt(i);
		}
		int revnum = Integer.parseInt(revstr);
		System.out.println("reverse num is "+revnum);
		
	}
	public static void reversenum2() 
	{
		int num=123;
		int revnum=0;
		for(int i=num;i>0;i=i/10) 
		{
			//System.out.print(i%10);
			revnum=revnum*10+i%10;
		}
		System.out.println("rev num is "+revnum);
	}
	public static void factorialnum() 
	{
		//5!=5*4*3*2*1
		int num=7;
		int result=1;
		for(int i=num;i>=1;i--)
		{
			result=result*i;
		}
		System.out.println("factorial value is "+result);
		
	}
	public static void armstrongnum()
	{
		//123=1^3+2^3+3^3=36 not armstrong num
		//153=1^3+5^3+3^3=153 it is armstrong number
		int num=153;
		int result=0;
		for(int i=num;i>=1;i=i/10)
		{
			int value = i%10;
			result=result+(value*value*value);
		}
	    if(num==result) 
	    {
	    	System.out.println("given num is armstrong number");
	    }
	    else 
	    {
	    	System.out.println("given num is not armstrong number");
	    }
		
	}
	
	

}
