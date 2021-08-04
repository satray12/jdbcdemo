package oopsdemo1;

import java.util.Scanner;

public class Student {

	// properties
	int rollNumber;
	String name,course;
	float m1,m2,m3,total;
	Scanner s=new Scanner(System.in);
	
	//methods
	
	void input()
	{
		System.out.println("enter roll number,Name,course:");
		rollNumber=s.nextInt();
		name=s.next();
		course=s.next();
		
		System.out.println("enter marks of 3 subjects: ");
		m1=s.nextFloat();
		m2=s.nextFloat();
		m3=s.nextFloat();
	}
	float calculate()
	{
		total=m1+m2+m3;
		return total;
	}
	
	void display()
	{
		System.out.println("******Students Details*******");
		System.out.println(" Roll number: "+ rollNumber);
		System.out.println("Name  :"+name);
		System.out.println("Course: "+course);
		System.out.println("Total marks :"+total);
		System.out.println("*****************************");
	}
	
}
