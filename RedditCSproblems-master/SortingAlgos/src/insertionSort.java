import java.util.Arrays;


public class insertionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array = {5,5,3,10,1,-9};
		insertionSort(array);
		System.out.println(Arrays.toString(array));

	}
	
	public static void insertionSort(int[] array){
		for(int i = 1; i < array.length; i++ ){
			int currentValue = array[i];
			int j;
			for(j = i - 1; j >= 0 && currentValue < array[j]; j-- ){
				array[j+1] = array[j];
			}
			array[j + 1] = currentValue;
		}
	}
	
	public static int findMin(int[] array, int startIndex){
		int min = array[startIndex];
		int minIndex = startIndex;
		for(int i = startIndex; i < array.length; i++){
			if(array[i] < min){
			   min = array[i];
			   minIndex = i;
			}
			
		}
		
		return minIndex;
	}
	
	public static void swap(int[] array, int i, int j){
		int temp = array[i];
		
		array[i] = array[j];
		
		array[j] = temp;
	}

}
