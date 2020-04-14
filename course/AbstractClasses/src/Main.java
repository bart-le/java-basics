public class Main {
	public static void main(String[] args) {
		Dog dog = new Dog("Leia");
		dog.eat();
		dog.breathe();

		Parrot parrot = new Parrot("Iago");
		parrot.eat();
		parrot.breathe();

		Penguin penguin = new Penguin("Kowalski");
		penguin.fly();
	}
}
