package TypesOfVariable;

public class GlobalAndLocalVariable {
	int a=50;          //non static global variable
	static int b=30;   //static global variable

	public static void main(String[] args) {
		GlobalAndLocalVariable GLV=new GlobalAndLocalVariable();// creating object of a class
		System.out.println("value of non static variable a is "+GLV.a);//calling non static global variable from same class
		System.out.println("value of  static variable b is "+b);//calling  static global variable from same class
		
		VariableDiffrentClass VDC=new VariableDiffrentClass();//object for diffrent class
		System.out.println("value of non static variable c is "+VDC.c);////calling non static global variable from diff class
		System.out.println("value of  static variable d is "+VariableDiffrentClass.d);////calling  static global variable from diff class
		
		int sum=GLV.a+b;
		System.out.println(sum);
		
		int mul=GLV.a*VDC.c;
		System.out.println(mul);
		
		int sub=VariableDiffrentClass.d-b;
		System.out.println(sub);
		
		int div=GLV.a+b/VDC.c+VariableDiffrentClass.d;
		System.out.println(div);
		}

}
