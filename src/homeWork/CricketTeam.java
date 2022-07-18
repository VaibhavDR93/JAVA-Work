package homeWork;

public class CricketTeam {

	public static void main(String[] args) 
	{
		CricketTeam CT=new CricketTeam();//created object for non static method
		CT.player("Rohit sharma", 36, 5.9f, "Opening Batsman", 45);//calling Non static M with parameter
		CT.careerResult(44, 228, 124);
		CT.TopScore(212, 264, 118);

	}
	public void player(String name,int age,float height,String role,int shirtNo)//NSM with parameters
	{
		System.out.println("Name             "+name);
		System.out.println("Age              "+age);
		System.out.println("Height           "+height);
		System.out.println("Role             "+role);
		System.out.println("Shirt no.        "+shirtNo);
	}
	public void careerResult(int test,int odi,int T20) 
	{
		System.out.println("Competition      Test      ODI      T20");
		System.out.println("matches           "+test+"       "+odi+"      "+T20);
		
	}
     public void TopScore(int test,int odi,int T20) {
    	 System.out.println("Top score         "+test+"       "+odi+"      "+T20);
     }
}
