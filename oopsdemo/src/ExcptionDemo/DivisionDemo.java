package ExcptionDemo;

import java.util.Scanner;

public class DivisionDemo {

	public static void main(String[] args) {
		int a, b, result;  
        Scanner input = new Scanner(System.in);
         System.out.println("Input two integers");
         a = input.nextInt();
         b = input.nextInt();  
         
         try
         {
        	 result = a / b;  
             System.out.println("Result = " + result);
         }
         catch(ArithmeticException e)
         {
        	 System.out.println("Divide by Zero Error");
        	 System.out.println("Exception Description : "+ e.getMessage());
        	 System.out.println("Exception Name & Description : "+e.toString());
        	 e.printStackTrace();  
        	 
         }
         finally // clean-up operations
         {
        	 input.close();
        	 System.out.println("In Finally Block-Program execution ended");
        	 
         }
	}

}
