package mapdemo;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapDemo1 {

	public static void main(String[] args) {
	
		HashMap<Integer, String> languages = new HashMap<>();
	    languages.put(1, "Java");
	    languages.put(2, "Python");
	    languages.put(3, "JavaScript");
	    
	    System.out.println("HashMap: " + languages);
	    
	    String value=languages.get(1);
	    System.out.println("Value at index 1: "+value);
	    System.out.println("Value at index 3: "+ languages.get(3));
	    
	    System.out.println("keys: "+languages.keySet());
	    System.out.println("Values: "+languages.values());
	    
	    System.out.println("keys-Value Mappings: "+languages.entrySet());
	    
	    languages.replace(2, "c++");
	    System.out.println("keys: ");
	    for(Integer k:languages.keySet())
	    {
	    	System.out.println(k+"---->"+languages.get(k));
	    	
	    }
	    
	    System.out.println("Entries: ");
	    for(Entry<Integer,String>entry:languages.entrySet())
	    {
	    	System.out.println(entry);
	    }
	}

}
