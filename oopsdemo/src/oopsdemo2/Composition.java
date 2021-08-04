package oopsdemo2;

class Honda extends Car
{
	public void hondastart()
	{
		Engine heng=new Engine();
		heng.startEngine();
	}


	
}
public class Composition {

	public static void main(String[] args) {
		
		Honda hondaCity = new Honda();
		hondaCity.setColor("Silver");
		hondaCity.setMax_speed(180);
		
		System.out.println("****Honda car details*******");
		System.out.println(hondaCity.getColor()+ "Color");
		System.out.println(hondaCity.getMax_speed()+ "Speed");
		
		hondaCity.hondastart();
		
        
        
        
        
	}

}
