public class Main {
	public static void main(String[] args) {
		Printer printer = new Printer(50, true);
		System.out.println("Initial page count: " + printer.getPagesPrinted());
		int pagesPrinted = printer.printPages(3);
		System.out.println("Pages printed: " + pagesPrinted + "\nPrint count: " + printer.getPagesPrinted());
		pagesPrinted = printer.printPages(6);
		System.out.println("Pages printed: " + pagesPrinted + "\nPrint count: " + printer.getPagesPrinted());
	}
}
