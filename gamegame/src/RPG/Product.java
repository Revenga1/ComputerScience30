package RPG;

public class Product { 
    //variables for the parameters of the product object
    private String name = ""; 
    private int health = 0;
    private int attackBoost = 0;
    private boolean available = true;
    private int price = 0; 
    private int numberOf = 0;

//Constructor
public Product(String name, int health, int attackBoost, int price, int numberOf, boolean available) {
    
 this.name =  name; 
 this.health =  health;
 this.attackBoost = attackBoost;
 this.price = price;
 this.numberOf = numberOf;
 this.available =available;

}

//Getters
  //name
 public String getName () {
    return this.name;
    }
  //health
public int getHealth () {
    return this.health;
}
  //attack boost
public int getAttackBoost () {
	return this.attackBoost;
    }
   //price 
public int getPrice () {
    return this.price;
}
  //number of copies of product available
public int getNumberOf () {
    return this.numberOf;
}

  public boolean getAvailability() {
    return this.available;
  }


//Setters
  //set the availability of the product
public void setAvailability(boolean availible) {
    this.available = availible;
  }

  //set how many of a certain object are left in stock
  public void setNumberOf (int numberOf) {
    this.numberOf = numberOf;
}




}
//end of class