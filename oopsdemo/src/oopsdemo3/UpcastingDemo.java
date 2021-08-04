package oopsdemo3;

class Game
{
public void play(){

System.out.println("Game is being played");
}

public void noOfPlayers(){

System.out.println("No of players depend upon the game");

}
public void winner(String name){

System.out.println("Winner is : " + name);

}
}
class Cricket extends Game{

public void noOfPlayers(){

System.out.println("22");

}

public void teams(){

System.out.println("2");

}

}

class Chess extends Game{

public void noOfPlayers(){

System.out.println("2");

}
}
/*
 *  Upcasting is used when you want to generalise a function or
 *  property so that it can be used by any of it’s subtype.
 */
public class UpcastingDemo {

	public static void main(String[] args) {

		Game g=new Cricket(); //Upcasting -- Call overriden & base class methods
		Game g1=new Chess(); //Upcasting
		
		System.out.println("------------For dynamic binding CRICKET-------------");
		g.play(); 
		g.noOfPlayers(); //implementation is different....so different value
		g.winner("A");
		
		//g.teams(); //compile error
		
		System.out.println("------------For dynamic binding CHESS-------------");
		g1.play();
		g1.noOfPlayers(); //implementation is different....so different value
		g1.winner("A");
		
		//g1.teams(); //same as above--compile error
		
		System.out.println("------------For static binding CRICKET------------");
		Cricket c=new Cricket(); //no upcasting used
		c.teams(); 

	}

}
