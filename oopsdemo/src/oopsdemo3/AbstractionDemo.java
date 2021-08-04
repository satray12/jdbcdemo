package oopsdemo3;

public class AbstractionDemo {

	public static void main(String[] args) {
		Trainee t1=new Marks("John","New York",1001,35); //Upcasting
		
		t1.show(); //invoke abstract base class method
		double marks=t1.calculateMarks(); //invoke sub class method
		
		System.out.println(t1+" "+marks);//show the memory address

	}

}
