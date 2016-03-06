
public class MaximumStockProfit {

	public static void main(String[] args) {
		
		int[] arr = {4,5,6,7,8,76,3,4,10};
		
		System.out.println(maxProfit(arr));

	}
	
	public static int maxProfit(int[] prices){
		
		int curProfit = Integer.MIN_VALUE;
		
		int curBuy = prices[0];
		int globalSell = prices[1];
		
		int globalProfit = globalSell - curBuy;
		
		for(int i = 1; i < prices.length; i++){
			curProfit = prices[i] - curBuy;
			if(curProfit > globalProfit){
				globalProfit = curProfit;
				globalSell = prices[i];
			}
			if(prices[i] < curBuy){
				curBuy = prices[i];
			}
		}

		return globalProfit;
	}
}
