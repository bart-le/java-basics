import com.example.series.Series;

public class Main {
	public static void main(String[] args) {
		System.out.println("Arithmetic series:");
		for (int i = 0; i <= 10; i++)
			System.out.println(Series.nSum(i));

		System.out.println("Factorials:");
		for (int i = 0; i <= 10; i++)
			System.out.println(Series.factorial(i));

		System.out.println("Fibonacci sequence:");
		for (int i = 0; i <= 10; i++)
			System.out.println(Series.fibonacci(i));
	}
}
