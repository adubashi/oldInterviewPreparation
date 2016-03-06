
public class LargestContinuousSequence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] array = {5 ,-9, 6 ,-2, 3};
		
		System.out.println(getMaxSum(array));

	}
	
	//Finding the contiguous sequence with the largest sum
	public static int getMaxSum(int[] a){
		int maxSum = 0;
		int sum = 0;
		for(int i = 0; i < a.length; i++){
			sum += a[i];
			if(maxSum < sum){
				maxSum = sum;
			} else if(sum < 0){
				sum = 0;
			}
		}	
		return maxSum;
		
	}
	

}
