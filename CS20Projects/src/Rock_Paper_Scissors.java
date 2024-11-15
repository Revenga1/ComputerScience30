import java.util.Scanner;

public class Rock_Paper_Scissors {
//global variables
	private static Scanner input;
	public static int wins = 0;

	public static void main(String[] args) {
		input = new Scanner(System.in);

		boolean runLoop = true;
		String inputText = "";
		

		// Main Menus Loop
		while (runLoop) {
			// let the user know what they can do
			System.out.println("What would you like to do?\n " + "Your options are:\n "
					+ "\trps - Rock Paper Scissors game\n " + "\twins- how much time you won so far\n"
					+ "\tc - Calculator\n" + "\tdc - Weapon Test\n" + "\texit - end program\n");
			// take user input
			inputText = input.nextLine();
			// process that input/ output results
			if (inputText.equalsIgnoreCase("rps")) {// rps
				rps();
			} else if (inputText.equalsIgnoreCase("exit")) {// exit program
				System.out.println("Now exiting program.");
				runLoop = false;
			} else if (inputText.equalsIgnoreCase("wins")) { // wins
				System.out.println("You won " + wins + " times\n");
			} else if (inputText.equalsIgnoreCase("C")) {// calculator
				calculator();
			}else if(inputText.equalsIgnoreCase("Dc")) {//diceroller
				diceRoller();
			}else {
				System.err.println("That is not valid option.\n");
			} // end of if loop

		} // end of Main Menus (while loop)

	}// end of main Method

	private static void diceRoller() {
		int greatAxe = (int) (Math.random() * 12 + 1);
//		System.out.println(greatAxe);

		// The program will then generate two random numbers from 1 to 6
		// Great Sword.
		int greatSwordDie1 = (int) (Math.random() * 6 + 1);
		int greatSwordDie2 = (int) (Math.random() * 6 + 1);
		int greatSword = greatSwordDie1 + greatSwordDie2;
//		System.out.println(greatSwordDie1);
//		System.out.println(greatSwordDie2);
//		System.out.println(greatSword);
//		System.out.println(greatSwordDie1 + greatSwordDie2);

		// The program will then display the damage done by this weapon.
		// SAMPLE OUTPUT:
//		WEAPONS TEST:
//		Great Axe: 8
//		Great Sword: 10
		System.out.println("WEAPONS TEST:");
		System.out.println("Great Axe: " + greatAxe);
		System.out.println("Great Sword: " + greatSword);

//		which is more, tie?
//		The Great Sword did more damage.
		// greatSword is most; greatAxe is most; tie
		if (greatSword > greatAxe) { // greatSword is most
			System.out.println("The Great Sword did more damage.");
		} else if (greatAxe > greatSword) { // greatAxe is most
			System.out.println("The Great Axe did more damage.");

		} else { // tie
			System.out.println("The weapons did the same amount of damage.");
		}

		int diceRoll = rollDice(20);
		System.out.println(diceRoll +"\n");
		
//		SAMPLE OUTPUT:
//		WEAPONS TEST:
//		Great Axe: 8
//		Great Sword: 10
//		The Great Sword did more damage.
	}
	private static int rollDice(int sides) {
		int diceRoll = (int) (Math.random() * sides + 1);
		return diceRoll;
	}//end of dice roller method
	
	private static void calculator() {
		System.out.println(
				"This program is a calculator. It will take 2 decimal numbers, and then an operator, and perform the given calculation.");
		String inputText = "";
		while (!inputText.equals("exit")) {
			calculate();
			System.out.println("Please enter 'exit' to quit program. Enter anything else to continue calculating.");
			inputText = input.nextLine();
		}

	} // end of my main method

	/*
	 * Calculate method will perform a mathematical operation with the given input
	 * private - method can only be called from this file (Main.java) static - no
	 * object creation, the method is called and run without a specific copy made
	 * void - nothing is returned, no value is expected to be returned
	 */
	private static void calculate() {
		// input - 2 #s, operation, some way to get user input
		// variables - local
		double firstNumber = 0; // double data types - decimals
		double secondNumber = 0;
		String operator = "";

		System.out.print("Enter the first number: ");
		firstNumber = input.nextDouble(); // error handling - what if the user doesn't enter a number?
		System.out.print("Enter the second number: ");
		secondNumber = input.nextDouble();

		input.nextLine(); // removes the new line character (enter key)

		System.out.print("Enter the operator (+,-,*,/): ");
		operator = input.nextLine(); // reads in String from input

		// processing
		double answer = 0;
		if (operator.equals("+")) { // +
			answer = firstNumber + secondNumber;
		} else if (operator.equals("-")) { // -
			answer = firstNumber - secondNumber;
		} else if (operator.equals("*")) { // *
			answer = firstNumber * secondNumber;
		} else if (operator.equals("/")) { // /
			answer = firstNumber / secondNumber;
		} else { // all other operator input.
			System.out.println("Not a valid operator");
		}

		// output
		System.out.println(firstNumber + " " + operator + " " + secondNumber + " = " + answer);

	}// end of calculator method

	private static void rps() {
		System.out.println("Welcome to Rock Paper Scissors !");

		// sub menu - while loop
		while (true) {
			// print out options
			System.out.println("What is your move? To make a move, enter: \n" + "\tr for rock\n" + "\tp for paper\n"
					+ "\ts for scissors\n" + "To quit the game, enter: exit\n");

			// take input
			String myMove = input.nextLine();
			// process
			// check if user wants to quit
			if (myMove.equalsIgnoreCase("exit")) {
				break;
			}

			if (!myMove.equalsIgnoreCase("r") && !myMove.equalsIgnoreCase("s") && !myMove.equalsIgnoreCase("p")) {// check
																													// if
																													// input
																													// valid
				System.err.println("Your move is not valid\n");
			} else {// if valid, play game
				System.out.println("We can play the game");

//				if (myMove.equals("r")) {
//					myMove = "Rock";
//				}

				// determine NPC's move
				int computerMoveNum = (int) (Math.random() * 3 + 1);
				String computerMove = "";
				if (computerMoveNum == 1) {// rock
					computerMove = "r";
					System.out.println("The computer has chosen rock.");
				} else if (computerMoveNum == 2) {// paper
					computerMove = "p";
					System.out.println("The computer has chosen paper.");

				} else {// scissors
					computerMove = "s";
					System.out.println("The computer has chosen scissors.");

				}

				// Process it
				/*
				 * Win Conditions: Player: rock && NPC:scissors || (or) Player: paper &&
				 * NPC:rock || Player: scissors && NPC:paper
				 */
				if (myMove.equals(computerMove)) {// ties
					System.out.println("Its a tie !\n");
				} else if (myMove.equals("r") && computerMove.equals("s")
						|| myMove.equals("p") && computerMove.equals("r")
						|| myMove.equals("s") && computerMove.equals("p")) {// wins
					System.out.println("You win!\n");
					wins++;
				} else {// loss
					System.out.println("You lose !\n");
				}

			} // end of valid input else

		} // end of while loop RPS menu
		System.out.println("Thanks for playing!");
		System.out.println("You won " + wins + " times\n");

	}// end of RPS method

}// end of my Class
