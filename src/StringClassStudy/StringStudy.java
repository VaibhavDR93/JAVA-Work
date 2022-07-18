package StringClassStudy;

public class StringStudy {

	public static void main(String[] args) 
	{
		String name="vaibhav"; //without using new keyword
		String city=new String("pune");//with using new keyword
		
		//length() method use
		
		System.out.println(name.length());//only show output
		System.out.println(city.length());//only show output
		
		int output = name.length();//store output in refrance variable
		System.out.println(output);//we can reuse refrance variable
		
		System.out.println("============================");
		
		//touppercase() & toLowercase() method use
		
		String a="testing";
		
		System.out.println(a);
		System.out.println(a.toUpperCase());//only show output
		
		String b = a.toUpperCase();//out put store in refrance variable
		System.out.println(b);//we can reuse refrance variable
		
		String c = b.toLowerCase();
		System.out.println(c);//by reusing refrance variable of b we make out put for c
		System.out.println("============================");
		
		//equals() method
		String a1="Vaibhav";
		String a2="Vaibhav";
		String a3=new String("Vaibhav");
		String a4=new String("Vaibhav");
		String a5=new String("vaibhav");
		
		//== will compare memory location that will not compaire string content
		System.out.println(a1==a2);
		System.out.println(a1==a3);
		System.out.println(a3==a4);
		System.out.println(a5==a3);
		System.out.println("============================");
		//equals will compaire string content
		System.out.println(a1.equals(a2));
		System.out.println(a1.equals(a3));
		System.out.println(a2.equals(a4));
		System.out.println(a4.equals(a5));
		System.out.println(a4.equalsIgnoreCase(a5));
		System.out.println("============================");
		
		//contains() method use for character sequance is true or false
		String b1="Vaibhav";
		
		System.out.println(b1.contains("bha"));
		System.out.println(b1.contains("ba"));
		System.out.println(b1.contains("a"));
		
		boolean b2 = b1.contains("vai");
		System.out.println(b2);
		System.out.println("============================");
		
		//isEmpty() mwthod
		String c1="Barshi";
		String c2="";
		String c3=" ";
	//	String c4=null;
		
		System.out.println(c1.length());
		System.out.println(c2.length());
		System.out.println(c3.length());
		//System.out.println(c4.length());//NullPointerExceptios error during run time
		
		System.out.println(c1.isEmpty());
		System.out.println(c2.isEmpty());
		System.out.println(c3.isEmpty());
		//System.out.println(c4.isEmpty());//NullPointerExceptios error during run time
		System.out.println("============================");
		System.out.println(c1.isBlank());
		System.out.println(c2.isBlank());
		System.out.println(c3.isBlank());
		
		System.out.println("============================");
		
		//charAt() method
		String d1="LOVE";
		
		System.out.println(d1.charAt(0));
		System.out.println(d1.charAt(3));
	//	System.out.println(d1.charAt(4));//StringIndexOutOfBoundsException error during run time
		char d2 = d1.charAt(2);
		System.out.println(d2);
		System.out.println("============================");
		
		//endWith() method
		
		String e="Vaibhav";
		
		System.out.println(e.endsWith("v"));
		System.out.println(e.endsWith("V"));
		System.out.println(e.endsWith("hav"));
		System.out.println(e.endsWith("hv"));
		System.out.println("============================");
		//startWith() method
		System.out.println(e.startsWith("V"));
		System.out.println(e.startsWith("v"));
		System.out.println(e.startsWith("Vai"));
		System.out.println(e.startsWith("bha", 3));
		System.out.println("============================");
		
		//substring() method
		String f="I Love You";
		
		System.out.println(f.substring(0));
		System.out.println(f.substring(1));
		System.out.println(f.substring(2));
		System.out.println(f.substring(0, 6));
		System.out.println(f.substring(0, 5));
		System.out.println(f.substring(2, 10));
		System.out.println("============================");
		
		//concat() method
		String g="Apple";
		String g1="Fruit";
		
		System.out.println(g.concat(g1));
		System.out.println(g+" ".concat(g1));
		System.out.println(g.concat(" ").concat(g1));
		System.out.println("============================");
		
		//indexOf() method
		String h="VAIBHAVVAIB";
		
		System.out.println(h.indexOf("V"));
		System.out.println(h.indexOf('I'));
		System.out.println(h.indexOf('I', 1));
		System.out.println(h.indexOf('I', 8));
		System.out.println(h.indexOf('V', 5));
		System.out.println(h.lastIndexOf('I'));
		System.out.println("============================");
		
		//replace() method
		String i="Vaibhav shinde";
		
		
		System.out.println(i.replace('V', 'b'));
		System.out.println(i.replace('i', 'p'));
		System.out.println(i.replace("ai", "mm"));
		System.out.println(i.replace(' ', '@'));
		
		
		
		
		
		
		
		
		
		
		
			
		
		
		
		
		
		
		
		
		
		
	

	}

}
