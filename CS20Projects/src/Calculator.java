
import java.util.Scanner;  // Import the Scanner class

class Calculator {
	private static Scanner input = new Scanner(System.in);
	
  public static void main(String[] args) {
    //repeat the calculate method until the user enters exit
		System.out.println("This program is a calculator. It will take 2 decimal numbers, and then an operator, and perform the given calculation.");
		String inputText = "";
		while (!inputText.equals("exit")){
			calculate();
			System.out.println("Please enter 'exit' to quit program. Enter anything else to continue calculating.");
			inputText = input.nextLine();
		}
		
  }	//end of my main method

	/* 
		Calculate method will perform a mathematical operation with the given input
		private - method can only be called from this file (Main.java)
		static - no object creation, the method is called and run without a specific copy made
	void - nothing is returned, no value is expected to be returned
	*/ 
	private static void calculate(){
		//input - 2 #s, operation, some way to get user input
		//variables - local 
		double firstNumber = 0; //double data types - decimals
		double secondNumber = 0;
		String operator = "";

		System.out.print("Enter the first number: ");
		firstNumber = input.nextDouble(); //error handling - what if the user doesn't enter a number?
		System.out.print("Enter the second number: ");
		secondNumber = input.nextDouble();

		input.nextLine();	//removes the new line character (enter key)

		System.out.print("Enter the operator (+,-,*,/): ");
		operator = input.nextLine(); //reads in String from input
		
		//processing
		double answer = 0;
		if (operator.equals("+")){	//+
			answer = firstNumber + secondNumber;
		} else if (operator.equals("-")){ //-
			answer = firstNumber - secondNumber;
		} else if (operator.equals("*")) { //*
			answer = firstNumber * secondNumber;
		} else if (operator.equals("/")) { // /
			answer = firstNumber / secondNumber;
		} else {	//all other operator input.
			System.out.println("Not a valid operator");
		}
		
		//output
	System.out.println(firstNumber + " " + operator + " " + secondNumber + " = " + answer);

		
	}	//end of my calculate method
	
} //end of my Main class