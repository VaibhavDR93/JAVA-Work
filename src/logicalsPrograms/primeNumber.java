package logicalsPrograms;

public class primeNumber {

	public static void main(String[] args) 
	{
		primeNum();

	}
	public static void primeNum()
	{
		//prime number have two factors 1 and number itself
		//3--->1 & 3
		
		int num=17;
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
			System.out.println("number is prime");
		}
		else
		{
			System.out.println("number is not prime");
		}
		
	}

}
