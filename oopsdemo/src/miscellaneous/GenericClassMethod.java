package miscellaneous;

//it will accept data of any type as we have declared as T, we can give any type in the main 
class Sample<T> //parametrized classes /generic class
{
	private T data; //generic variable declaration

	public Sample(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}
	
}
public class GenericClassMethod {

	public static void main(String[] args) {
		
		Sample<String> s1=new Sample<String>("Java Generics"); //creating an object of type String
		System.out.println("Display from generic class by passing String object :"+s1.getData());
		
		Sample<Integer> s2=new Sample<Integer>(200); //creating an object of type Integer
		System.out.println("Display from generic class by passing String object :"+s2.getData());
		
		Sample<Double> s3=new Sample<Double>(550.5); //creating an object of type  Double
		System.out.println("Display from generic class by passing String object :"+s3.getData());

	}

}
