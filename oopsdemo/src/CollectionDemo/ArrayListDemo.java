package CollectionDemo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {
		//generic arraylist
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("Java");
		a1.add("Perl");
		a1.add("C++");
		a1.add("C#");
		System.out.println(a1);
		//get elements by index
		System.out.println("element at index 1:"+a1.get(1));
		System.out.println("does list contains java?: "+a1.contains("Java"));
		// add elements at specific index
		a1.add(2,"Oracle");
		System.out.println(a1);
		System.out.println("Is ArrayList emplty?: "+a1.isEmpty());
		System.out.println("Index os Perl: "+a1.indexOf("Perl"));
		System.out.println("Size of ArrayList :"+a1.size());
		Collections.sort(a1);
		System.out.println("Array List after sorting: "+a1);
		
       // a1.add(100); // compile error
		ArrayList<Integer> a2=new ArrayList<Integer>();
		a2.add(100);
		a2.add(11);
		a2.add(13);
		a2.add(14);
		System.out.println(a2);
	}

}
