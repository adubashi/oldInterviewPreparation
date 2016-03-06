import java.util.*;
public class allPairsThatSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array = {-2, -1, 0, 3, 5,6,7,9,13,14};
		printPairsUsingSet(array,8);

	}
	
	public static void printPairsUsingSet(int[] numbers, int n){
        if(numbers.length < 2){
            return;
        }        
        Set set = new HashSet(numbers.length);
        
        for(int value : numbers){
            int target = n - value;
            
            // if target number is not in set then add
            if(!set.contains(target)){
                set.add(value);
            }else {
                System.out.printf("(%d, %d) %n", value, target);
            }
        }
	}
	
	public static void printPairSums(int[] array, int sum){
		Arrays.sort(array);
		int first = 0;
		int last = array.length - 1;
		while( first < last){
			int s = array[first] + array[last];
			if(s == sum){
				System.out.println(array[first] + " " + array[last]);
				first++;
				last--;
			} else {
				if(s < sum){
					first++;
				} else {
					last--;
				}
			}
		}
	}

}
