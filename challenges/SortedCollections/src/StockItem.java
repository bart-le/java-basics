public class StockItem implements Comparable<StockItem> {
	private final String name;
	private double price;
	private int quantityInStock;
	private int reserved;

	public StockItem(String name, double price) {
		this.name = name;
		this.price = price;
		this.quantityInStock = 0;
		this.reserved = 0;
	}

	public StockItem(String name, double price, int quantityInStock) {
		this.name = name;
		this.price = price;
		this.quantityInStock = quantityInStock;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public int getAvailableQuantity() {
		return quantityInStock - reserved;
	}

	public void setPrice(double price) {
		if (price > 0)
			this.price = price;
	}

	public void setQuantityInStock(int quantityInStock) {
		this.quantityInStock = quantityInStock;
	}

	public int reserveStock(int quantity) {
		if (quantity <= getAvailableQuantity()) {
			reserved += quantity;
			return quantity;
		} else {
			return 0;
		}
	}

	public int unreserveStock(int quantity) {
		if (quantity <= reserved) {
			reserved -= quantity;
			return quantity;
		} else {
			return 0;
		}
	}

	public void adjustStock(int quantity) {
		int newQuantity = this.quantityInStock + quantity;

		if (newQuantity >= 0) {
			this.quantityInStock = newQuantity;
		}
	}

	public int finalizeStock(int quantity) {
		if (quantity <= reserved) {
			quantityInStock -= quantity;
			reserved -= quantity;
			return quantity;
		} else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object object) {
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
		if (this == object)
			return 0;

		if (object != null)
			return this.name.compareTo(object.getName());

		throw new NullPointerException();
	}

	@Override
	public String toString() {
		return this.name + ": $" + String.format("%.2f", this.price) + ", reserved: " + this.reserved;
	}
}
