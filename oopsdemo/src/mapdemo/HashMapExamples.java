package mapdemo;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapExamples {

	public static void main(String[] args) {
		HashMap<String,Double> hm=new HashMap<String,Double>();
		
		hm.put("john", 5000.50);
		hm.put("jin", 3400.50);
		hm.put("jon", 9000.76);
		hm.put("jacn", 800.57);
		hm.put("jhny", 9800.90);
		
		 System.out.println("Display Customers & Balance: ");
		    for(String k:hm.keySet())
		    {
		    	System.out.println(k+"---->"+hm.get(k));
		    	
		    }
		    
		    double bal=hm.get("Jin");
		    hm.put("Jin", bal+1000);
		    System.out.println("jin's new balance is : "+ hm.get("Jin"));
		     
		    hm.putIfAbsent("Sat",500.00 );
		    
		    System.out.println(hm);
		    
		    Scanner s=new Scanner(System.in);
		       System.out.println("Enter Customer Name for his Balance :");
		       String name=s.next();
		       System.out.println("The Balance of "+name+ " is :"+hm.get(name));

	}

}
