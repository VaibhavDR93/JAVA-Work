package exceptionHandeling;

public class eg2 {

	public static void main(String[] args)
	{
		String a=null;
		
		
		
		try 
		{
			System.out.println(a.charAt(4));//risky code
		}
		catch (NullPointerException e) 
		{
			System.out.println("string value should be not null");//handling code
		}
		catch (StringIndexOutOfBoundsException e) 
		{
			System.out.println("string index must be with in 0 to string max index");
		}
		finally //it is always execute wether the exception is handle by user or not
		{
			System.out.println("hello its done");//closing code
		}
		

	}

}
