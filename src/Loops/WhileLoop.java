package Loops;

public class WhileLoop {

	public static void main(String[] args) {
		// i want to print 10's table
		
		int a=10; // initialization
		while (a<=100)  //condition
		{
			System.out.println(a); //body statement
			a=a+10;  //updation
		}
		System.out.println("===============");
		//i want to print 20's revirse table
		int p=200;
		while (p>=20)
		{
			System.out.println(p);
			p=p-20;
			
		}
		System.out.println("===============");
		//i want to print 10 time name of bike bullet
		int q=1;
		while (q<=10)
		{
			System.out.println("Bullet");
			q++;
		}
		int b=29;
		while (b<=290)
		{
			System.out.println(b);
			b=b+29;
		}

	}

}
