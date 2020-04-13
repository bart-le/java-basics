import java.util.ArrayList;

public class Bank {
	private String name;
	private ArrayList<Branch> branches;

	public Bank(String name) {
		this.name = name;
		this.branches = new ArrayList<Branch>();
	}

	public boolean addBranch(String branchName) {
		if (findBranch(branchName) == null) {
			this.branches.add(new Branch(branchName));
			return true;
		} else {
			return false;
		}
	}

	public boolean addCustomer(String branchName, String customerName, double initialTransactionAmount) {
		Branch branch = findBranch(branchName);
		if (branch != null) {
			return branch.addCustomer(customerName, initialTransactionAmount);
		} else {
			return false;
		}
	}

	public boolean addTransaction(String branchName, String customerName, double initialTransactionAmount) {
		Branch branch = findBranch(branchName);
		if (branch != null) {
			return branch.addCustomerTransaction(customerName, initialTransactionAmount);
		} else {
			return false;
		}
	}

	private Branch findBranch(String branchName) {
		for (Branch branch : this.branches) {
			if (branch.getName().equals(branchName))
				return branch;
		}
		return null;
	}

	public boolean listCustomers(String branchName, boolean showTransactions) {
		Branch branch = findBranch(branchName);
		if (branch != null) {
			System.out.println(branchName + " list of customers:");
			ArrayList<Customer> branchCustomers = branch.getCustomers();
			for (int i = 0; i < branchCustomers.size(); i++) {
				Customer branchCustomer = branchCustomers.get(i);
				System.out.println("Customer " + (i + 1) + ": " + branchCustomer.getName());

				if (showTransactions) {
					System.out.println("List of transactions:");
					ArrayList<Double> transactions = branchCustomer.getTransactions();
					for (int j = 0; j < transactions.size(); j++)
						System.out.println((j + 1) + ": " + transactions.get(j));
				}
			}

			return true;
		} else {
			return false;
		}
	}
}
