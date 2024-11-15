import java.util.Scanner;

public class ToySoldier {
	private static Scanner input;
	// global variable here
	static String name = "";
	static String inputText = "";
	static String npc = "Sarah";
	static int rand = randomNum(50, 3);

	public static void main(String[] args) {

		boolean menu = true;

		// prints a greeting to me (Mr. Artym)!
		// ask the user for text input and then take user input (Scanner), store it in
		// the appropriate variable
		input = new Scanner(System.in);
		System.out.println("Hello! What is your name?");
		name = input.nextLine();
		System.out.println("Welcome " + name + "!");
		while (menu) {
			System.out.println("What would you like to do " + name
					+ "?\n\t1- Generate random soldier units\n\t2- See how much units you have\n\t3- Compare the power of those units\n\t4- Exit the program ");
			System.out.println("   |\\                |\\                |\\                |\\\r\n"
					+ "   || .---.          || .---.          || .---.          || .---.\r\n"
					+ "   ||/_____\\         ||/_____\\         ||/_____\\         ||/_____\\\r\n"
					+ "   ||( '.' )         ||( '.' )         ||( '.' )         ||( '.' )\r\n"
					+ "   || \\_-_/_         || \\_-_/_         || \\_-_/_         || \\_-_/_\r\n"
					+ "   :-\"`'V'//-.       :-\"`'V'//-.       :-\"`'V'//-.       :-\"`'V'//-.\r\n"
					+ "  / ,   |// , `\\    / ,   |// , `\\    / ,   |// , `\\    / ,   |// , `\\\r\n"
					+ " / /|Ll //Ll|| |   / /|Ll //Ll|| |   / /|Ll //Ll|| |   / /|Ll //Ll|| |\r\n"
					+ "/_/||__//   || |  /_/||__//   || |  /_/||__//   || |  /_/||__//   || |\r\n"
					+ "\\ \\/---|[]==|| |  \\ \\/---|[]==|| |  \\ \\/---|[]==|| |  \\ \\/---|[]==|| |\r\n"
					+ " \\/\\__/ |   \\| |   \\/\\__/ |   \\| |   \\/\\__/ |   \\| |   \\/\\__/ |   \\| |\r\n"
					+ " /\\|_   | Ll_\\ |   /|/_   | Ll_\\ |   /|/_   | Ll_\\ |   /|/_   | Ll_\\ |\r\n"
					+ " `--|`^\"\"\"^`||_|   `--|`^\"\"\"^`||_|   `--|`^\"\"\"^`||_|   `--|`^\"\"\"^`||_|\r\n"
					+ "    |   |   ||/       |   |   ||/       |   |   ||/       |   |   ||/\r\n"
					+ "    |   |   |         |   |   |         |   |   |         |   |   |\r\n"
					+ "    |   |   |         |   |   |         |   |   |         |   |   |\r\n"
					+ "    |   |   |         |   |   |         |   |   |         |   |   |\r\n"
					+ "    L___l___J         L___l___J         L___l___J         L___l___J\r\n"
					+ "     |_ | _|           |_ | _|           |_ | _|           |_ | _|\r\n"
					+ "    (___|___)         (___|___)         (___|___)         (___|___)\r\n"
					+ "     ^^^ ^^^           ^^^ ^^^           ^^^ ^^^           ^^^ ^^^");
			inputText = input.nextLine();
			if (inputText.equals("1")) {
				generateNum();
			} else if (inputText.equals("2")) {
				compareNum();
			} else if (inputText.equals("4")) {
				System.out.println("Exiting program..... See you later !");
				menu = false;
			} else if (inputText.equals("3")) {
				fight();
			} else {
				System.err.println("That is not a valid option.");
			}

		} // end of while loop

	}// end of main string arg

	static int medic = 0;
	static int soldier = 0;
	static int sniper = 0;

