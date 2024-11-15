import java.util.ArrayList;

public class Bikeathon {

	public static final String RESET = "\u001B[0m";
	public static final String BLACK = "\033[1;30m";  // BLACK
    public static final String RED = "\033[1;31m";    // RED
    public static final String GREEN = "\033[1;32m";  // GREEN
    public static final String YELLOW = "\033[1;33m"; // YELLOW
    public static final String BLUE = "\033[1;34m";   // BLUE
    public static final String PURPLE = "\033[1;35m"; // PURPLE
    public static final String CYAN = "\033[1;36m";   // CYAN
    public static final String WHITE = "\033[1;37m";  //white
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> name = new ArrayList<String>();
		name.add("Rosa");
		name.add("Yun");
		name.add("Momo");
		name.add("Greyson");
		name.add("Ace");
		name.add("Jasper");
		name.add("George");
		name.add("Chicken");
		name.add("Moss");
		name.add("Apple");
		
		ArrayList<Double> money = new ArrayList<Double>();
		money.add(88.9);
		money.add(140.3);
		money.add(412.35);
		money.add(210.78);
		money.add(568.4);
		money.add(577.2);
		money.add(46.5);
		money.add(99.1);
		money.add(121.0);
		money.add(58.3);
		
		ArrayList<Boolean> pForm = new ArrayList<Boolean>();
		pForm.add(true);
		pForm.add(false);
		pForm.add(true);
		pForm.add(false);
		pForm.add(true);
		pForm.add(false);
		pForm.add(true);
		pForm.add(false);
		pForm.add(true);
		pForm.add(false);
		
		System.out.println(CYAN +"		/*********/Bike-a-thon/********/" + RESET);
		System.out.println(YELLOW + "			Name		Money		Form Signed" + RESET);
		for (int i = 0; i <name.size(); i++ ) {
			
			System.out.println((i)+ "		"+ name.get(i) +"		" + money.get(i)+ "		"+ pForm.get(i));
			
		}//end of for
		
		
		double totalM = 0;
		double avg = 0;
		
		System.out.println(YELLOW +"\n		Total Money		Average per Student" + RESET );
		for (int i = 0; i <name.size(); i++ ) {
			
			totalM = totalM + money.get(i);
		}
		avg = totalM/10; 
		double roundAvg= Math.round(avg *100.0)/100.0;
		double roundTotal = Math.round(totalM *100.0)/100.0;
		System.out.println("		"+roundTotal +"			"+ roundAvg);
		int sum = 0;
		
		System.out.println(RED + "\n  /********/Students that didnt raise above $120/*********/" + RESET);
		System.out.println(YELLOW + "		Name		Money		\n" + RESET);
		for (int i = 0; i<name.size(); i++) {
			if (money.get(i)<119) {
				System.out.println((i)+ "	"  + name.get(i) +"		"+  money.get(i));
				sum += 1;
			}
			
		}//end of for
		
		
		if (sum>3) {
			System.err.println("Students that didnt raise above $120: "+ sum +" \nLiving Room Location: Closet" );
		} else {
			System.out.println(GREEN +"Living Room Location: Mansion" + RESET);
		}//end of else if
		
		
		
		System.out.println(RED +"\n/*******/Students that didnt hand in Form/*******/" + RESET);
		for (int i = 0; i<name.size(); i++) {
			if (pForm.get(i).equals(false)) {
				System.out.println((i)+ "	"+ name.get(i));
			}
		}//end of for
		
		
		System.out.println(YELLOW + "\n	/******/People that will get power outlets/******/" + RESET);
		System.out.println("	Name		Money Raised");
		for (int i = 0; i<name.size(); i++) {
			if (money.get(i)>120) {
				System.out.println((i) + "	" +name.get(i) + "		" + money.get(i));
			}
		}//end of for
		double moneyP = 0;
		System.out.println(YELLOW + "\n	/******/Golden Fan/******/" + RESET);
		System.out.println("	Name		Money Raised");
		for (int i = 0; i <name.size(); i++) {
			if (money.get(i)>499) {
				moneyP = moneyP + money.get(i);
				System.out.println((i) + "	" +name.get(i) + "		" + money.get(i));
			}
		}//end of for
		System.out.println(YELLOW + "\n	Golden Fan Total Money " + RESET);
		System.out.println("	" +moneyP);
	}//end of arg

}//end of class



//Step 0
//Set up 3 parallel ArrayLists of 10 students:
//Their names 
//The amounts they raised for the Bike-a-thon.  
//Hard code in the values so that each person has raised a different amount of money.
//A Boolean ArrayList stating whether or not they have returned their permission forms
//Set half to be true and half to be false
//



//Step 1
//Print out of all three ArrayLists using a single For Loop so that each student’s name appears with his/her dollar amount and true/false value beside it.
//



//Step 2 - First 80%
//Using for loops and whatever number of additional variables you need, calculate and print the following.  Make sure your printouts are well labeled:
//The total amount raised by your team. (20%)
//The average amount raised per student  (20%) 
//Hint: You do not need a new for loop for this.  The average is just the total divided by the number of items in the ArrayList (and you just found the total in part a).  Use ___.size() in the average calculation.
//If you have more than 2 students who have not raised the minimum amount, your team gets the worst living room locations.  
//Count the number of students who raised less than $120 and print that number.
//IF that number is greater than 2, print “Living Room Location:  Closet”. (20%)
//The names of students who have not yet turned in their forms. (20%)
//




//Step 3 - Final 20%
//Print the highest amount raised and that person’s name (10%) - their team will for sure get a power outlet.
//To win a Golden Fan (10%), you need some big donors.  - TOTAL the amount raised by only those students who have raised more than $500.  
