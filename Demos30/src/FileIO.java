import java.util.ArrayList;
import java.io.*;

public class FileIO {

	/*
	 * This code is from Mr. Artym's CS 20 -FileIO Demo
	 * https://replit.com/@CorbettArtym/File-IO-20#Main.java
	 * Line 29-54
	 */
	
	
// The following methods load and save text files where one each item comes in one line at a time
// 	Data_item_1
// 	Data_item_2
// 	Data_item_3

// Data is read in one line at a time to as a STRING.  To create a INT, Double, or Boolean method, you need to parse the String:  
// Boolean.parseBoolean(someString)  

public static ArrayList<String> loadStringList (String filename){
	ArrayList<String> temp = new ArrayList<String>();
	try {
		BufferedReader file = new BufferedReader(new FileReader(filename));
		while (file.ready()) {
      temp.add( file.readLine() );
		}//end while
		file.close();
} catch (IOException e) {
 System.out.println(e);
}

return temp;

//For non-String ArrayLists you need to PARSE the data before adding it
//You might also want to trim it.

}//end loadStringArr from a text filez
	
	
}
