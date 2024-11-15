package RPG;
//
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.ArrayList;



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