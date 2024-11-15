import java.util.Scanner;
import java.util.ArrayList; // import the ArrayList class
import java.io.*; //File  Classes for import (or export)
//missing data sets
class Courseproject {
	private static Scanner input2;
	private static ArrayList<String> loc = new ArrayList<String>();
	private static ArrayList<String> sum = new ArrayList<String>();
	static Scanner scanner = new Scanner(System.in);
	static String input = "";
	 static String name = "";
	 static String user="";
	static int atk = 0;
	static int def = 0;

	// Global Variables

	public static void main(String[] args) {

		loc = loadStringList("locations.txt");
		sum = loadStringList("locsummary.txt");

		int locRan = (int) (Math.random() * loc.size());

		input2 = new Scanner(System.in);
		System.out.println("Hello! What is your name?");
		user = input2.nextLine();
		System.out.println("Welcome " + user + "!");
		
		// ------MAIN MENU------- //
		while (true) {
			int rand = randomNum(50, 3);
			System.out.println(randomNum(50, 3));
			System.out.println("\nPick your location, type in a location to pick that location.");
			
			for (int i = 0; i < 3; i++) {
				locRan = (int) (Math.random() * loc.size());
				System.out.println((i) + "		" + loc.get(locRan) );
			}
			input = scanner.nextLine();
			if (input.equalsIgnoreCase("Volcano")) {
				for (int i = 0; i < loc.size(); i++) {
					if (loc.get(i).equalsIgnoreCase(input)) {
						System.out.println(sum.get(i));
					}
				}
			}
		} // end of while
	}// end of main method

	//private static void test() {

	//}


	
	public static int randomNum(double a, double b) {
		a = Math.random()*100;
		b = Math.random()*100;
		return (int) (a+b);

	}// end of method

	public static void mAttack() {

	}// end of method

	public static void eventMan() {

	}// end of method

	
	
	
	
	
	private static ArrayList<String> loadStringList(String filename) {
		ArrayList<String> temp = new ArrayList<String>();
		try {
			BufferedReader file = new BufferedReader(new FileReader(filename));
			while (file.ready()) {
				temp.add(file.readLine());
			} // end while
			file.close();
		} catch (IOException e) {
			System.out.println(e);
		}

		return temp;
	}

}// end of main class
