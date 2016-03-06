


public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void reverse(int[] data, int start, int end) {
	    int left = start;
	    int right = end;

	    while( left < right ) {
	        // swap the values at the left and right indices
	        int temp = data[left];
	        data[left] = data[right];
	        data[right] = temp;

	        // move the left and right index pointers in toward the center
	        left++;
	        right--;
	    }
	}
	
	
	//N is positive
	public static void rotate(int[] arr, int n){
		
		int len = arr.length;
		n = n % len;
		
		reverse(arr,0,len-1);
		reverse(arr,0,n-1);
		reverse(arr,n,len-1);
		
	}

}
