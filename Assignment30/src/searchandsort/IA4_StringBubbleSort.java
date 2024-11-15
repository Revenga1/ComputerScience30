package searchandsort;

public class IA4_StringBubbleSort {

	private static Hollywood[] vampireArray= new Hollywood[15];

	
	public static void main(String[] args) {
	

		
		vampireArray[0]= new Hollywood("Super Mario", 0);
		vampireArray[1]= new Hollywood("Water is Great", 0);
		vampireArray[2]= new Hollywood("Cocaine Bear", 0);
		vampireArray[3]= new Hollywood("Hot Pink Cockatiel", 0);
		vampireArray[4]= new Hollywood("Burgundy Owl", 0);
		vampireArray[5]= new Hollywood("Fight Club", 0);
		vampireArray[6]= new Hollywood("Parasite", 0);
		vampireArray[7]= new Hollywood("Taxi Driver", 0);
		vampireArray[8]= new Hollywood("Blade Runner", 0);
		vampireArray[9]= new Hollywood("The Shining", 0);
		vampireArray[10]= new Hollywood("All Quiet on the Western Front", 0);
		vampireArray[11]= new Hollywood("Om Shanti Om", 0);
		vampireArray[12]= new Hollywood("The Thing", 0);
		vampireArray[13]= new Hollywood("Snowpiercer", 0);
		vampireArray[14]= new Hollywood("Children of Men", 0);
		
		
		
		for(int i=0; i<vampireArray.length; i++) {
			System.out.println(vampireArray[i].getName());
			
			
		}
		
		Sort.bubbleSort(vampireArray);
		System.out.println("\n");
		
		for(int i=0; i<vampireArray.length; i++) {
			System.out.println(vampireArray[i].getName());
			
			
		}
		
		
		
		
		
		
	}
	
	
	

}
