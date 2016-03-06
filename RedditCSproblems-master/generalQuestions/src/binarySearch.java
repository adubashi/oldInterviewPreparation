
public class binarySearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int binarySearch(int[] array,int target){
		int low = 0;
		int high = array.length - 1;
		int mid = low + (high-low)/2;
		
		while(low <= high){
			mid = low + (low+high)/2;
			
			if(array[mid] == target){
				return mid;
			} else if(array[mid] > target){
				high = mid - 1;
			} else {
				low = mid + 1;
			}
			
			
		}
		
		return -1;
	}
	
	public static int binarySearchRec(int[] array,int target,int low, int high){
		if( low > high){
			return -1;
		}
		int mid = low + (high - low)/2;
		if(array[mid] == target){
			return mid;
		} else if(array[mid] > target ){
			return binarySearchRec(array,target,low,mid - 1);
		} else {
			return binarySearchRec(array,target,mid+1, high);
		}
	}
	
	public static int binarySearchRR(int[] array, int target){
		return binarySearchRec(array,target,0,array.length -1);
	}

}
