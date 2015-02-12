
public class Solution {
	public int maxProfit(int[] prices) {
		if(prices.length == 0)
			return 0;
		int low = prices[0];
		int profit = 0;
		for(int i = 1; i < prices.length; i++){
			low = Math.min(prices[i], low);
			profit = Math.max(profit, prices[i] - low);
		}
		return profit;
	}
}
