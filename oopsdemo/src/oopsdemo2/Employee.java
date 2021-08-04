package oopsdemo2;

public class Employee {
	
	int empid;
	String name;
	
	public Employee (int empId,String name)
	{
		this.empid=empId;
		this.name=name;
		
	}
	
	
	

	void display()
	{
		System.out.println("-----------Employee Details----------");
		System.out.println("Employee id:" + empid);
		System.out.println("Employee Name: " +name);

	}
	
}
