package searchandsort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Arrays {

	static ArrayList<String> name = new ArrayList<String>();
	static double[] finalGrade= {95.0, 69.4, 42.0, 80.4, 90.5, 85.0, 67.9, 78.4, 99.9, 89.1};
	private static Scanner input;

	
	
	public static void main(String[] args) {
		Collections.addAll(name, "Sarah", "Manaal", "Normah","Norma","Elaine","Tolu","Gertude","Germ","BigMama","Hans");
//		name.add("Sarah");
//		name.add("Manaal");
//		name.add("Normah");
//		name.add("Norma");
//		name.add("Elaine");
//		name.add("Tolu");
//		name.add("Gertude");
//		name.add("Germ");
//		name.add("Big Mama");
//		name.add("Hans");
		boolean found=false;
		input = new Scanner(System.in);
		String inputText = "";
		System.out.println("Access gradebook?");
		inputText = input.nextLine();
		
		
		
		for (int i = 0; i< name.size(); i++) {
		System.out.println(name.get(i)+"	"+finalGrade[i]);
		}
		
	}
	
	
	
	
	
	
}
