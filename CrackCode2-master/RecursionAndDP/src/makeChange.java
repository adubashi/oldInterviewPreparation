
public class makeChange {
	
	public static int makeChangeRec(int amount, int[] denoms, int index){
		if(index >= denoms.length - 1){
			return 1;
		} 
		int denomAmount = denoms[index];
		int ways = 0;
		for(int i = 0; i * denomAmount <= amount; i++){
			int amountRemaining = amount - i * denomAmount;
			ways += makeChangeRec(amountRemaining, denoms, index + 1);		
		}
		
		return ways;
		
	}
	
	public static int makeChange(int n){
		int[] denoms = {25, 10, 5, 1};
		return makeChangeRec(n, denoms, 0);
	}
	

}
