package CollectionDemo;

import java.util.HashSet;
import java.util.Set;

// hash set with user deined objects
public class HashSetDemoUserDefined {

	public static void main(String[] args) {
		Set< Customer > customers =new HashSet<Customer>();
		
		customers.add(new Customer(101,"Arun","Bengaluru"));
		
		customers.add(new Customer(121,"Mike","Newyork"));
		customers.add(new Customer(122,"Mikey","New"));
		customers.add(new Customer(123,"luike","Sydney"));
		customers.add(new Customer(124,"huskey","york"));
		// add duplicate customer
		/*
        HashSet will use the `equals()` & `hashCode()` implementations 
        of the Customer class to check for duplicates and ignore them
      */
		customers.add(new Customer(121,"Mike","Newyork"));
		
		for (Customer i:customers)
		{
			System.out.println(i.getId() + " "+i.getName() +" "+i.getCity());
		}

	}

}
