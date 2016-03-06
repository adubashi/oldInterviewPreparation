import java.util.*;
public class checkForRotation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			int[] array1 = {1,2,2};
			int[] array2 = {2,2,1};
			System.out.println(isRotation(array1,array2));

	}
	
	//Check if a subArray
	public static boolean findSubArray2(int[] array1, int[] array2){
		HashSet<Integer> hs = new HashSet<Integer>();
 
		for(int i=0; i<array1.length; i++)
			hs.add(array1[i]);
 
		for(int j=0; j<array2.length; j++){
			if(hs.contains(array2[j]) == false)
				return false;
		}
		return true;
	}	
	
	
	//Check if a array of is a rotation of another array
	public static boolean isRotation(int[] array1, int[] array2){
		
		//array1 doubled!
		int[] doubleArray =  new int[2*array1.length];
		
		for(int i = 0; i <array1.length; i++){
			doubleArray[i] = array1[i];
		}
		for(int i = array1.length; i <array1.length*2; i++){
			doubleArray[i] = array1[i -array1.length];
		}
		
		System.out.println(Arrays.toString(doubleArray));
		System.out.println(Arrays.toString(array2));
		
		
		
		
		return findSubArray2(doubleArray, array2);
	}

}
