import java.util.Arrays;


public class bubbleSort {
	
	public static void main(String Args[]){
		int[] array = {5,5,3,2,1,-9};
		int[] array1 = {};
		bubbleSort(array);
		System.out.println(Arrays.toString(array));
	}
	
	
	
	
	public static void bubbleSort(int[] array){
		for(int i = 0; i < array.length; i++ ){
			for(int j = i + 1; j < array.length; j++){
				if(array[j - 1] > array[j]){
					swap(array,i,j);
				}
				
			}
		}
	}
	
	public static void swap(int[] array, int i, int j){
		int temp = array[i];
		
		array[i] = array[j];
		
		array[j] = temp;
	}

}
