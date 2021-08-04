package oopsdemo1;

public class StudentTest {

	public static void main(String[] args) {
		Student s1 =new Student();
		s1.input();
		float tot=s1.calculate();
		s1.display();
		System.out.println("Total Displayed from main: "+tot);
	}

	}


