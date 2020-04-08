public class Main {
	public static void main(String[] args) {
		VipPerson person1 = new VipPerson();
		System.out.println(person1.getName());

		VipPerson person2 = new VipPerson("Bart Le", 1000000.00);
		System.out.println(person2.getName());

		VipPerson person3 = new VipPerson("Michael Jordan", 250000.00, "michael@jordan.com");
		System.out.println(person3.getEmailAddress());
	}
}
