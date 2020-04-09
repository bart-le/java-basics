public class Toyota extends Car {
	public Toyota(String name, int cylinders) {
		super(name, cylinders);
	}

	@Override
	public String startEngine() {
		return "Toyota: startEngine()";
	}

	@Override
	public String accelerate() {
		return "Toyota: accelerate()";
	}

	@Override
	public String brake() {
		return "Toyota: brake()";
	}
}
