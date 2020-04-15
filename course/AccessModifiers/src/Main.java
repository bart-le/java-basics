public class Main {
	public static void main(String[] args) {
		Account bartsAccount = new Account("Bart");
		bartsAccount.deposit(1000);
		bartsAccount.withdraw(500);
		bartsAccount.withdraw(-250);
		bartsAccount.withdraw(-20);
		bartsAccount.calculateBalance();
	}
}
