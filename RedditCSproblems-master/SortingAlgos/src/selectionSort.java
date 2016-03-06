import java.util.Arrays;


public class selectionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array = {5,5,3,2,1,-9};
		selectionSort(array);
		System.out.println(Arrays.toString(array));

	}
	
	public static void selectionSort(int[] array){
		int positionOfMax = 0;
		for(int i = 0; i < array.length; i++ ){
			int minIndex = findMin(array,i);
			System.out.println(minIndex);
			swap(array,i,minIndex);
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
