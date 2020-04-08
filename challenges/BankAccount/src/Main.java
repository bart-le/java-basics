public class Main {
	public static void main(String[] args) {
		Account account = new Account();
		account.setNumber("123456789");
		account.setBalance(0.00);
		account.setCustomerName("Bart Le");
		account.setCustomerEmailAddress("mail@example.com");
		account.setCustomerPhoneNumber("123 456 789");
		account.withdrawal(100.00);
		account.deposit(50.00);
		account.withdrawal(100.00);
		account.deposit(51.00);
		account.withdrawal(100.00);
	}
}
