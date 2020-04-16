public class DogMain {
	public static void main(String[] args) {
		Pug doug1 = new Pug("Doug");
		Dog doug2 = new Dog("Doug");

		System.out.println(doug1.equals(doug2));
		System.out.println(doug2.equals(doug1));
	}
}
