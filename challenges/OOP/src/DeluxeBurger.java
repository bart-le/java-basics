public class DeluxeBurger extends Hamburger {
	public DeluxeBurger() {
		super("Royale with Cheese", "Quarter Pounder", "Brioche", 9.37);
		super.addHamburgerExtra1("Chips", 2.00);
		super.addHamburgerExtra2("Coke", 2.00);
	}

	@Override
	public void addHamburgerExtra1(String name, double price) {
		System.out.println("Cannot add extra items to a deluxe burger");
	}

	@Override
	public void addHamburgerExtra2(String name, double price) {
		System.out.println("Cannot add extra items to a deluxe burger");
	}

	@Override
	public void addHamburgerExtra3(String name, double price) {
		System.out.println("Cannot add extra items to a deluxe burger");
	}

	@Override
	public void addHamburgerExtra4(String name, double price) {
		System.out.println("Cannot add extra items to a deluxe burger");
	}
}
