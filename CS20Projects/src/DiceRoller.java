class DiceRoller {
  public static void main(String[] args) {
//		Write a program that generates a random number from 1 to 12
		// Great Axe.
		// W3Schools - Random Number Example
		// https://www.w3schools.com/java/java_math.asp
		int greatAxe = (int) (Math.random() * 12 + 1);
//		System.out.println(greatAxe);

		// The program will then generate two random numbers from 1 to 6
		// Great Sword.
		int greatSwordDie1 = (int) (Math.random() * 6 + 1);
		int greatSwordDie2 = (int) (Math.random() * 6 + 1);
		int greatSword = greatSwordDie1 + greatSwordDie2;
//		System.out.println(greatSwordDie1);
//		System.out.println(greatSwordDie2);
//		System.out.println(greatSword);
//		System.out.println(greatSwordDie1 + greatSwordDie2);

		// The program will then display the damage done by this weapon.
		// SAMPLE OUTPUT:
//		WEAPONS TEST:
//		Great Axe: 8
//		Great Sword: 10
		System.out.println("WEAPONS TEST:");
		System.out.println("Great Axe: " + greatAxe);
		System.out.println("Great Sword: " + greatSword);

//		which is more, tie?
//		The Great Sword did more damage.
		// greatSword is most; greatAxe is most; tie
		if (greatSword > greatAxe) { // greatSword is most
			System.out.println("The Great Sword did more damage.");
		} else if (greatAxe > greatSword) { // greatAxe is most
			System.out.println("The Great Axe did more damage.");

		} else { // tie
			System.out.println("The weapons did the same amount of damage.");
		}

		int diceRoll = rollDice(20);
		System.out.println(diceRoll);
		
//		SAMPLE OUTPUT:
//		WEAPONS TEST:
//		Great Axe: 8
//		Great Sword: 10
//		The Great Sword did more damage.
	}
	private static int rollDice(int sides) {
		int diceRoll = (int) (Math.random() * sides + 1);
		return diceRoll;

  }
}