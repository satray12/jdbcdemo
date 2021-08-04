package oopsdemo3;

class Test
{
	int a;
	private int b;
	protected int c;
	public int d;
	
	
	public Test(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		d=500;
	}



	public void display()
	{
		System.out.println("Private Variable: "+b);
	}
	


class Test2 extends Test
{


public Test2(int a, int b, int c) {
		super(a, b, c);
}
public void display()
{
	System.out.println("Protected Variable: "+c);

}



		
		
		
		
	}

public class AccessSpecifierDemo {

	public static void main(String[] args) {
	
		Test t1=new Test(100,200,300);
		t1.display();
		// t1.b=50;
		System.out.println("Default variable: "+t1.a);
		

	}
}

}

