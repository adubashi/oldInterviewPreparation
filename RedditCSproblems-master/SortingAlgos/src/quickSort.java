import java.util.Arrays;


public class quickSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		int[] array = {5,5,3,10,1,-9};
		quickSortAlgo(array,0,array.length -1 );
		System.out.println(Arrays.toString(array));

	}
	
	public static void quickSortAlgo(int[] array, int low, int high){
		if( low < high){
			int pivot = partition(array, low, high);
			quickSortAlgo(array,low,pivot -1);
			quickSortAlgo(array,pivot + 1,high);
			
		}
	}
	
	public static int partition(int[] input, int p, int r)
	{
	    int pivot = input[r];

	    while ( p < r )
	    {
	    	while(input[p] < pivot){
	    		p++;
	    	}
	    	while(input[r] > pivot){
	    		r--;
	    	}
	    	if( input[r] == input[p]){
	    		p++;
	    	} else if( p < r){
	    		swap(input, p , r);
	    	}
	    }
	    
	    return r;
	}
	
	public static void swap(int[] array, int i, int j){
		int temp = array[i];
		
		array[i] = array[j];
		
		array[j] = temp;
	}


}
