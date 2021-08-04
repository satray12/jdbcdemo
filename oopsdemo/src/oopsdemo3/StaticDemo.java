package oopsdemo3;

class Count
{
	static int cnt;
	int a;
	
	Count ()
	{
		cnt+=1;
		a=100;
	}
	
	static void display()
	{
		System.out.println("no.of objects created : "+cnt);
	}
	
	void print()
	{
		System.out.println("Instance method");
	}
	
}

public class StaticDemo {

	public static void main(String[] args) {
		
		Count c1=new Count();
		Count c2=new Count();
		Count c3=new Count();
		
		c1.print();
		// c1.display();
		
		Count.display();
		

	}

}
