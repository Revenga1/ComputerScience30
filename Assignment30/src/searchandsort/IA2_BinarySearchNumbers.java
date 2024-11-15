package searchandsort;

import java.util.Scanner;

public class IA2_BinarySearchNumbers {
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		Seaman[] fishyArray;
		fishyArray= new Seaman[28];
		fishyArray[0]= new Seaman("Anchovy", false, "Fish");
		fishyArray[1]= new Seaman("Blue Crab", false, "Crustaceans");
		fishyArray[2]= new Seaman("Clownfish", true, "Fish");
		fishyArray[3]= new Seaman("Cod", true, "Fish");
		fishyArray[4]= new Seaman("Conch", false, "Invertebrate");
		fishyArray[5]= new Seaman("Coral", false, "Invertebrate");
		fishyArray[6]= new Seaman("Cuttlefish", false, "Squid");
		fishyArray[7]= new Seaman("Dragonet", true, "Fish");
		fishyArray[8]= new Seaman("Flounder", true, "Fish");
		fishyArray[9]= new Seaman("Flying Fish", true, "Fish");
		fishyArray[10]= new Seaman("Fugu", false, "Fish");
		fishyArray[11]= new Seaman("Giant Squid", true, "Squid");
		fishyArray[12]= new Seaman("Great White Shark", false, "Shark");
		fishyArray[13]= new Seaman("Irukandji", false, "Jellyfish");
		fishyArray[14]= new Seaman("Jellyfish", false, "Jellyfish");
		fishyArray[15]= new Seaman("Killer Whale", false, "Whale");
		fishyArray[16]= new Seaman("Krill", true, "Crustaceans");
		fishyArray[17]= new Seaman("Lionfish", true, "Fish");
		fishyArray[18]= new Seaman("Lobster", false, "Crustaceans");
		fishyArray[19]= new Seaman("Mahi Mahi", true, "Fish");
		fishyArray[20]= new Seaman("Manta Ray", false, "Fish");
		fishyArray[21]= new Seaman("Megalodon", true, "Shark");
		fishyArray[22]= new Seaman("Nudibranch", true, "Slug");
		fishyArray[23]= new Seaman("Pufferfish", false, "Fish");
		fishyArray[24]= new Seaman("Sea Cucumber", false, "Slug");
		fishyArray[25]= new Seaman("Starfish", false, "Invertebrate");
		fishyArray[26]= new Seaman("Vampire Squid", true, "Squid");
		fishyArray[27]= new Seaman("Yellow Tang", false, "Fish");



		
		System.out.println(Search.binarySearch(fishyArray, "Clownfish"));
		


		System.out.println("-----Welcome to the fishy database-----");
		
		boolean active=true;
		
		while(active) {
		System.out.println("Enter a fish name to view its status.\n"
				+ "Or enter 'exit' to exit");
		String inputText = scanner.nextLine();
		
		if(inputText.equalsIgnoreCase("Exit")) {
			System.out.println("Exiting...");
			break;
		}else {
		
		if(Search.binarySearch(fishyArray, inputText)==1) {
			
			int index = Search.binarySearch2(fishyArray, inputText);
			System.out.println("I found it! A "+ fishyArray[index].getName()
					+" is a " + fishyArray[index].getFamily()+"!");
			if(fishyArray[index].getEndanger()==false) {
				System.out.print("This species is not endangered");
			}else {
				System.out.println("This species is endangered\n");
			}
			
			
		}else {
			System.out.println("I am sorry this creature is not in our list."
					+ "  \nPlease try again later");
		}
		}
		}//while
		
	

	}

}
