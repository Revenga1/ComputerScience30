package parallelDataStructureSorting;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner; //Import ONLY the Scanner library/class to our file

class SortingProject {

	private static Scanner scanner = new Scanner(System.in);

	/*
	 * Class variables: Use a sports league or (something similar like a music or
	 * dance competition) and create 3 parallel data structures. You may use
	 * whichever data structure you feel works best. The three lists must be similar
	 * to the following: competitor’s name competitor’s team points (use Integers as
	 * opposed to integers) Use an Array, Arraylist, Vector, or Objects! (check on
	 * W3Schools for documentation)
	 */

	private  static String textInput = new String();
	private static Scanner myScanner = new Scanner(System.in);
	static Superbeast[] coolArray = new Superbeast[50];
	static int arrayIndex = 49;

	public static void main(String[] args) {

		String line = "";
		String splitBy = ",";

		try {

			BufferedReader br = new BufferedReader(new FileReader("nhl2.csv"));
			int index = 0;
			while ((line = br.readLine()) != null) {

				String[] playaList = line.split(splitBy); // use comma as separator
//			  System.out.println("First name: " + playa[0]);
				int points = Integer.parseInt(playaList[2]);
				coolArray[index] = new Superbeast(playaList[0], playaList[1], points);
				index++;

			}

		} catch (IOException e) {
			e.printStackTrace();

		}

//		coolArray= new Superbeast[11];
//		coolArray[0]= new Superbeast("Mannal", "The AllMan", 0);
//		coolArray[1]= new Superbeast("Tolu", "The Fingers", 0);

		while (!textInput.equals("exit")) {
			System.out.println("***********************\n" + "Your choices are:\n" + "data- view list of name\n"
					+ "add - add competitor\n" + "update - updated points\n"
					+ "players points - prints players from highest to lowest points\n"
					+ "alpha - prints players in alphabetical order\n" + "total points - prints team's totals\n"
					+ "search- search a specific player\n" + "exit - exit program");
			textInput = myScanner.nextLine();
			if (textInput.equals("add")) { // done
				add();
			} else if (textInput.equals("data")) { // done
				data();
			} else if (textInput.equals("update")) {// done
				update();
			} else if (textInput.equals("players points")) {
				playerPoints();
			} else if (textInput.equals("alpha")) {// done
				alpha();
			} else if (textInput.equals("total points")) {// done
				teamPoints();
			} else if (textInput.equals("search")) { // done
				search();
			}
		}

	}

	private static void search() {
		try {
			String input = scanner.nextLine();
			int indexSearch = Search.binarySearch2(coolArray, input);
			System.out.println(coolArray[indexSearch].getName() + " | " + coolArray[indexSearch].getTeam() + " | "
					+ coolArray[indexSearch].getPoints());
		} catch (Exception e) {
			System.out.println("Not found");
		}

	}

	private static void data() {

		for (int i = 0; i < coolArray.length; i++) {
			System.out.println(coolArray[i].getName());
		}

	}

	/*
	 * add competitor (this would then ask for a name, team and points)
	 */
	private static void add() {
		try {
			increaseSize();
			arrayIndex++;
//			Superbeast[] largerArray = Arrays.copyOf(coolArray, 10);
			// SHAKING MY FIST AT SKY
			// note: need to fix update and alpha not working becuase of null cuased my
			// empty memory which means i need to fix update URGH
			// This can be fixed by usuing arraylists but i would have to rewrite
			// every...sigh :(
			// coolArray = new Superbeast[coolArray.length+1];
			System.out.println("Enter a name:");
			String inputName = scanner.nextLine();
			System.out.println("Enter a team:");
			String inputTeam = scanner.nextLine();
			System.out.println("Enter points:");
			int inputPoint = Integer.parseInt(scanner.nextLine());

			coolArray[arrayIndex] = new Superbeast(inputName, inputTeam, inputPoint);
			System.out.println(coolArray[arrayIndex].getName() + "	" + coolArray[arrayIndex].getTeam() + "	"
					+ coolArray[arrayIndex].getPoints());
		} catch (Exception e) {
			System.out.println("Not a valid input");
		}
	}

	/*
	 * update points (this would ask for competitor’s name - you can assume no
	 * matching names - then the latest points total)
	 */
	private static void update() {
		try {
			System.out
					.println("***NOTE: MAKE SURE TO HAVE THE LIST IN ALPHA ORDER FIRST IN THE MENU!***\nEnter a name:");
			String inputName = scanner.nextLine();
			int index = Search.binarySearch2(coolArray, inputName);
			System.out.println(coolArray[index].getName() + "   |   " + coolArray[index].getTeam() + "   |   "
					+ coolArray[index].getPoints());
			System.out.println("Enter the points to be updated:");
			int inputPoint = Integer.parseInt(scanner.nextLine());
			coolArray[index].setPoints(inputPoint);
			System.out.println(coolArray[index].getName() + "   |   " + coolArray[index].getTeam() + "   |   "
					+ coolArray[index].getPoints());
		} catch (Exception e) {
			System.out.println("Invalid name or points");
		}

	}

	/*
	 * print players from highest to lowest points (prints all three lists out in a
	 * table of some kind)
	 */
	private static void playerPoints() {

		Sort.bubbleSortInt(coolArray);
		for (int i = 0; i < coolArray.length; i++) {
			System.out.println(coolArray[i].getPoints());
		}
		Sort.bubbleSort(coolArray);

	}

	/*
	 * print players in alphabetical order (prints all three lists in a table of
	 * some kind)
	 */
	private static void alpha() {
		Sort.bubbleSort(coolArray);
		System.out.println("Sorted!");
		for (int i = 0; i < coolArray.length; i++) {
			System.out.println(coolArray[i].getName());
		}

	}

	/*
	 * print team totals (this prints each team name and then prints out the total
	 * points for each team in a table of some kind)
	 */
	private static void teamPoints() {
		int tempPoints = 0;
		String input = scanner.nextLine();
		for (int i = 0; i < coolArray.length; i++) {
			if (coolArray[i].getTeam().equalsIgnoreCase(input)) {

				System.out.println(coolArray[i].getName() + "   |   " + coolArray[i].getPoints());
				tempPoints = tempPoints + coolArray[i].getPoints();

			}
		}
		System.out.println("Total Points: " + tempPoints);
	}

	private static void increaseSize() {
		Superbeast[] temp = new Superbeast[coolArray.length + 1];

		for (int i = 0; i < coolArray.length; i++) {
			temp[i] = coolArray[i];
		}
		coolArray = temp;
	}

}// end of class
//https://www.javatpoint.com/how-to-read-csv-file-in-java
//https://stackoverflow.com/questions/12524318/how-to-increase-the-size-of-an-array-in-java