import java.util.Map;

public class Main {
	private static StockList stockList = new StockList();

	public static void main(String[] args) {
		StockItem temp = new StockItem("hot dog", 0.50, 100);
		stockList.addStock(temp);
		temp = new StockItem("table", 7.99, 50);
		stockList.addStock(temp);
		temp = new StockItem("chair", 79.00, 45);
		stockList.addStock(temp);
		temp = new StockItem("bed", 179.00, 10);
		stockList.addStock(temp);
		temp = new StockItem("shelf", 199.00, 12);
		stockList.addStock(temp);
		temp = new StockItem("rug", 29.99, 31);
		stockList.addStock(temp);
		temp = new StockItem("sofa", 379.00, 3);
		stockList.addStock(temp);
		temp = new StockItem("lamp", 69.99, 9);
		stockList.addStock(temp);

		System.out.println(stockList);

		for (String item : stockList.Items().keySet())
			System.out.println(item);

		Basket bartsBasket = new Basket("Bart");

		sellItem(bartsBasket, "chair", 20);
		System.out.println(bartsBasket);

		sellItem(bartsBasket, "chair", 25);
		System.out.println(bartsBasket);

		if (sellItem(bartsBasket, "chair", 4) != 4)
			System.out.println("\nNo more chairs for sale");

		sellItem(bartsBasket, "beer", 6);
//		System.out.println(bartsBasket);

		sellItem(bartsBasket, "juice", 4);
		sellItem(bartsBasket, "lamp", 2);
		sellItem(bartsBasket, "table", 3);
//		System.out.println(bartsBasket);

//		System.out.println(stockList);

		Basket customersBasket = new Basket("customer");
		sellItem(customersBasket, "shelf", 10);
		sellItem(customersBasket, "lamp", 3);
		sellItem(customersBasket, "lawnmower", 2);
		removeItem(customersBasket, "lamp", 2);
		System.out.println(customersBasket);

		removeItem(bartsBasket, "table", 2);
		removeItem(bartsBasket, "chair", 41);
		removeItem(bartsBasket, "table", 1);
		System.out.println("tables removed: " + removeItem(bartsBasket, "table", 1));
		System.out.println(bartsBasket);

		removeItem(bartsBasket, "lamp", 1);
		removeItem(bartsBasket, "chair", 4);
		removeItem(bartsBasket, "lamp", 1);
		removeItem(bartsBasket, "covets", 2);
		System.out.println(bartsBasket);

		System.out.println("\nBefore checkout:");
		System.out.println(customersBasket);
		System.out.println(stockList);
		checkout(customersBasket);
		System.out.println("\nAfter checkout:");
		System.out.println(customersBasket);
		System.out.println(stockList);

		StockItem hotDog = stockList.Items().get("hot dog");
		if (hotDog != null)
			hotDog.adjustStock(1000);
		if (hotDog != null)
			stockList.get("hot dog").adjustStock(-500);

		System.out.println(stockList);

//		for (Map.Entry<String, Double> price : stockList.PriceList().entrySet())
//			System.out.println(price.getKey() + " costs " + String.format("%.2f", price.getValue()));

		checkout(bartsBasket);
		System.out.println(bartsBasket);
	}

	public static int sellItem(Basket basket, String item, int quantity) {
		StockItem stockItem = stockList.get(item);

		if (stockItem == null) {
			System.out.println("\nWe don't sell " + item);
			return 0;
		}

		if (stockList.reserveStock(item, quantity) != 0)
			return basket.addToBasket(stockItem, quantity);

		return 0;
	}

	public static int removeItem(Basket basket, String item, int quantity) {
		StockItem stockItem = stockList.get(item);

		if (stockItem == null) {
			System.out.println("\nWe don't sell " + item);
			return 0;
		}

		if (basket.removeFromBasket(stockItem, quantity) == quantity)
			return stockList.unreserveStock(item, quantity);

		return 0;
	}

	public static void checkout(Basket basket) {
		for (Map.Entry<StockItem, Integer> item : basket.Items().entrySet())
			stockList.sellStock(item.getKey().getName(), item.getValue());

		basket.clearBasket();
	}
}
