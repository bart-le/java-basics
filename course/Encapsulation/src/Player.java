public class Player {
	private String name;
	private int hitPoints;
	private String weapon;

	public Player(String name, int health, String weapon) {
		this.name = name;
		this.hitPoints = health > 0 && health <= 100 ? health : 100;
		this.weapon = weapon;
	}

	public void loseHealth(int damage) {
		this.hitPoints = this.hitPoints - damage;
		if (this.hitPoints <= 0) {
			System.out.println("Player knocked out.");
		}
	}

	public int getHealth() {
		return hitPoints;
	}
}
