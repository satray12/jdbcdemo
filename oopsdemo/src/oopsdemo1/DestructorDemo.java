package oopsdemo1;

class Test
{
	public void finalize()
	{
		System.out.println("object Destroyed & Garbage Collected ");
	}
}

public class DestructorDemo {

	public static void main(String[] args) {
		Test t1=new Test();
		Test t2=new Test();
		 t1=null;
		 t2=null;
		 
		 System.gc();
		 
		 System.out.println("In main method");

	}

}
