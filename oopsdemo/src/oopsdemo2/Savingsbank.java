package oopsdemo2;

public class Savingsbank extends Account {
    
	private int min_bal; // can access only within the class
    protected int  balance;  // can access within the class & in the sub class
	
	public Savingsbank(int accNo, String name,int mb,int b) {
		super(accNo, name);
		this.min_bal=mb;
		this.balance=b;
		
	}
	void display()
    {
            super.display();
            System.out.println ("Minimum Balance: "+min_bal);
            System.out.println ("Saving Balance: "+balance);
    }
		
	}

