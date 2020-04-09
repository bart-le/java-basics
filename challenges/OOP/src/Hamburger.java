public class Hamburger {
	private String name;
	private String meat;
	private String breadRollType;
	private double price;

	private String extra1Name;
	private String extra2Name;
	private String extra3Name;
	private String extra4Name;
	private double extra1price;
	private double extra2price;
	private double extra3price;
	private double extra4price;

	public Hamburger(String name, String meat, String breadRollType, double price) {
		this.name = name;
		this.meat = meat;
		this.breadRollType = breadRollType;
		this.price = price;
	}

	public void addHamburgerExtra1(String name, double price) {
		this.extra1Name = name;
		this.extra1price = price;
	}

	public void addHamburgerExtra2(String name, double price) {
		this.extra2Name = name;
		this.extra2price = price;
	}

	public void addHamburgerExtra3(String name, double price) {
		this.extra3Name = name;
		this.extra3price = price;
	}

	public void addHamburgerExtra4(String name, double price) {
		this.extra4Name = name;
		this.extra4price = price;
	}

	public double itemizeHamburger() {
		double hamburgerPrice = this.price;
		System.out.println(this.name + " hamburger on a " + this.breadRollType + " roll with " + this.meat + " price is " + this.price);

		if (this.extra1Name != null) {
			hamburgerPrice += this.extra1price;
			System.out.println("Added " + this.extra1Name + " for an extra " + this.extra1price);
		}
		if (this.extra2Name != null) {
			hamburgerPrice += this.extra2price;
			System.out.println("Added " + this.extra2Name + " for an extra " + this.extra2price);
		}
		if (this.extra3Name != null) {
			hamburgerPrice += this.extra3price;
			System.out.println("Added " + this.extra3Name + " for an extra " + this.extra3price);
		}
		if (this.extra4Name != null) {
			hamburgerPrice += this.extra4price;
			System.out.println("Added " + this.extra4Name + " for an extra " + this.extra4price);
		}

		return hamburgerPrice;
	}
}
