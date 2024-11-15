package rpg;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero pc; //Declaration, instance of Class Hero
		pc = new Hero("Sarah");  //Initialization through constructor
		
		System.out.println("Name: " + pc.getName());
		System.out.println("Current HP: " + pc.getHP());
	}

}
