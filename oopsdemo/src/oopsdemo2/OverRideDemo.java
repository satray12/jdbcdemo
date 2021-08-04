package oopsdemo2;

class Bank
{
	int getRateofInterest()
	{
		return 0;
	}
	void display()
	{
		System.out.println("Welcome to Bank");
	}
	
}
class SBI extends Bank
{
	int getRateofInterest()
	{
		return 5;
		
	}
}
class ICICI extends Bank
{
	int getRateofInterest()
	{
		return 7;
	}
}
class Axis extends Bank
{
	int getRateofInterest()
	{
		return 6;
	}
}

public class OverRideDemo {

	public static void main(String[] args) {
	
		SBI b1=new SBI();
		ICICI b2=new ICICI();
		Axis b3=new Axis();
		
		b1.display();
		System.out.println("The Rate OF Interest of SBI is: "+b1.getRateofInterest());
		
		b2.display();
		System.out.println("The Rate OF Interest of ICICI is: "+b2.getRateofInterest());
		
		b3.display();
		System.out.println("The Rate OF Interest of AXIS is: "+b3.getRateofInterest());
	}

}
