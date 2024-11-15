
package improvedRPG;

import java.util.Scanner;

public class Game {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// CTRL SHIFT F - auto indent
		
		System.out.println("Welcome to");
		System.out.println("CLASSIC RPG 2023: ");
		System.out.println("CS 30 Edition n");
		
		System.out.print("\tWhat is the hero's name: ");
		String heroName = scanner.nextLine();
		Hero hero = new Hero(heroName);
		
		System.out.println("Welcome to DAAHS, " + hero.getName()+"!");
		System.out.println("You encounter an enemy!");
		
		//create a new encounter
		Encounter encounter = new Encounter(hero, new Enemy("Goblin",100,50,150));
		
		//while encounter is active
		while (encounter.isActive()) {
			//show options
			System.out.println("What would you like to do?");
			System.out.println("a - attack");
			System.out.println("d - defend");
			//take input
			System.out.print("Enter your choice: ");
			String choice = scanner.nextLine();
			//process input
			if(choice.equals("a")) {	//for attack
				encounter.attack();
			}else if (choice.equals("d")) { //for defend
				encounter.defend();
			}else { //invalid input
				System.out.println("Invalid choice! Try again.");
			}
			
		}
		scanner.close();
	}

}