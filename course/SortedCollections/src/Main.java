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
	}
}
