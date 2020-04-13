public class Main {
	public static void main(String[] args) {
		Bank bank = new Bank("Big Bank");

		if (bank.addBranch("San Francisco"))
			System.out.println("San Francisco branch created.");

		bank.addCustomer("San Francisco", "Bart", 10000.0);
		bank.addCustomer("San Francisco", "James", 150.0);
		bank.addCustomer("San Francisco", "Xavier", 420.0);

		bank.addBranch("New York City");

		bank.addCustomer("New York City", "Mike", 50.00);
		bank.addCustomer("New York City", "Frank", 750.00);

		bank.addTransaction("San Francisco", "Bart", 500.0);
		bank.addTransaction("San Francisco", "Bart", 5000.0);
		bank.addTransaction("San Francisco", "Xavier", 30.0);

		bank.listCustomers("San Francisco", true);
		bank.listCustomers("New York City", true);

		bank.addBranch("Los Angeles");
		if (!bank.addCustomer("Los Angeles", "Jim", 133.70))
			System.out.println("Los Angeles branch does not exist.");

		if (!bank.addBranch("San Francisco"))
			System.out.println("San Francisco branch already exists.");

		if (!bank.addTransaction("San Francisco", "Tim", 40.00))
			System.out.println("Customer Tim does not exist at San Francisco branch.");

		if (!bank.addCustomer("San Francisco", "Bart", 133.70))
			System.out.println("Customer Bart already exists.");
	}
}
