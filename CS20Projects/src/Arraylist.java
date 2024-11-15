import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList<String> superP = new ArrayList<String>();
		superP.add("Strength");
		superP.add("Spider");
		superP.add("Money");
		superP.add("Run");
		superP.add("Sheild");
		
		ArrayList<String> SH = new ArrayList<String>();
	    SH.add("Superman");
	    SH.add("Spiderman");
	    SH.add("Batman");
	    SH.add("Flash");
	    SH.add("Captain A");

	    ArrayList<Boolean> isHuman = new ArrayList<Boolean>();
	    isHuman.add(false);
	    isHuman.add(true);
	    isHuman.add(true);
	    isHuman.add(true);
	    isHuman.add(true);
	    isHuman.add(true);

	    

	    
	    System.out.print("/*****/Superheros/****/\n");
	    System.out.print("Superhero      Superpower        Are they human?  \n");
	    for (int i = 0; i < SH.size(); i++) {
	        System.out.println((i)+ " "+ SH.get(i) + "		"+ superP.get(i) +"		"+ isHuman.get(i));
	      }
	    SH.set(0, "Homelander");
	    SH.set(3, "A-train");
	    superP.set(0, "Laser");
	    superP.set(3, "Speed");
	  
	    
	    System.out.println("\n");
	    System.out.print("/*****/ Updated Superheros/****/\n");
	    System.out.print("Superhero      Superpower        Are they human?  \n");
	    for (int i = 0; i < SH.size(); i++) {
	    	System.out.println((i)+ " "+SH.get(i) + "		" + superP.get(i) +"		"+ isHuman.get(i));
//	    	System.out.println("\n");
//	    	System.out.print("/*****/ Human Superheros/****/\n");
//	    	if(isHuman.get(i).equals(true)) {
//	    		System.out.println(SH.get(i));
//	    		
//	    	}//end of if
	    }//end of for
	    System.out.println("\n");
	    System.out.print("/*****/ Filtered- Human Superheros/****/\n");
	    for (int i = 0; i < SH.size(); i++) {
	    	if(isHuman.get(i).equals(true)) {
	    		System.out.println((i)+" "+ SH.get(i));
	    		
	    	}//end of if
	    }//end of for
	    
	    System.out.println("\n");
	    System.out.print("/*****/ Filtered- Military Superheros/****/\n");
	    for (int i = 0; i < SH.size(); i++) {
	    	if(SH.get(i).contains("Captain")) {
	    		System.out.println((i)+" "+ SH.get(i));
	    		
	    	}//end of if
	    }//end of for
	    
	}// end of args
	


}

//	    System.out.println(SH);