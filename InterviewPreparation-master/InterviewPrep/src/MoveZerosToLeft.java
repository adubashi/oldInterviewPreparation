
import java.util.*;

public class MoveZerosToLeft {

	public static void main(String[] args) {
		int[] A = {1,2,6,0,8,0,9,0,10};
		
		System.out.println(Arrays.toString(A));
		
		moveZerosToLeft(A);
		
		System.out.println(Arrays.toString(A));

	}
	
	public static void moveZerosToLeft(int[] A){
		if(A == null){
			return;
		}
		
		int write_index = A.length - 1;
		int read_index = A.length -1;
		
		while(read_index >= 0){
			if(A[read_index] != 0){
				A[write_index] = A[read_index];
				write_index--;
			}
			
			read_index--;
		}
		
		while(write_index >= 0){
			A[write_index] = 0;
			write_index--;
		}
	}

}
