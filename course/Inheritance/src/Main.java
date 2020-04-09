public class Main {
	public static void main(String[] args) {
		Animal animal = new Animal("Animal", 1, 1, 5, 5);

		Dog dog = new Dog("Leia", 6, 6, 2, 4, 1, 42, "short");
		dog.eat();
		dog.walk();
		dog.run();
	}
}
