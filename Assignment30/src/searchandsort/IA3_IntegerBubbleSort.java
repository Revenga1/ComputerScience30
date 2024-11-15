package searchandsort;

public class IA3_IntegerBubbleSort {

	static int[] numbaArray = new int[50];
	
	public static void main(String[] args) {
		System.out.println("Unsorted Array");
		for(int i=0; i<=49; i++) {
			numbaArray[i]=(int)(Math.random()*1000+1);
			System.out.println(numbaArray[i]);
		}
		System.out.println("\n\n\n");
		Sort.bubbleSortIntArray(numbaArray);
		System.out.println("Sorted Array");
		for(int i=0; i<=49; i++) {
			System.out.println(numbaArray[i]);
		}
		

	}

}
