public class Main {
	public static void main(String[] args) {
		int[] prices = new int[]{2,4,1};
		System.out.println("Max Profit that can be made is: " + maxProfit(prices));
	}

	public static int maxProfit(int[] prices) {
		int minPrice = Integer.MAX_VALUE;
		int maxProfit = 0;

		for (int price : prices) {
			if (price < minPrice) minPrice = price;

			int profit = price - minPrice;

			if (profit > maxProfit) maxProfit = profit;
		}

		return maxProfit;
	}
}