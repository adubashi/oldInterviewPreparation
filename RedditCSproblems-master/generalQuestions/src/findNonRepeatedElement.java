
public class findNonRepeatedElement {
	
	public static void main(String Args[]){
		int[] array = {1,1,3,3,5,5,7};
		
		System.out.println(findNonRepeatedElement(array));
	}
	
	
	public static int findNonRepeatedElement(int[] arr){
		int result = 0;
		for (int a : arr){
		    result ^= a;
		}
		return result;
		
	}

}
