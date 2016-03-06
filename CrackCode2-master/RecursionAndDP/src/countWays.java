
public class countWays {
	
	
	public int countSteps(int n){
		if( n < 0){
			return 0;
		} else if(n == 0){
			return 1;
		} else {
			return countSteps(n - 1) + countSteps(n - 2) + countSteps(n - 3);
		}
	}
	
	public int countSteps(int n, int[] map){
		if(n < 0){
			return 0;
		} else if(n == 0){
			return 1;
		} else if(map[n] > -1){
			return map[n];
		} else {
			map[n] = countSteps(n - 1, map) +
					 countSteps(n - 2, map) +
					 countSteps(n - 3, map);
			return map[n];
		}
	}

}
