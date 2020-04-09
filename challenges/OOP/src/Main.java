public class Main {
	public static void main(String[] args) {
		Hamburger krabbyPatty = new Hamburger("Krabby Patty", "Chum", "Bun", 2.99);
		krabbyPatty.addHamburgerExtra1("Lettuce", 0.27);
		krabbyPatty.addHamburgerExtra2("Cheese", 0.75);
		krabbyPatty.addHamburgerExtra3("Onions", 1.12);
		krabbyPatty.addHamburgerExtra4("Tomato", 0.42);
		System.out.println("Total burger price is " + krabbyPatty.itemizeHamburger());

		HealthyBurger healthyBurger = new HealthyBurger("Soy", 4.20);
		healthyBurger.addHamburgerExtra1("Avocado", 5.21);
		healthyBurger.addHealthyExtra1("Spinach", 2.13);
		System.out.println("Total burger price is " + healthyBurger.itemizeHamburger());

		DeluxeBurger deluxeBurger = new DeluxeBurger();
		deluxeBurger.addHamburgerExtra3("Shrooms", 50.00);
		deluxeBurger.itemizeHamburger();
	}
}
