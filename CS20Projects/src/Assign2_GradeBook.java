import java.util.ArrayList;

public class Assign2_GradeBook {

	public static final String RESET = "\u001B[0m";
	public static final String BLACK = "\u001B[30m";
	public static final String RED = "\u001B[31m";
	public static final String GREEN = "\u001B[32m";
	public static final String YELLOW = "\u001B[33m";
	public static final String BLUE = "\u001B[34m";
	public static final String PURPLE = "\u001B[35m";
	public static final String CYAN = "\u001B[36m";
	public static final String WHITE = "\u001B[37m";
    // Bold
    public static final String BLACK_BOLD = "\033[1;30m";  // BLACK
    public static final String RED_BOLD = "\033[1;31m";    // RED
    public static final String GREEN_BOLD = "\033[1;32m";  // GREEN
    public static final String YELLOW_BOLD = "\033[1;33m"; // YELLOW
    public static final String BLUE_BOLD = "\033[1;34m";   // BLUE
    public static final String PURPLE_BOLD = "\033[1;35m"; // PURPLE
    public static final String CYAN_BOLD = "\033[1;36m";   // CYAN
    public static final String WHITE_BOLD = "\033[1;37m";
	
	public static void main(String[] args) {
		
		System.out.println(GREEN + "This text is in color!" + RESET);
		
		ArrayList<String> name = new ArrayList<String>(); 
		name.add("John");
		name.add("Sam");
		name.add("Alex");
		name.add("Steve");
		name.add("Hero");
		name.add("Kai");
		name.add("Joe");
		name.add("Jasper");
		
		ArrayList<Integer> grade = new ArrayList<Integer>();
		grade.add(10);
		grade.add(10);
		grade.add(11);
		grade.add(11);
		grade.add(11);
		grade.add(10);
		grade.add(10);
		grade.add(11);
		
		ArrayList<Double> exam1 = new ArrayList<Double>();
		exam1.add(87.2);
		exam1.add(12.9);
		exam1.add(67.4);
		exam1.add(97.2);
		exam1.add(45.9);
		exam1.add(50.1);
		exam1.add(79.9);
		exam1.add(85.5);
		
		ArrayList<Double> exam2 = new ArrayList<Double>();
		exam2.add(68.6);
		exam2.add(89.3);
		exam2.add(75.2);
		exam2.add(91.1);
		exam2.add(68.7);
		exam2.add(73.5);
		exam2.add(59.9);
		exam2.add(78.8);
		
		ArrayList<Double> exam3 = new ArrayList<Double>();
		exam3.add(99.9);
		exam3.add(69.0);
		exam3.add(42.0);
		exam3.add(66.6);
		exam3.add(34.4);
		exam3.add(82.7);
		exam3.add(89.1);
		exam3.add(58.5);
		
		System.out.println(PURPLE_BOLD + "		/*********/GradeBook/*********/" + RESET);
		System.out.println("	Name		Grade		E1		E2		E3	");
		for (int i = 0; i < name.size(); i++) {
			System.out.println((i)+"	"+name.get(i) + "		" + grade.get(i) + "		" + exam1.get(i) + "		" + exam2.get(i) + "		" +exam3.get(i) + "		");
			
		}//end of for loop
		
		exam3.set(0, 120.0);
		exam3.set(1, 72.0);
		exam3.set(3, 45.0);
		exam3.set(4, 69.6);
		exam3.set(5, 37.4);
		exam3.set(6, 85.7);
		exam3.set(7, 92.1);
		exam3.set(2, 61.5);
		
		
		System.out.println("\n		/********/Updated Exam3 Marks/*********/");
		System.out.println("	Name		Grade		E1		E2		E3	");
		for (int i = 0; i < name.size(); i++) {
			System.out.println((i)+"	"+name.get(i) + "		" + grade.get(i) + "		" + exam1.get(i) + "		" + exam2.get(i) + "		" +exam3.get(i) + "		");
		}//end of for loop
		

		
		System.out.println("\n		/********/Grade 11 Marks/*********/");
		System.out.println("	Name		Grade		E1		E2		E3	");
		for (int i = 0; i <grade.size(); i++) {
			if (grade.get(i)==11) {
				System.out.println((i)+"	"+name.get(i) + "		" + grade.get(i) + "		" + exam1.get(i) + "		" + exam2.get(i) + "		" +exam3.get(i) + "		");
			}//end of if
		}//end of for
		
		
		System.out.println("\n		/********/Exam 1 Failures/*********/");
		System.out.println("	Name		Grade		E1");
		for (int i = 0; i <name.size();i++) {
			if (exam1.get(i)<50.0) {
				System.out.println((i)+"	"+name.get(i) + "		" + grade.get(i) + "		" + exam1.get(i));
			}//end of if
		}//end of for
		
		double examAvg1 = 0;
		double examAvg2 = 0;
		double examAvg3 = 0;
		
		for (double d : exam1) {
			examAvg1 += d;
		}
		for (double d : exam2) {
			examAvg2 += d;
		}
		for (double d : exam3) {
			examAvg3 += d;
		}
		
		examAvg1 = examAvg1/exam1.size();
		examAvg2 = examAvg2/exam2.size();
		examAvg3 = examAvg3/exam3.size();
		System.out.println("\n		/*********/Class Exams Average/*********/");
		System.out.println("		Exam 1 			Exam 2			Exam 3");
		System.out.println("		"+ examAvg1 +"			" + examAvg2 +"	"+ examAvg3);
		
		
		System.out.println("\n		/********/Extra Challenges/*********/");
		System.out.println("	Student		Avgerage Grade");
		for (int i = 0; i < name.size();i++) {
		double studentAvg = exam1.get(i)+exam2.get(i)+exam3.get(i);
		studentAvg = studentAvg/3;
		System.out.println((i)+ "	"+ name.get(i)+ "		" + studentAvg);
		}//end of for loop
		
		
		
		
		
	}//end of args

}//end of class


