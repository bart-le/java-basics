public class Main {
	public static void main(String[] args) {
		ITelephone bartsPhone;
		bartsPhone = new DeskPhone(997);
		bartsPhone.powerOn();
		bartsPhone.callPhone(997);
		bartsPhone.answer();

		bartsPhone = new MobilePhone(1337);
		bartsPhone.powerOn();
		bartsPhone.callPhone(1337);
		bartsPhone.answer();
	}
}
