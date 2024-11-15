import java.util.Scanner;

import extra.ConsoleColors;

// * Class is a Java file. This one is public and avaliable everywhere!

public class Ex1Factorial {
/*
 * main METHOD 
 * not called a "public static void"
 *   modifiers that change- scope, whether it is an instance, return value
 *In other languages, called a "function"
 * When I run Java program, it runs the main method
 */
	public static void main(String[] args) {
//		practiceIPO();
		//can print out the returned int from factorial by placing it in a print out message
		int pro = factorial();
		practiceIPO();
		System.out.println("Factorial of 5 is " + factorial());
		System.out.println(ConsoleColors.RED_BACKGROUND + pro  + ConsoleColors.RESET);
	}

	
	private static void practiceIPO() {
		System.out.println("Hello World!");
		
		//variable declaration
		//Scanner scanner; 
		//scanner = new Scanner(System.in); //variable initialization
		Scanner scanner = new Scanner(System.in);
		
		/*
		 * IPO- Input Process Output
		 * Prompt the user for input (what are their options?)
		 * take input
		 * process input
		 * output calculations, whatever relevant
		 */
		System.out.print("Who's birthday is it?");
		String name = scanner.nextLine();
		System.out.println("Happy Birthday	" + name + "!");
	}
	
	//when multiplying, or taking factorial, number get large very fast!
	private static int factorial() {
		
		int number = 5;
		int product = 1;
		
		for (int i = 1; i <= number; i++) {
			product = product*i;
			//total*=i;   <--- shorter version
			
		}
		return product;
		
	}
}
