package oopsdemo1;
import java.util.Scanner;

class Employee1
{
	int salary,hours;
	
	public void getInfo(int s,int h)
	{
		salary=s;
		hours=h;
	}
	
	public void show_salary()
	{
		System.out.println("Total Salary= $" + salary);
	}
	
	public void AddSal()
	{
		if(salary<500)
		{
			salary=salary+10;
		}
	}
	
	public void AddWork()
	{
		if(hours>6)
		{
			salary=salary+5;
		}
	}
}

public class MySalary {

	public static void main(String[] args) {
		int hours,salary;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No. of Hours per Day ");
		hours=sc.nextInt();
		System.out.println("Enter Salary ");
		salary=sc.nextInt();
		
		Employee1 emp=new Employee1();
		emp.getInfo(salary, hours);
		emp.AddSal();
		emp.AddWork();
		emp.show_salary();
	}

}