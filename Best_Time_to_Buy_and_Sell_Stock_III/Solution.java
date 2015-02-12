
public class Solution {
	public int maxProfit(int[] prices) {
		if(prices.length == 0)
			return 0;
		int[] historyProfit = new int[prices.length];
		int[] futureProfit = new int[prices.length];
		
		int low = prices[0];
		int high = prices[prices.length - 1];
		int profit = 0;
		
		
		for(int i = 1; i < prices.length; i++){
			low = Math.min(prices[i],low);
			historyProfit[i] = Math.max(historyProfit[i - 1], prices[i] - low);
			
		}
		
		for(int i = prices.length - 2;i >= 0; i--){
			high = Math.max(prices[i], high);
			futureProfit[i] = Math.max(futureProfit[i + 1], high - prices[i]);
			profit = Math.max(profit, historyProfit[i] + futureProfit[i]);
		}
		return profit;
	}
}
