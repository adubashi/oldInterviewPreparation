
public class MaxTwoNumbers {
	public static void main(String Args[]){
		int[] arr = {1,2,3,4,7,10,15};
		
		System.out.println(maxTwoNum(arr));
		
	}
	
	public static int maxTwoNum(int[] arr){
	
		
		if(arr.length <= 1){
			return 0;
		}
		
		if(arr.length == 2){
			if(arr[1] > arr[0]){
				return arr[0];
			} else {
				return arr[1];
			}
		}
		
		int max = arr[0];
		int secondMax = arr[0];
		
		if(arr[0] <= arr[1]){
			max = arr[1];
			secondMax = arr[0];		
		} else {
			max = arr[0];
			secondMax = arr[1];		
		}
		
		
		
		for(int i = 2; i < arr.length; i++){
			// If we've found a new highest number...
		    if (arr[i] > max) {

		        // ...shift the current highest number to second highest
		        secondMax = max;

		        // ...and set the new highest.
		        max = arr[i];
		    } else if (arr[i] > secondMax){
		        // Just replace the second highest
		        secondMax= arr[i];
		    }
		}
			
		
	  return secondMax;
	  
	}
	



}
