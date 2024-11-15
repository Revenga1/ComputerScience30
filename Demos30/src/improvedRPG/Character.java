package improvedRPG;

public abstract class Character {
	private String name;
	private int attack;
	private int defense;
	private int hp;

	public Character(String name, int attack, int defense, int hp) {
		this.name = name;
		this.attack = attack;
		this.defense = defense;
		this.hp = hp;
	}

	// getters
	// getter - name
	public String getName() {
		return this.name;
	}

	// getter - attack
	public int getAttack() {
		return this.attack;
	}

	// getter - defense
	public int getDefense() {
		return this.defense;
	}

	// getter - hp
	public int getHP() {
		return this.hp;
	}

	// setters
	// setter - hp
	public void setHP(int hp) {
		this.hp = hp;
	}

	public abstract void attack(Character target);

}