//a) Setting up the ArrayLists
//You are about to set up five PARALLEL ArrayLists where you hardcode in all the data. 
//Set up a String ArrayList that stores the names of SIX-TEN people.
//names.add(“Jaffer”);
//Set up an Integer ArrayList called gradeNum that stores what grade (10, 11 or 12) each of these people are in.  Set two of them to be in each grade.
//Set up a Double ArrayList called exam1 that stores marks (out of 100) for all these people.  You can make up all these marks but this was a hard exam. Have at least 3 of your students fail this exam (less than 50). 
//Heads up, you may need to put decimals in your numbers because it is a Double list. 	exam1.add(67.0);	
//Set up a Double ArrayList called exam2 that stores marks (out of 100) for all these people. Include a wide range of marks.
//Set up a Double ArrayList called exam3 that stores marks (out of 100) for all these people. Include a wide range of marks.
//
//
//b) Using a for loop, print EVERYONE’s data on one line each
//	Bob   11   56   76   81
//
//
//c)  The teacher has decided to give bonus marks on exam3.   
//Using the SET function   ___.set(i,newnumber), increase the exam3 marks for each person by FIVE. It is ok if some go above 100.
//Write one SET line for each of your six students.  Do NOT try to use a FOR loop unless you are feeling really confident in everything so far.
//exam1.set(3, 61);  //hard code a higher mark for each of them
//
//
//d) Println the following:  /*********************Updated Exam3 Marks***********/
//Then reprint everything, exactly as you did for step b.
//Next 10%
//Println the following:  /*********************Filtered Print - Grade 10s and 11s***********/
//a) Using a new FOR loop, print the name and grade (no need to print the marks) of students who are in grades 10 or 11.
//
//Next 10%
//Println the following:  /*********************Filtered Print - Exam 1 failures***********/
//b) Using a new FOR loop, print the name and the exam1 mark of only the students who failed exam 1.
//
//Final 20%
//Println the following:  /*********************Class Averages - Final 20%***********/
//Using For Loops, calculate and print the class average of each of the 3 exams.
//Hint: Do this separately for each of the 3 exams.
//Hint: We did an ‘average’ algorithm in one or more of our examples.  To get the average, just divide the total by 6 (or by exam1.size() ) before printing it. Note that these numbers are Doubles so your total variable will also need to be a double
//
//
//Extra Challenge (not for marks)
//Println the following:  /*********************Extra Challenges***********/
//The above asked you to calculate the average for each exam.  For this challenge, you are to calculate the average of each person.  
//Start with one person only.  This will require you to add that individual’s three exam marks together and then divide by 3. You will NOT use a FOR loop to do this.
//… but once it is working for 1 person, you COULD use a FOR loop to repeat the process for all the students.
//
