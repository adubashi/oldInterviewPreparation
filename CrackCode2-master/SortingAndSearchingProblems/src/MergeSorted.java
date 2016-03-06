import java.util.Arrays;


public class MergeSorted {

	public static void main(String[] args) {
		int[] a = new int[5];
		a[0] = 1;
		a[1] = 3;
		a[2] = 5;
		
		int[] b = {2,4};
		
		merge(a,b,3,2);
		
		System.out.println(Arrays.toString(a));

	}
	
	public static void merge(int[] a, int[] b, int lastA, int lastB){
		int indexA = lastA - 1;
		int indexB = lastB - 1;
		int indexMerged = lastB + lastA - 1;
		
		while(indexB >= 0){
			System.out.println(Arrays.toString(a));
			System.out.println(Arrays.toString(b));
			if(indexA >= 0 && a[indexA] > b[indexB]){
				//If we do not need to put the B element into A
				a[indexMerged] = a[indexA];
				indexA--;
			} else {
				//If we do need to put the B element into A
				a[indexMerged] = b[indexB];
				indexB--;
				
			}
		}
		System.out.println(Arrays.toString(a));
		
		
	}

}
