package HomeworkPolly;

public class Daughter extends Mother 
{
	public void love(String name) 
	{
		super.love("father");//by usinh super keyword we access super class method
		System.out.println("d love "+name);
		
	}
	
	
	
	public static void main(String[] args)
	{
		Mother m=new Mother();
		m.love("father");
		
	System.out.println("===============");	
		
		
		Daughter d=new Daughter();
		d.love("father");
		
	}
	

}
