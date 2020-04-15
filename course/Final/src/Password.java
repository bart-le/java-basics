public class Password {
	private static final int key = 1337;
	private final int encryptedPassword;

	public Password(int password) {
		this.encryptedPassword = encryptDecrypt(password);
	}

	private int encryptDecrypt(int password) {
		return password ^ key;
	}

	final public void storePassword() {
		System.out.println("Saving password as " + this.encryptedPassword);
	}

	public boolean login(int password) {
		if (encryptDecrypt(password) == this.encryptedPassword) {
			System.out.println("Login successful");
			return true;
		} else {
			System.out.println("Wrong password");
			return false;
		}
	}
}
