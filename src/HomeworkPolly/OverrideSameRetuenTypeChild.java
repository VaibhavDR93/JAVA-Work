package HomeworkPolly;

public class OverrideSameRetuenTypeChild extends OverrideSameRetuenType 
{
	public String show() 
	{
		super.show();
		System.out.println("b");
		return null;
		
	}
	
	 public static void main(String[] args)
	{
		OverrideSameRetuenTypeChild oc=new OverrideSameRetuenTypeChild();
		oc.show();
		
	}

}
