package newFeatures;

interface MyFunctionInterface
{
	public String sayHello();
	
}
interface MyFunctionInterface1
{
	public int incrementbyFive(int a);
	
}

interface StringConcat
{
	public String sconcat(String a,String b);
	
}


public class LambdaExpressionDemo {

	public static void main(String[] args) {
		
		// lambda expression with no parameter
		
		 MyFunctionInterface msg=()-> {return "Hello from Lambda Expression"; };
		System.out.println(msg.sayHello());

		 MyFunctionInterface1 f=(num)-> num+5;
		 System.out.println(f.incrementbyFive(20));
		 
		 /// lambda express with multiple args
		 StringConcat s=(str1,str2)->str1+str2;
		 System.out.println("String concat using lambda expression");
		 System.out.println(s.sconcat("Hello","Java 8"));
		 
	}

}
