package assignment;

import java.util.ArrayList;
import java.util.Collections;



public class Student implements Comparable<Student> {
	int rollNo,marks;
	String name,course;
	
	
	public Student(int rollNo, String name, int marks, String course) {
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
		this.course = course;
	}

	@Override
	public int compareTo(Student o) {
		if(marks==o.marks)
			return 0;
		else if(marks>o.marks) 
			return -1;
		else
			return 1;
}
	public static void main(String[] args) {
		ArrayList<Student> a1=new ArrayList<Student>();
		Student s1=new Student(101,"sat",77,"Math");
		Student s2=new Student(102,"sani",69,"Eng");
		Student s3=new Student(103,"swaraj",96,"Ss");
		Student s4=new Student(104,"Mike",97,"Geo");
		//adding student list
		a1.add(s2);a1.add(s3);a1.add(s1);a1.add(s4);
		Collections.sort(a1); //invoke compareTo() method of student java
		System.out.println("************Student sorted list based on marks***************");
		for(Student s:a1) {
			System.out.println(s.rollNo+" "+s.name+" "+s.marks+" "+s.course);
}
	}
}