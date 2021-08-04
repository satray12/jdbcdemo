package CollectionDemo;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo {

	public static void main(String[] args) {
		
		ArrayList<Student> a1=new ArrayList<Student>();
		
		Student s1=new Student(101,"Mike",19);
		Student s2=new Student(101,"Mie",19);
		Student s3=new Student(101,"Mke",19);
		Student s4=new Student(101,"Mie",19);
		Student s5=new Student(101,"Mik",19);
		
		a1.add(s2);a1.add(s3);a1.add(s1);a1.add(s4);a1.add(s5);
		
		Collections.sort(a1);
		
		System.out.println("***********Student sorted list based on age*******");
		for(Student s:a1)
		{
			System.out.println(s.rollNo+" "+s.name+" "+s.age);
		}
		
	}

}
