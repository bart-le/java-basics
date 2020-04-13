import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Customer customer = new Customer("Bart", 13.37);
		Customer anotherCustomer;

		anotherCustomer = customer;
		anotherCustomer.setBalance(42.0);
		System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());

		ArrayList<Integer> integerArrayList = new ArrayList<>();
		integerArrayList.add(4);
		integerArrayList.add(2);
		integerArrayList.add(0);

		for (int i = 0; i < integerArrayList.size(); i++)
			System.out.println(i + ": " + integerArrayList.get(i));

		integerArrayList.add(1, 5);

		for (int i = 0; i < integerArrayList.size(); i++)
			System.out.println(i + ": " + integerArrayList.get(i));
	}
}
