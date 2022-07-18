package HomeworkUpCasting;

public class ChromeDriver implements WebDriver
{

	@Override
	public void getTitle() 
	{
		System.out.println("get title");
	}

	@Override
	public void quit() 
	{
		System.out.println("quit");
	}

	@Override
	public void close() 
	{
		System.out.println("close");
	}
	
	public void search()
	{
		System.out.println("search");
	}
	
	public static void main(String[] args) 
	{
		WebDriver Driver=new ChromeDriver();//UPcasting
		Driver.getTitle();
		Driver.quit();
		Driver.close();
		//Driver.search();
		
	System.out.println("=========================");	
	
		ChromeDriver driver=new ChromeDriver();
		driver.getTitle();
		driver.quit();
		driver.close();
		driver.search();
		
		
		
		
	}

}
