 package oopsdemo2;

public class AgrregationDemo {

	public static void main(String[] args) {
		Address ad1=new Address("Bengaluru","Karnataka","India",56649);
		Address ad2=new Address("Prague","Austin","Czech",56650);
		Student s1=new Student(101,"ravi",ad1);
		Student s2=new Student(102,"ra",ad2);
		s1.display();
		s2.display();
	}

}