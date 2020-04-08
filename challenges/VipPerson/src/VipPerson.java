public class VipPerson {
	private String name;
	private double creditLimit;
	private String emailAddress;

	public VipPerson() {
		this("John Doe", 100000.00, "john@doe.com");
	}

	public VipPerson(String name, double creditLimit) {
		this(name, creditLimit, "john@doe.com");
	}

	public VipPerson(String name, double creditLimit, String emailAddress) {
		this.name = name;
		this.creditLimit = creditLimit;
		this.emailAddress = emailAddress;
	}

	public String getName() {
		return name;
	}

	public double getCreditLimit() {
		return creditLimit;
	}

	public String getEmailAddress() {
		return emailAddress;
	}
}
