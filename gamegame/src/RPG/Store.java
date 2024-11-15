package RPG;

import java.util.ArrayList;
import java.util.Scanner;

public class Store {
	//-------Global Variables-------//
	private static Scanner scan = new Scanner(System.in);

  //create new arraylist of products available in the store
    public static ArrayList<Product> storeInventory = new ArrayList<Product>();
  public static int searchProductResult =0;
  //Store "sheshon" is either true or false depending on whether player decides to enter store or not
    public static boolean sheshon = true;

  
public static void main(String[] args) {

//Create Products
//Create Products
// these are the parameters - setProduct(String name , int health , int attackBoost , int price, int numberOf, boolean available )
storeInventory.add(new Product("Elaine(Sword)", 32, 70, 200,3 ,true));
storeInventory.add(new Product("Manaal", 2, 39, 5, 05, true));
storeInventory.add(new Product("Poppy from the Movie: Trolls" , 0, 370, 200,8, true));		
storeInventory.add(new Product("Sarah(Orb)", 30, 255, 23,6,true));
storeInventory.add(new Product("Tolu", 115, 25, 30,4, true));
    }//end of method


//Method running all details of store such as searching for the item the player wants
public static void storeRun() {
   
   //While the player has decided to enter store
    while (sheshon==true) {

    for (int i = 0; i< storeInventory.size(); i++ ) { //tolu's personal note, print out in tabular form 
        //only print out items that are available
      if (storeInventory.get(i).getAvailability()==true) {
        System.out.println("\nName: " + storeInventory.get(i).getName() +  " \n\tHealth: " + storeInventory.get(i).getHealth() + " \n\tAttack: " +
         storeInventory.get(i).getAttackBoost() + " \n\t# in Stock: " + storeInventory.get(i).getNumberOf() + " \n\tPrice: " + storeInventory.get(i).getPrice() + " Coins");  
      }
    }
    // request for a product 
        System.out.println("\nWhat item do you want?\nPlease input item name");
    String requestedProduct = scan.nextLine();
      //store the index number of the product if found or return -1 if product is not availible 
    try {
        searchProductResult = Search.binarySearchString(storeInventory,requestedProduct);
    }catch(Exception e)  {
        System.out.println("Not a valid option");
    }

      //product is not found
    if (searchProductResult == -1) {
        System.out.println("Product not found!, try again.");
        sheshon = false;
        
    } 
    else {
      //product is found
      //hpw mamy are left in stock      
      System.out.println("\nThere are " + storeInventory.get(searchProductResult).getNumberOf() + " left in stock" );
      //Now compare price to player's coins to see whether the player is able to afford it
    //if the price is less than or equal to the players coins
        if (storeInventory.get(searchProductResult).getPrice() <= Game.player.getCoin()) {
            System.out.println("Are you sure you want to purchase " + storeInventory.get(searchProductResult).getName() + "?");
            String answer= scan.nextLine();
            //player purchases product
            if(answer.equalsIgnoreCase("yes")){
                System.out.println("You have purchased  " + requestedProduct);
                //set item as no longer avaiable
  storeInventory.get(searchProductResult).setAvailability(false);
              //subtract 1 from the number of product left
              storeInventory.get(searchProductResult).setNumberOf((storeInventory.get(searchProductResult).getNumberOf() - 1));
              sheshon = false;
              
            }
              //player doesn't purchase product
            else if (answer.equalsIgnoreCase("no")){
                System.out.println("Sorry for the inconvience");
                sheshon=false;
            }
        //price of product is greater than the players coins
        } else {
            System.out.println("Sorry, you're too broke");
            sheshon = false;
           

        }//end of compare coin 
    
    }//end of item found if statement
    }//end of sheshon
    

}//end of storeRun method






}// end of class