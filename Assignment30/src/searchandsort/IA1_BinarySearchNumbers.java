package searchandsort;
import java.util.Scanner;

public class IA1_BinarySearchNumbers {
	private static Scanner input;
	static int inputNum=0;
	static double inputNum2=0;
	static int[] partANumber= {12, 13, 32, 35, 46, 68, 71, 73, 88, 94, 99, 100};	
	

	
//global variable above this
	
	public static void main(String[] args) {
		
		Superhero[] superArray;
		superArray= new Superhero[11];
		superArray[10]= new Superhero("Homelander", 0.92, 242);
		superArray[9]= new Superhero("Soldier Boy", 0.81, 201);
		superArray[8]= new Superhero("Windbreaker", 0.80, 200);
		superArray[7]= new Superhero("Queen Maeve", 0.72, 192);
		superArray[6]= new Superhero("Stormfront", 0.67, 190);
		superArray[5]= new Superhero("Starlight", 0.54, 150);
		superArray[4]= new Superhero("Black Nior", 0.49, 145);
		superArray[3]= new Superhero("A-train", 0.31, 112);
		superArray[2]= new Superhero("A Monkey", 0.23, 92);
		superArray[1]= new Superhero("Yo Mama", 0.14, 70);
		superArray[0]= new Superhero("The Deep", 0.1, 15);


		
		
		
		input = new Scanner(System.in);
		String inputText = "";
		System.out.println("-----Welcome to SuperHeroes for Hire!-----");
//		System.out.println(superArray[9].getPower()); //test code
		System.out.println("We have many superheroes available.  \nOur levels range from 0.1 to 0.99.  \nWhat power level do you require?  ");
//		System.out.println(Search.binarySearch(superArray, 0.92)); //test code
		
		try {
			inputText = input.nextLine();
			inputNum2=Double.parseDouble(inputText);
			
			if(Search.binarySearch(superArray, inputNum2)==1) {
				
				for(int i = 0; i < superArray.length;i++) {
					
					if(superArray[i].getPower()==(inputNum2)) {
						inputNum2=i;
						System.out.println("You have chosen hero "+ superArray[i].getName() 
						+". \nThe total cost per hour is " + superArray[i].getPrice()+" dollars per hour.");
					}//end of if		
				}//end of for
				
				System.out.println("For how many hours do you need our hero services?");
				inputText = input.nextLine();
				inputNum=Integer.parseInt(inputText);
				if(!(inputNum==0)) {
					inputNum= inputNum * superArray[(int) inputNum2].getPrice();
					System.out.println("Your total price is: " + inputNum +" dollars.");
				}else {
					System.exit(0);
				}
				
				
				
			}else {
				
				System.out.println("Not found");
			}
			
			
			
		}catch(Exception e) {
			
			System.out.println("Not a valid option");
			
		}
		
		
		
		
		
		
		
		
		//part a below
//		try {
//			
//		inputNum=Integer.parseInt(inputText);
//		
//		if(Search.binarySearch(partANumber, inputNum)==1) {
//			System.out.println("Number is found in the database");
//			
//		}else if(Search.binarySearch(partANumber,inputNum)==-1) {
//			System.out.println("Number was not :(\nI am sorry this number is not in\n our list.  Please try again ");
//		
//		}
//		}catch(Exception e){
//			System.out.println("Not a valid number");
//		}

	}

	
}
