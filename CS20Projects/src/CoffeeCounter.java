import java.util.ArrayList;
import java.util.Scanner;


public class CoffeeCounter {
//global variable here
	static int cCounter = 0;
	static double fCounter = 0;
	static double sCounter = 0;
	static int coffee = 0;
	private static Scanner input;
	 public static final String RED = "\033[1;31m";   
	 public static final String RESET = "\u001B[0m";
	 public static final String YELLOW = "\033[1;33m";
	
	
	public static void main(String[] args) {
		
	ArrayList<String> cName = new ArrayList<String>(); 
	cName.add("Dark Roast");
	cName.add("Medium Roast");
	cName.add("True North");
	cName.add("Cafe Misto");
	cName.add("Light Roast");
	cName.add("Iced Coffee");
	cName.add("Cold Brew");
	cName.add("Americano");
	cName.add("Latte");
	cName.add("Mocha");
	cName.add("Cappuccino");
	cName.add("Flat White");
	cName.add("Skinny Mocha");
	
	ArrayList<Integer> Calorie = new ArrayList<Integer>();
	Calorie.add(4);
	Calorie.add(4);
	Calorie.add(4);
	Calorie.add(60);
	Calorie.add(10);
	Calorie.add(60);
	Calorie.add(2);
	Calorie.add(10);
	Calorie.add(100);
	Calorie.add(190);
	Calorie.add(60);
	Calorie.add(100);
	Calorie.add(130);

	ArrayList<Double> Fat = new ArrayList<Double>();
	Fat.add(0.1);
	Fat.add(0.1);
	Fat.add(0.1);
	Fat.add(3.0);
	Fat.add(0.001);
	Fat.add(0.001);
	Fat.add(0.01);
	Fat.add(0.0);
	Fat.add(3.7);
	Fat.add(1.0);
	Fat.add(2.5);
	Fat.add(0.3);
	Fat.add(1.0);
	
	ArrayList<Double> Sugar = new ArrayList<Double>();
	Sugar.add(0.001);
	Sugar.add(0.001);
	Sugar.add(0.0);
	Sugar.add(5.0);
	Sugar.add(0.1);
	Sugar.add(10.0);
	Sugar.add(0.1);
	Sugar.add(10.0);
	Sugar.add(7.0);
	Sugar.add(4.0);
	Sugar.add(6.0);
	Sugar.add(2.0);
	Sugar.add(1.0);
	
	System.out.println(YELLOW +"	/******/List of Coffee/******/" + RESET);
	System.out.println("	Coffee");
	for (int i = 0; i < cName.size(); i++) {
		System.out.println((i)+"	"+cName.get(i) );
		
	}//end of for loop
	
	boolean runLoop = true;
	String inputText = "";
	input = new Scanner(System.in);
	int cAvg = 0;
	double fAvg = 0;
	double sAvg = 0;
	
	while (runLoop) {
		System.out.println(YELLOW + "\nWhat Coffee did you drink today?" + RESET);

		inputText = input.nextLine();
		int drinkIndex = searchString(cName,inputText);
		
		if (drinkIndex>-1) {
			System.out.println("\tYou drank " + cName.get(drinkIndex));
			cCounter = cCounter + Calorie.get(drinkIndex);
			fCounter = fCounter + Fat.get(drinkIndex);
			sCounter = sCounter + Sugar.get(drinkIndex);
			coffee= coffee+ 1;
			System.out.println("\tYou consumed  " + Calorie.get(drinkIndex) + " calories and " + Fat.get(drinkIndex) + " grams of fat and " + Sugar.get(drinkIndex) + " grams of sugar.\n\tType exit to exit and find out how much you consumed in total.");
		}else if (inputText.equalsIgnoreCase("exit")) {
			if (coffee >0) {
			double roundSCounter =Math.round(sCounter *100.0)/100.0;
			double roundFCounter =Math.round(fCounter *100.0)/100.0;
			System.out.println("\tYou comsumed a total of " + cCounter + " calories and " + roundSCounter + " grams of sugar and " + roundFCounter + " grams of fat." );
			cAvg = cCounter/coffee;
			fAvg = fCounter/coffee;
			sAvg= sCounter/coffee;
			double roundFAvg= Math.round(fAvg *100.0)/100.0;
			double roundSAvg =Math.round(sAvg *100.0)/100.0;
			System.out.println("\tYou drank an average of " + cAvg + " calories per drink, an average of " + roundFAvg + " grams of fat per drink and an average of " + roundSAvg + " grams of sugar per drink.");
			System.out.println(RED + "Exiting" + RESET);
			runLoop = false;
			}else {
				System.out.println(RED + "Error: did not enter coffee" + RESET);
			}} else {
			System.out.println(RED +"Not found" + RESET);
		}

	} // end (while loop)
	
	
	
	
	
	
	

	
	
	

	
	
	
	
	
	
	
	
	
	}//end of args
	/* Mr. Artym code */
	public static int searchString(  ArrayList<String> drinks, String inputString    ){
		for(int i=0; i<drinks.size(); i++){
			if(   drinks.get(i).equalsIgnoreCase(inputString)  ){
				return i;    //returns index of found item
			}
		}
		return -1;    //returns -1 if not found
	}
}//end of class




//Setup 4 parallel ArrayLists.  DONE
//One for the drink name, 
//one for the calories, 
//one for the fat content 
//and one for another stat of your choice (such as caffeine). 

//
//For the base level marks:
//Print the names of all the drinks available DONE
//Ask the user for the name of the coffee.  For this assignment, you must ask for a NAME, not a number. DONE
//Search for the drink name.  Remember, you already have a Search method that should work.
//If the drink is not in the list, give the user an error message.
//If it is in the list: Print the 3 nutritional statistics for the drink chosen (including units where appropriate).  This will require you to search for the name and then use the index number to look into the other ArrayLists.  Note that you must use a search METHOD that returns the index number for full marks.
//Loop until the user types ‘exit’ for a drink name.  This will generally happen at the end of week’s worth of coffee purchases but could happen after any number of drinks. Your program must smoothly handle this entry without any errors or user-unfriendly printouts. Look back at our while loop in our rock, paper, scissors tutorial.
//		Example Run
//		What coffee did you drink today?
//		Pomegranate frappuccino
//		You consumed: 	450 calories, 2.5 grams of fat and 1.2 mg of caffeine.
//		What coffee did you drink today? DONE 
//
//
//Advanced Functions  (each worth 30%)
//
//Total each nutritional statistic and then print the totals for each when the user types exit.
//This will involve creating 3 new variables (one for each statistic).  You then add to these variables each time a new drink is chosen.
//Optional:  Mr. Artym plays sweaty Warzone for about 9 hours per week.  Sweaty Warzone players his age burn about 210 calories per hour. Let him know if he is getting fatter or losing weight each week based on coffee vs sweaty Warzone playing.
//In addition to the totals, when the user types exit, calculate the average calculation for each stat.  This will require you adding one additional variable to track how many coffees I drank.
//
