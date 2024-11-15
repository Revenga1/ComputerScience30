package RPG;
//
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.ArrayList;


/*
* Name:Elaine
* Why does it make sense to modularize this object? (attributes, methods)

It makes sense to modularize this object since it holds various 
attributes that would have been hard to just place within another class. 
When the enemy has its own class, the main code is more organized since 
we can just call out methods such as enemyName and use it more efficiently. 

* Why does the constructor require the parameters it has?
The constructor requires the parameters since the enemy needs the same 
attributes as the player in order to fight against it. For instance, 
just like the player, the enenmy also needs a name or hp so the user
 knows how much damage that they did. 
*/

public class Enemy extends Character{
		
private  int enemyCoin = 5;
	private int damage = 0;


	public Enemy(String name,int index, int attack, int HP, int coin) {
		super(name ,attack, HP, coin);
		
	}


//	public static void main(String[] args) {
//		System.out.println(enemyGenName(null));
//	} 

  
	
//	public String enemyGenName() {
//		index++;
//		ArrayList<String> name;
//		name = loadStringList("enemyName.txt");
//		return name.get(index);
//		//this.name = new ArrayList<Enemy>();
//	}
//	
//	public String enemyName() {
//		ArrayList<String> name;
//		name = loadStringList("enemyName.txt");
//		return name.get(index);
//		//this.name = new ArrayList<Enemy>();
//	}
	
	

//	private  ArrayList<String> loadStringList(String filename) {
//		ArrayList<String> temp = new ArrayList<String>();
//		try {
//			BufferedReader file = new BufferedReader(new FileReader(filename));
//			while (file.ready()) {
//				temp.add(file.readLine());
//			} // end while
//			file.close();
//		} catch (IOException e) {
//			System.out.println(e);
//		}
//
//		return temp;
//	}
//	
	//Enemy Attack
	  public void attackE(Player player) {
	     damage = getAttack();
			int newHP = player.getHP()-damage;
			player.setHP(newHP);
			
		}


	
	
	
//	private static void convEnemyFile() {
//	
//		List<String> enemyName = new ArrayList<String>();
//		
//		//load data
//		 try {
//			enemyName = Files.readAllLines(Paths.get("enemyName.txt"));
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		 
//		 //convert to array
//		 String[] array
//         = enemyName.toArray(new String[0]);
//		 
//    
//	}//https://www.geeksforgeeks.org/read-file-into-an-array-in-java/


	
	
	
}//end of class