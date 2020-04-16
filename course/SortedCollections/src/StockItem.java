public class StockItem implements Comparable<StockItem> {
	private final String name;
	private double price;
	private int quantityStock;

	public StockItem(String name, double price) {
		this.name = name;
		this.price = price;
		this.quantityStock = 0;
	}

	public StockItem(String name, double price, int quantityStock) {
		this.name = name;
		this.price = price;
		this.quantityStock = quantityStock;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price > 0)
			this.price = price;
	}

	public int getQuantityInStock() {
		return quantityStock;
	}

	public void setQuantityStock(int quantityStock) {
		this.quantityStock = quantityStock;
	}

	public void adjustStock(int quantity) {
		int newQuantity = this.quantityStock + quantity;

		if (newQuantity >= 0) {
			this.quantityStock = newQuantity;
		}
	}

	@Override
	public boolean equals(Object object) {
		System.out.println("StockItem.equals(object);");

		if (this == object)
			return true;

		if ((object == null) || (this.getClass() != object.getClass()))
			return false;

		String objectName = ((StockItem) object).getName();
		return this.name.equals(objectName);
	}

	@Override
	public int hashCode() {
		return this.name.hashCode() + 31;
	}

	@Override
	public int compareTo(StockItem object) {
		System.out.println("StockItem.compareTo(object);");

		if (this == object)
			return 0;

		if (object != null)
			return this.name.compareTo(object.getName());

		throw new NullPointerException();
	}

	@Override
	public String toString() {
		return this.name + ": $" + String.format("%.2f", this.price);
	}
}
