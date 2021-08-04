package oopsdemo3;

public class Teststatic {

	public static void main(String[] args) {
		
		Student.collegeChange();
		
		Student s1=new Student(101,"Mike");
		Student s2=new Student(141,"John");
		Student s3=new Student(1401,"Michel");
		
		
		s1.display();
		s2.display();
		s3.display();
		
	}

}
