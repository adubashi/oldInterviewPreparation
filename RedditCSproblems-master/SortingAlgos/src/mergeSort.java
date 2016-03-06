import java.util.*;
public class mergeSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {5,5,3,10,1,-9};
		mergeSort(array,0,array.length -1 );
		System.out.println(Arrays.toString(array));

	}
	
	public static void mergeSort(int[] array, int low, int high){
		if(low < high){
			int middle = (low+high)/2;
			mergeSort(array,low,middle);
			mergeSort(array,middle+1,high);
			merge(array,low,high);
			
		}
	}
	
	public static void merge(int[] input, int low, int high){
		int mid = (low + high) / 2;
		int i1 = 0;
		int i2 = low;
		int i3 = mid + 1;
		
		int[] temp = new int[high - low + 1];
		
		
		//Merge the two sorted arrays
		while( i2 <= mid && i3 <= high){
			if(input[i2] < input[i3]){
				temp[i1++] = input[i2++];
			} else {
				temp[i1++] = input[i3++];
			}
		}
		//Merge the remaining elements in left array
		while(i2 <= mid){
			temp[i1++] = input[i2++];
		}
		
		//Merge the remaining elements in right array
		while(i3 <= high){
			temp[i1++] = input[i3++];
		}
		
		// Move from temp array to master array
	    for ( int i = low; i <= high; i++ )
	        input[i] = temp[i-low];
	    
	    System.out.println(Arrays.toString(input));
		
		
	}

}
