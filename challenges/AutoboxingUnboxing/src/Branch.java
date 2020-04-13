import java.util.ArrayList;

public class Branch {
	private String name;
	private ArrayList<Customer> customers;

	public Branch(String name) {
		this.name = name;
		this.customers = new ArrayList<Customer>();
	}

	public ArrayList<Customer> getCustomers() {
		return customers;
	}

	public boolean addCustomer(String customerName, double initialTransactionAmount) {
		if (findCustomer(customerName) == null) {
			this.customers.add(new Customer(customerName, initialTransactionAmount));
			return true;
		} else {
			return false;
		}
	}

	public boolean addCustomerTransaction(String customerName, double amount) {
		Customer existingCustomer = findCustomer(customerName);
		if (existingCustomer != null) {
			existingCustomer.addTransaction(amount);
			return true;
		} else {
			return false;
		}
	}

	private Customer findCustomer(String customerName) {
		for (Customer customer : this.customers) {
			if (customer.getName().equals(customerName))
				return customer;
		}

		return null;
	}

	public String getName() {
		return name;
	}
}
