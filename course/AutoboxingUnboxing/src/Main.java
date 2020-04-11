import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		String[] stringArray = new String[10];
		int[] intArray = new int[10];

		ArrayList<String> stringArrayList = new ArrayList<String>();
		stringArrayList.add("Bart");

		ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
		intClassArrayList.add(new IntClass(31));

		Integer integer = new Integer(12);

		ArrayList<Integer> integerArrayList = new ArrayList<Integer>();

		for (int i = 0; i <= 10; i++)
			integerArrayList.add(Integer.valueOf(i));

		for (int i = 0; i <= 10; i++)
			System.out.println(i + ": " + integerArrayList.get(i).intValue());

		Integer intValue = 42;
		int primitive = intValue.intValue();

		ArrayList<Double> doubleArrayList = new ArrayList<Double>();

		for (double i = 0.0; i <= 10.0; i += 0.5)
			doubleArrayList.add(Double.valueOf(i));

		for (int i = 0; i < doubleArrayList.size(); i++) {
			double value = doubleArrayList.get(i).doubleValue();
			System.out.println(i + ": " + value);
		}
	}
}
