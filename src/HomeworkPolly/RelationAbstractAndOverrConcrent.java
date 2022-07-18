package HomeworkPolly;

public class RelationAbstractAndOverrConcrent extends RelationAbstractAndOverr
{

	@Override
	void test() {
		System.out.println("i am complete method in concerete class");
		
	}
	
	public static void main(String[] args)
	{
		RelationAbstractAndOverrConcrent rc=new RelationAbstractAndOverrConcrent();
		rc.test();
		rc.test2();
	}
	
	
	
	

}
