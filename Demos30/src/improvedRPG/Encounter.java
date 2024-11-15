package improvedRPG;

public class Encounter {

	private Hero hero;
	private Enemy enemy;
	private boolean active;
	
	public Encounter(Hero hero, Enemy enemy) {
		this.hero = hero;
		this.enemy = enemy;
		this.active=true;
	}
	
	public String getHeroName() {
		return this.hero.getName();
	}
	
	public String getEnemyName() {
		return this.enemy.getName();
	}
	
	
	public boolean isEnemyDefeated() {
		return this.enemy.getHP() <=0;
	}
	
	public boolean isHeroDefeated() {
		return this.hero.getHP() <=0;
	}
	
	public boolean isActive() {
        return active;
    }

    public void attack() {
    	//could also customize the attack methods to print out how much damage!
    	//could add some randomness, critical hits as well!
        hero.attack(enemy);
        System.out.println(hero.getName() + " attacks " + enemy.getName());
        if (enemy.getHP() <= 0) {
            endEncounter(true);
        } else {
            enemy.attack(hero);
            System.out.println(enemy.getName() + " attacks " + hero.getName());
            if (hero.getHP() <= 0) {
                endEncounter(false);
            }
        }
    }

    public void defend() {
    	//could set up a setDefense method in Character to double when defend
       // hero.setDefense(hero.getDefense() * 2);
        System.out.println(hero.getName() + " defends");
        enemy.attack(hero);
        System.out.println(enemy.getName() + " attacks " + hero.getName());
        if (hero.getHP() <= 0) {
            endEncounter(false);
        } else {
           // hero.setDefense(hero.getDefense() / 2);
        }
    }

    private void endEncounter(boolean isVictory) {
    	active = false;
        if (isVictory) {
            System.out.println(hero.getName() + " defeats " + enemy.getName());
        } else {
            System.out.println(enemy.getName() + " defeats " + hero.getName());
        }
    }
	
}