package homeworkString;

public class myStudy {

	public static void main(String[] args)
	{
		b();
		

	}
	private static void b()
	{
		String b=new String("mother");
		System.out.println(b);
		
		System.out.println(b.length());//only show value of b//Length method
		
		int c = b.length();//refrance variable c for store value of b for reuse//length() method
		System.out.println(c);
		
		String d = b.toUpperCase();//refrance variable d for store value of b for reuse//toUppercase() method
		System.out.println(d);
		
		String e = d.toLowerCase();//refrance variable e for store value of d for reuse//tolowercase() method
		System.out.println(e);
		System.out.println("====================");
		System.out.println(b.substring(3));
		System.out.println(b.substring(1, 4));
		
		String b1= new String("is a god");
		System.out.println(b.concat(b1));
		System.out.println(b.concat("love"));
		
	}
	

}
