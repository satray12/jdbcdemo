package oopsdemo3;

public class Student {

	private int rollNo;
	private String Name;
	private static String College="SRM";
	
	static void collegeChange()
	{
		College="RVCE";
	}
	public Student (int rollNo,String name)
	{
		this.rollNo =rollNo;
		this.Name=name;
		
	}
	void display()
	{
		System.out.println(rollNo + " "+ Name +" "+ College);
		
		
	}
}
