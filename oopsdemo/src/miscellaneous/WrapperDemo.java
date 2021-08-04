package miscellaneous;

public class WrapperDemo {

	public static void main(String[] args) {

		//create primitive types
		int a=5;
		float b=10.10f;
		
		//convert into wrapper objects ---old way to do
		//Integer aObj=new Integer(a);
		//Double bObj=new Double(b);
		
		//--new way to do
		Integer aObj=a; //Auto boxing--converting primitive types into wrapper objects
		Float bObj=b;
		
		//------------------------------------------------------------------------------
		
		//create wrapper class object--- same as above to create wrapper object
		Integer x=Integer.valueOf(100);
		Double y=Double.valueOf(20000.00);
		
		//convert into primitive types
		int p=x.intValue(); //Auto unbox it---  convert object(wrapper) type to value(primitive) type
		double q=y.doubleValue();
		
		System.out.println(aObj+" "+bObj);
		System.out.println(p+" "+q);
		
		char e='a';
		Character objE=e;
		
		System.out.println(objE);
		System.out.println(Character.isUpperCase(objE));
		
		Double d=200.5;
		Double objD=Double.valueOf(d);
		System.out.println(objD);
		System.out.println(Double.toHexString(d));
		System.out.println(Integer.toHexString(15));
		
		String hex="0xff";
		String oct="005";
		
		System.out.println(Integer.decode(hex)); // to convert it into integer
		System.out.println(Integer.decode(oct)); // to convert it into integer
	}
}
