package Constructor;

public class DefaultConstructor {
	
	
	//public DefaultConstructor()
	//{
	//     default constructor--->created by compiler
	//}

	public static void main(String[] args)
	{
		DefaultConstructor DC=new DefaultConstructor();
		DC.add(10, 5);

	}
     public void add(int a, int b) 
     {
    	 System.out.println(a+b);
     }
}
