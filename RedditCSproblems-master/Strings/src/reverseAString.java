import java.util.*;
public class reverseAString {
	
	public static void main(String Args[]){
		char[] array = {'a', 'r' ,'e', 't' ,'e'};
		rev(array);
		
		String test = "arete";
		
		System.out.println(Arrays.toString(array));
		System.out.println(reverse(test));
		
	}
	
	public static String reverseRecur(String str) {
	    if ((null == str) || (str.length() <= 1)) {
	        return str;
	    }
	    return reverseRecur(str.substring(1)) + str.charAt(0);
	}
	
	
	
	
	public static void rev(char[] array){
		int j = array.length - 1;
		for(int i = 0; i < array.length/2; i++){
			swap(array,i,j);
			j--;
		}
	}
	
	public static void swap(char[] array, int i, int j){
		char temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	public static String reverse(String s){
		String s1 = "";
		for(int i = s.length() - 1; i >= 0; i--){
			s1 = s1 + s.charAt(i);
		}
		
		return s1;
	}

}
