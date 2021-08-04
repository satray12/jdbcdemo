package oopsdemo1;

import oopsdemo3.Demo;

public class TestDemo {

	public static void main(String[] args) {
		Demo d1=new Demo();
		
		System.out.println("Public variable of Demo class in another Package :"+d1.a);
		
		d1.display();

	}

}
