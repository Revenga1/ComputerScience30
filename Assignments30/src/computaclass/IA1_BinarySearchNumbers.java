package computaclass;
import java.util.Scanner;

public class IA1_BinarySearchNumbers {
	private static Scanner input;
	static int inputNum=0;
	static int[] partANumber= {12, 13, 32, 35, 46, 68, 71, 73, 88, 94, 99, 100};	
//global variable above this
	
	public static void main(String[] args) {
		input = new Scanner(System.in);
		String inputText = "";
		System.out.println("Enter the number:");
		
		inputText = input.nextLine();
		inputNum=Integer.parseInt(inputText);
		
		if(Search.binarySearch(partANumber, inputNum)==1) {
			System.out.println("Number is found in the database");
			
		}else if(Search.binarySearch(partANumber,inputNum)==-1) {
			System.out.println("Number was not :(\nI am sorry this number is not in\n our list.  Please try again ");
		
		}


	}

	
}
