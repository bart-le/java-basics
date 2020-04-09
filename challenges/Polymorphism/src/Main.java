public class Main {
	public static void main(String[] args) {
		Car car = new Car("Soccer mom SUV", 8);
		System.out.println(car.startEngine());
		System.out.println(car.accelerate());
		System.out.println(car.brake());

		Toyota toyota = new Toyota("Corolla", 4);
		System.out.println(toyota.startEngine());
		System.out.println(toyota.accelerate());
		System.out.println(toyota.brake());

		Subaru subaru = new Subaru("Impreza", 4);
		System.out.println(subaru.startEngine());
		System.out.println(subaru.accelerate());
		System.out.println(subaru.brake());
	}
}
