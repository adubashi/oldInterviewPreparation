import java.util.*;
public class pairsThatSumToAnInt {

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
        
        for(int i = 0; i < numbers.length; i++){
        	int target = n - numbers[i];
        	
        	if(set.contains(target)){
        		System.out.println(numbers[i] + " " + target);
        	} else {
        		set.add(numbers[i]);
        	}
        }
		
		
	}
}
