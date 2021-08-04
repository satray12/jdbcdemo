package mapdemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {


	public static void main(String[] args) {
		
		// hasmap declaration with key-value pairs
		HashMap<Integer,String> hmap =new HashMap<Integer,String>();
		
        hmap.put(12, "Ravi");
        hmap.put(2, "Ra");
        hmap.put(22, "Rav");
        hmap.put(32, "Rai");
        hmap.put(42, "Rvi");
        
     // Display content using Iterator
        Set s=hmap.entrySet(); // return values from hmap
        Set s1=hmap.keySet();
        System.out.println(s);

        Iterator itr=s.iterator();
        while(itr.hasNext())
        {
            Map.Entry mentry=(Map.Entry) itr.next();
            System.out.println(mentry.getKey()+"-->"+mentry.getValue());
        }

        System.out.println("*******************Key set**********");
        Iterator itr1=s1.iterator();
        while(itr1.hasNext())
        {
            Integer key=(Integer) itr1.next();
            String value=hmap.get(key);
            System.out.println(key+"---->"+value);
        }
        
        
        String name=hmap.get(49);
        System.out.println("The name with key 49 is : "+name);
        
        // remove values based on key
        hmap.remove(2);
        System.out.println(hmap);
        
	}

}
