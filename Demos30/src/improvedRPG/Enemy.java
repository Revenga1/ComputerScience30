package improvedRPG;

public class Enemy extends Character {

	public Enemy(String name, int attack, int defense, int hp) {
		super(name, attack, defense, hp);
	}

	@Override
	public void attack(Character target) {
		int damage = getAttack() - target.getDefense();
		if (damage > 0) {
			target.setHP(target.getHP() - damage);
		}
	}

}