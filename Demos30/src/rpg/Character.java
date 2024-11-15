package rpg;

public class Character {
	// class properties
		private String name;
//		private String superPower;
		private int attack;
		private int defense;
		private int hp;
		
		//public method that is your constructor
		// after you declare a instance, initialize it with the constructor
		//constructor methods have the same name as the class
		
		public Character(String name) {
			this.name = name;
			this.attack = 100;
			this.defense = 50;
			this.hp =5;
		}
		
		//proper way to access variables (getters/setters)
		
		public String getName() {
			return name;
		}
		
		public int getHP() {
			return hp;
		}
		
		public void setHP(int hp) {
			this.hp = hp;
		}
}
