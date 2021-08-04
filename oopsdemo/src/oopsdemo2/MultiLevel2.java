package oopsdemo2;


class staff
{
	private int empId;
	private String name;
	protected float salary,hra;
	
	public staff(int empId, String name, float salary) {
		
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
    void getHRA()
    {
    	hra=(salary*60)/100;
    	System.out.println("HRA: "+ hra);
    }
    
    void display()
    {
    	// System.out.println("*************details***********");
    	System.out.println(empId +" "+name+" "+salary);
    	
    }
}
class Manager extends staff
{
    protected float da;
    private float gross;
	public Manager(int empId, String name, float salary) {
		super(empId, name, salary);
		
	}
	void getDA()
	{
		da=(salary*80)/100;
		System.out.println("DA is: "+da);
	}
	void getGross()
	{
		gross=salary+hra+da;
		System.out.println("Gross Salary of Director is: " +gross);
	}
	
	
} 
class Director extends Manager
{
    float ta,gross;
	public Director(int empId, String name, float salary) {
		super(empId, name, salary);
	}
	void getTA()
	{
		ta=(salary*30)/100;
		System.out.println("TA is : "+ta);
	
	}
	void getGross()
	{
		gross=salary+hra+da+ta;
		System.out.println("Gross Salary of Director is :" +gross);
	}
	
	
	
	
	
}


public class MultiLevel2 {

	public static void main(String[] args) {
		Director d1=new Director(101,"Keane",5000);
		System.out.println("******Director Details**********");
		d1.display();
		d1.getHRA();
		d1.getTA();
		d1.getGross();
		
		Manager m1=new Manager(201,"Mary",4000);
		System.out.println("**********m Deatils***********");
		m1.display();
		m1.getHRA();
		m1.getGross();
	
		staff s1=new staff(200,"hero",2006);
		System.out.println("*******S Details*********");
		s1.display();
		s1.getHRA();
	}

}
