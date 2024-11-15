import java.util.ArrayList;

import extra.ConsoleColors;

public class ex2DataImport {
	
	
	//Data structures- start at index 0
	//AP Data structures- start at index 1
	static ArrayList<String> chapterOne = new ArrayList<String>();
	
	public static void main(String[] args) {
		chapterOne = FileIO.loadStringList("hp.txt");
		System.out.print(ConsoleColors.WHITE_BOLD);
		System.out.println(chapterOne.get(5));
		System.out.print(ConsoleColors.RESET);
		
	}
	
	
	
}
