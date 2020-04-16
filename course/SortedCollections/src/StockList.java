import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class StockList {
	private final Map<String, StockItem> list;

	public StockList() {
		this.list = new LinkedHashMap<>();
	}

	public int addStock(StockItem item) {
		if (item != null) {
			StockItem inStock = list.getOrDefault(item.getName(), item);

			if (inStock != item)
				item.adjustStock(inStock.getQuantityInStock());

			list.put(item.getName(), item);
			return item.getQuantityInStock();
		} else {
			return 0;
		}
	}

	public int sellStock(String item, int quantity) {
		StockItem inStock = list.getOrDefault(item, null);

		if ((inStock != null) && (inStock.getQuantityInStock() >= quantity) && (quantity > 0)) {
			inStock.adjustStock(-quantity);
			return quantity;
		} else {
			return 0;
		}
	}

	public StockItem get(String key) {
		return list.get(key);
	}

	public Map<String, StockItem> Items() {
		return Collections.unmodifiableMap(list);
	}

	public Map<String, Double> PriceList() {
		Map<String, Double> prices = new LinkedHashMap<>();

		for (Map.Entry<String, StockItem> item : list.entrySet())
			prices.put(item.getKey(), item.getValue().getPrice());

		return Collections.unmodifiableMap(prices);
	}

	@Override
	public String toString() {
		String s = "\nStock list:\n";
		double totalCost = 0.0;

		for (Map.Entry<String, StockItem> item : list.entrySet()) {
			StockItem stockItem = item.getValue();
			double itemValue = stockItem.getPrice() * stockItem.getQuantityInStock();

			s += stockItem + " - " + stockItem.getQuantityInStock() + " in stock, value of items: $";
			s += String.format("%.2f", itemValue) + "\n";

			totalCost += itemValue;
		}

		return s + "\nTotal stock value: $" + String.format("%.2f", totalCost);
	}
}
