public class Main {
	public static void main(String[] args) {
		int[] prices = new int[]{1,2,3,4,5};
		System.out.println("Max profit is: " + maxProfit(prices));
	}

	public static int maxProfit(int[] prices) {
		int minPrice = Integer.MAX_VALUE;
		int profit = 0, totalProfit = 0;

		for (int price : prices) {
			if (price < minPrice) {
				minPrice = price;
			}

			profit = price - minPrice;

			if (profit > 0) {
				totalProfit += profit;
				minPrice = price;
			}
		}

		return totalProfit;
	}
}
