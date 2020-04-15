public class StaticTest {
	private String name;
	private static int instanceCount = 0;

	public StaticTest(String name) {
		this.name = name;
		instanceCount++;
	}

	public String getName() {
		return name;
	}

	public static int getInstanceCount() {
		return instanceCount;
	}
}
