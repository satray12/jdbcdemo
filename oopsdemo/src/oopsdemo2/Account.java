package oopsdemo2;

public class Account {

	
	int accNo;
	String name;
	
	public Account(int accNo,String name) {
		this.accNo=accNo;
		this.name=name;
	}
	void display()
	{
		 System.out.println("*********  Details ***********");
	        System.out.println("The Account Num is :" + accNo);
	        System.out.println("The name is :" + name);
	}
	
}
