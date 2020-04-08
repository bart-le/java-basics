public class Main {
	public static void main(String[] args) {
		Account account = new Account("123456789", 0.00, "Bart Le", "mail@example.com", "123 456 789");
		account.withdrawal(100.00);
		account.deposit(50.00);
		account.withdrawal(100.00);
		account.deposit(51.00);
		account.withdrawal(100.00);

		Account johnsAccount = new Account("John Doe", "john@doe.com", "111 111 111");
		System.out.println(johnsAccount.getNumber());
	}
}