	private static void generateNum() {
		System.out.println("Welcome General " + name + "!");
		while (true) {
			int medicA = (int) (Math.random() * 10 + 2);
			int soldierA = (int) (Math.random() * 50 + 20);
			int sniperA = (int) (Math.random() * 20 + 1);

			medic = medic + medicA;
			soldier = soldier + soldierA;
			sniper = sniper + sniperA;
			System.out.println(
					"You generated: " + medicA + " Medic, " + soldierA + " soldiers and  " + sniperA + " Snipers.");
			System.out.println("ARMY INFANTRY:");
			System.out.println("You have a total of  " + medic + " medics.");
			System.out.println("You have a total of " + soldier + " soldiers.");
			System.out.println("You have a total of  " + sniper + " snipers.");
			System.out.println("Type \"exit\" to return to menu or \"continue\" to generate more soldiers");
			String exit = input.nextLine();
			if (exit.equalsIgnoreCase("continue")) {
				generateNum();
			} else {
				break;
			} // end of else if
		} // end of true loop

	}// end of generate soldiers method

	public static void fight() {

	}

	private static void compareNum() {
		System.out.println("ARMY INFANTRY:");
		System.out.println("You have a total of  " + medic + " medics.");
		System.out.println("You have a total of " + soldier + " soldiers.");
		System.out.println("You have a total of  " + sniper + " snipers.\n");
	}// end of compare method

	public static void wait(int ms) {
		try {
			Thread.sleep(ms);
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}
	
	//----ROLL DICE METHOD----//
		public static int randomNum(double a, double b) {
			a = Math.random() * 10;
			b = Math.random() * 100;
			return (int) ((a + b));

		}// end of method

}// end of main class

/*
 * Your task is to create a small program that completes some to all of the
 * following. You are to complete this individually. You do not need to complete
 * it all. You will receive a grade based on the quantity of the below list you
 * complete And the needed complexity that your program needs to complete it's
 * task YOUR PROGRAM SHOULD NOT HAVE ANY ERRORS WHEN SUBMITTED - COMMENT OUT ANY
 * PROBLEMATIC CODE!! Consideration will be given for a cohesive theme
 * throughout this!
 */

// Write a Java program that:

// declare a String variable and assign it your name

// print "My name is" and combine it with your String variable

//print out 10 lines using a while/for loop

// print out the input combined with some other text

// determine some random numbers within a range

// print these numbers out

// use some if statements to compare the random numbers
/*
 * 
 * 
  *|\                |\                |\                |\
   || .---.          || .---.          || .---.          || .---.
   ||/_____\         ||/_____\         ||/_____\         ||/_____\
   ||( '.' )         ||( '.' )         ||( '.' )         ||( '.' )
   || \_-_/_         || \_-_/_         || \_-_/_         || \_-_/_
   :-"`'V'//-.       :-"`'V'//-.       :-"`'V'//-.       :-"`'V'//-.
  / ,   |// , `\    / ,   |// , `\    / ,   |// , `\    / ,   |// , `\
 / /|Ll //Ll|| |   / /|Ll //Ll|| |   / /|Ll //Ll|| |   / /|Ll //Ll|| |
/_/||__//   || |  /_/||__//   || |  /_/||__//   || |  /_/||__//   || |
\ \/---|[]==|| |  \ \/---|[]==|| |  \ \/---|[]==|| |  \ \/---|[]==|| |
 \/\__/ |   \| |   \/\__/ |   \| |   \/\__/ |   \| |   \/\__/ |   \| |
 /\|_   | Ll_\ |   /|/_   | Ll_\ |   /|/_   | Ll_\ |   /|/_   | Ll_\ |
 `--|`^"""^`||_|   `--|`^"""^`||_|   `--|`^"""^`||_|   `--|`^"""^`||_|
    |   |   ||/       |   |   ||/       |   |   ||/       |   |   ||/
    |   |   |         |   |   |         |   |   |         |   |   |
    |   |   |         |   |   |         |   |   |         |   |   |
    |   |   |         |   |   |         |   |   |         |   |   |
    L___l___J         L___l___J         L___l___J         L___l___J
     |_ | _|           |_ | _|           |_ | _|           |_ | _|
    (___|___)         (___|___)         (___|___)         (___|___)
     ^^^ ^^^           ^^^ ^^^           ^^^ ^^^           ^^^ ^^^
 * 
 * 
 * 
 */
// print some small ASCII art to the console - https://www.asciiart.eu/
//Hint: Escape characters for " or \ appearing in your art:https://stackoverflow.com/questions/12091506/what-is-the-backslash-character
//Additional hint: how would you print multiple lines?

//20s - declare a custom method and place your above code in proper methods
//higher marks for multiple methods that are appropriately defined and separated
//you may need to declare a global variable or two to make this work properly