package apProject;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class GameStart {
  //------Global Variables-----//
  private static int questIndex = 0;
  private static Scanner scanner = new Scanner(System.in);
  private static int gamePoints =0;
  private static boolean questRepeat = true;
  static User user = new User("name",0,0);
  private static ArrayList<Integer> qAnswered = new ArrayList<Integer>();


  public static void main(String[] args) {

    while (true) {
      // ask for user input
      System.out.println("JEO-JEO-JEO-JEOPARDY!!!");
      System.out.println("ARE YOU READY?!");
      // store user input
      String answer = scanner.nextLine();
      // process user input
      if (answer.equalsIgnoreCase("yes")) {
        System.out.println("What is your name contestant?");
        String name = scanner.nextLine();
        user.setName(name);
        System.out.println("Welcome " + user.getName() + "!");
        
        
        while (questRepeat ==true) {
//        	System.out.println("Would you like to quit?");
//        	answer = scanner.nextLine();
//        	if (answer.equalsIgnoreCase("quit")) {
//        		
//        	}
        playerStartsGame();
        gamePlay();
        user.setPoints(gamePoints + user.getPoints());
        user.setQAnswered(3 +user.getQAnswered());
        System.out.println(name + " has " + user.getPoints() + " points");
        }//end of while loop for repeating questions
      } else if (answer.equalsIgnoreCase("no")) {
        System.out.println("You will do it whether you like it or not mortal");
      } else {
        System.out.println("Not a valid answer");
      }

    } // while
    
    

  }// end of main method

  private static void playerStartsGame() {
   
    // print out options to user
    System.out.println("\nEach category contains 10 questions" + "\n\tChoose your category!");
    System.out.println("\n\tG: Geography" + "\n\tH: History" + "\n\tP: Pop Culture" + "\n\tS: Science"
        + "\n\tSP: Sports" + "\n\tL: Literature" + "\n\tAE: Art and Entertainment" + "\n\tT: Technology"
        + "\n\tGK: General Knowledge" + "\n\tFD: Food and Drinks\nWould you like to quit?");
    // take user input
    String answer = scanner.nextLine();
    // Process what topic user chose

    
    if (answer.equalsIgnoreCase("G")) {
      questIndex = 0 + user.getQAnswered();
    } else if (answer.equalsIgnoreCase("H")) {
      questIndex = 10 + user.getQAnswered();
    } else if (answer.equalsIgnoreCase("P")) {
      questIndex = 20 + user.getQAnswered();
    } else if (answer.equalsIgnoreCase("S")) {
      questIndex = 30 + user.getQAnswered();
    } else if (answer.equalsIgnoreCase("SP")) {
      questIndex = 40 + user.getQAnswered();
    } else if (answer.equalsIgnoreCase("L")) {
      questIndex = 50 + user.getQAnswered();
    } else if (answer.equalsIgnoreCase("AE")) {
      questIndex = 60 + user.getQAnswered();
    } else if (answer.equalsIgnoreCase("T")) {
      questIndex = 70 + user.getQAnswered();
    } else if (answer.equalsIgnoreCase("GK")) {
      questIndex = 80 + user.getQAnswered();
    } else if (answer.equalsIgnoreCase("FD")) {
      questIndex = 90 + user.getQAnswered();
    }
      
       else {
      System.out.println("Not a valid answer");
    }

  }// end of player start game

  private static void gamePlay() {
    for (int i = 0; i < qAnswered.size(); i++) {
      if (qAnswered.contains(questIndex)) {
        questIndex++;
      }
    }
    for (int i = 0; i < 3; i++) {
      //create new question
      Questions questions = new Questions(genTopic(), genQuestions(), genAnswers(), genPoints());
     System.out.println("Question number: " + (questIndex+1) +"/100\nPoints: " + questions.getPoints());
      //print out new question
      System.out.println(questions.getQuestion());
      //take user input for response to question
      String questAnswer = scanner.nextLine();
      //Process whether user is correct or incorrect
      //user correct
      if (questAnswer.equalsIgnoreCase(questions.getAnswer())){
        System.out.println("\nCORRECT!");
        gamePoints=questions.getPoints();
        user.setPoints(gamePoints);
      } else {
        System.out.println("Sorry, that response is incorrect");
      }
     // qAnswered.add(questIndex);
      questIndex++;
     
    }//end of for loop
  }

  /// ---------BEGINNING OF CODE RELATING TO LOADING QUESTION POPERTIES -------///
  // Load question topics
  private static ArrayList<String> topic;

  private static String genTopic() {
    topic = loadStringList("Topic.txt");
    // int questIndex;
    return topic.get(questIndex);
    
  }

  // load questions
  private static ArrayList<String> question;

  private static String genQuestions() {
    question = loadStringList("Questions.txt");
    // System.out.println(question); // Add this line
    return question.get(questIndex);
  }

  // load answers
  private static ArrayList<String> answer;

  private static String genAnswers() {
    answer = loadStringList("Answers.txt");
    return answer.get(questIndex);
  }

  // load points
  private static ArrayList<Integer> points;

  private static int genPoints() {
    points = loadIntegerList("Points.txt");
    return points.get(questIndex);
  }

  // this code was taken from Corbett Artym's CS 20 class //
  private static ArrayList<String> loadStringList(String filename) {
    ArrayList<String> temp = new ArrayList<String>();
    try {
      BufferedReader file = new BufferedReader(new FileReader(filename));
      while (file.ready()) {
        temp.add(file.readLine());
      } // end while
      file.close();
    } catch (IOException e) {
      System.out.println(e);
    }

    return temp;
  }

  private static ArrayList<Integer> loadIntegerList(String filename) {
    ArrayList<Integer> temp = new ArrayList<Integer>();
    try {
      BufferedReader file = new BufferedReader(new FileReader(filename));
      while (file.ready()) {
        String nextLineS = file.readLine();
        try {
          int nextLineI = Integer.parseInt(nextLineS);
          temp.add(nextLineI);
        } catch (NumberFormatException ex) {
          ex.printStackTrace();
        }

      } // end while
      file.close();
    } catch (IOException e) {
      System.out.println(e);
    }

    return temp;
  }
}//end of class