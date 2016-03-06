
public class stockPrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int findBuySell(int[] array){
		if(array == null || array.length < 2){
			return 0;
		}
		int currentBuy = array[0];
		int globalSell = array[1];
		int globalProfit = globalSell - currentBuy;
		
		int currentProfit = Integer.MIN_VALUE;
		
		for(int i = 1; i < array.length; i++){
			currentProfit = array[i] - currentBuy;
			if(currentProfit > globalProfit){
				globalProfit = currentProfit;
				globalSell = array[i];
			}
			if(currentBuy > array[i]){
				currentBuy = array[i];
			}
		}
		
		return globalProfit;
		
		
	}

}
