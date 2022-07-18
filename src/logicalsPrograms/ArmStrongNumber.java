package logicalsPrograms;

public class ArmStrongNumber {

	public static void main(String[] args) 
	{
	       armStrongNum();	

	}
	public static void armStrongNum() 
	{
		//123-->1^3+2^3+3^3=36 not armstrongnum
		//153-->1^3+5^3+3^3=153  armstrongnum
		
		int num=153;
		int addnum=0;
		for(int i=num;i>0;i=i/10)
		{
			int reminder = i%10;
			addnum=addnum+(reminder*reminder*reminder);
			System.out.println(addnum);
		}
		if(num==addnum)
		{
			System.out.println("given number "+num+" is armstrongnumber");
		}
		else 
		{
			System.out.println("given number "+num+" is not armstrongnumber");
		}
		
		
	}

}
