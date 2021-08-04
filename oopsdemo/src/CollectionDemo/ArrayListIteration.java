package CollectionDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteration {

	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<String>();
		names.add("James");
		names.add("Mike");
		names.add("Andy");
		names.add("jim");
		names.add("Robert");
		System.out.println(names);
		//Iterator Interface for Transversing
		Iterator<String> itr=names.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(names.get(1));
		names.add(3,"Sat");  //adding element in specified index
		names.remove(0); //del first element
		names.set(1, "Java"); //replace existing element
		System.out.println("Display collection using for each loop");
		for(String i:names) {
			System.out.println(i);
		}
		ArrayList<Double> marks=new ArrayList<Double>();
		marks.add(99.45);
		marks.add(300.30);
		marks.add(349.30);
		marks.add(768.30);
		marks.add(588.30);
		System.out.println();
		for(Double i:marks) {
			System.out.println(i);
		}
	}


}
