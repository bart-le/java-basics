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
		System.out.println(bartsBasket);

		sellItem(bartsBasket, "juice", 4);
		sellItem(bartsBasket, "lamp", 2);
		sellItem(bartsBasket, "table", 3);
		System.out.println(bartsBasket);

		System.out.println(stockList);

		stockList.Items().get("hot dog").adjustStock(1000);
		stockList.get("hot dog").adjustStock(-500);
		System.out.println(stockList);

		for (Map.Entry<String, Double> price : stockList.PriceList().entrySet())
			System.out.println(price.getKey() + " costs " + String.format("%.2f", price.getValue()));
	}

	public static int sellItem(Basket basket, String item, int quantity) {
		StockItem stockItem = stockList.get(item);

		if (stockItem == null) {
			System.out.println("\nWe don't sell " + item);
			return 0;
		}

		if (stockList.sellStock(item, quantity) != 0) {
			basket.addToBasket(stockItem, quantity);
			return quantity;
		}

		return 0;
	}
}
