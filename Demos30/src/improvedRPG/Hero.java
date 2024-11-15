package improvedRPG;

public class Hero extends Character {

	public Hero(String name) {
		// public Character(String name,int attack, int defense, int hp)
		super(name, 100, 50, 200);

	}

	@Override
	public void attack(Character target) {
		int damage = getAttack() - target.getDefense();
		if (damage > 0) {
			int newHP = target.getHP() - damage;
			target.setHP(newHP);
		}

	}

}