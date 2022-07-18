package HomeworkPolly;

public class methodOverloding 
{
	 void show() 
	{
		System.out.println("show 1");
	}
	private void show(int a) 
	{
		System.out.println("show 2");
	}
	protected void show(int a ,int b) 
	{
		System.out.println("show 3");
	}
	
	public static void main(String[] args) 
	{
		methodOverloding mo=new methodOverloding();
		mo.show(5);
	}

	
}
