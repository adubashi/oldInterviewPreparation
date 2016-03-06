import java.util.*;
public class ArraysAndStrings {

	public static void main(String[] args) {
		//Testing problem 1
		System.out.println(allUnique("est"));
		System.out.println(allUnique("aaaaa"));

		//Testing problem 2:
		
		
		///Testing Problem 3:
		//Check Anagram
		System.out.println("Check Anagram:");
		String s1 = "nom";
		String s2 = "moa";
		
		System.out.println(checkAnagram(s1,s2));
		
		
	}
	
	//Problem 1
	//All Unique characters
	
	public static boolean allUnique(String s){
		int[] test = new int[128];
		for(int i = 0; i < s.length(); i++){
			if(test[s.charAt(i)] > 0){
				return false;
			} else {
				test[s.charAt(i)]++;
			}
		}
		return true;
	}
	
	//Problem 2
	//Reverse a string in place 
	
	public static void reverseAString(char[] string){
		
		for(int i = 0, j = string.length - 1; i < string.length / 2; i++, j--){
			char temp = string[i];
			string[i] = string[j];
			string[j] = temp;
		}
	}
	
	//Problem 3
	// Check if anagram
	
	public static boolean checkAnagram(String s1, String s2){
		int[] string1 = new int[128];
		int[] string2 = new int[128];
		
		for(int i = 0; i < s1.length(); i++){
			string1[s1.charAt(i)]++;
		}
		for(int i = 0; i < s2.length(); i++){
			string2[s2.charAt(i)]++;
		}
		
		for(int i = 0; i < s2.length(); i++){
			int c = (int)s2.charAt(i);
			string1[c]--;
			if(string1[c]< 0){
				return false;
			}
		}
		
		return true;
		
 	}
	
	//Problem 4 
	//Replace all spaces in a string with fuk
	
	public void replaceSpaces(char[] str, int length){
		int spaceCount = 0;
		int newLength = 0;
		int i =0;
		for(i = 0; i < length; i++){
			if(str[i] == ' '){
				spaceCount++;
			}
		}
		newLength = length + (spaceCount*2);
		
		for(i = length - 1; i >0; i--){
			if(str[i] == ' '){
				str[newLength - 1] = 'k';
				str[newLength - 2] = 'u';
				str[newLength - 3] = 'f';
				newLength = newLength - 3;	
			} else {
				 str[newLength - 1] = str[i];
				 newLength = newLength - 1;
			}
		}
	}
	
	//Problem 6
	//Given an image represented by an NbyN matrix, where each pixel in the image is 4 bytes 
	// write a method to rotate the image by 90 degrees. Can you do this in place 
	/*
	 * for i = 0 to n:
	 * 		temp = top[i]
	 * 		top[i] =left[i]
	 * 		left[i] = bottom[i]
	 * 		bottom[i] = right[i];
	 * 		right[i] = temp;
	 */
	
	public void rotate(int[][] matrix, int n){
		for(int layer = 0; layer < n/2; ++layer){
			int first = layer;
			int last = n - 1 - layer;
			for(int i = first; i < last; ++i){
				int offset = i - first;
				//save top
				int top = matrix[first][i];
				
				//left -> top
				matrix[first][i] = matrix[last-offset][first];
				
				//top --> right
				matrix[last-offset][first] = matrix[last][last-offset];
				
				//right --> bottom 
				matrix[last][last-offset] = matrix[i][last];
				
				//top --> right
				matrix[i][last] = top;
			}
			
		}
	}	
	//Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column
	//are set to 0
	public static void setZeros(int[][] matrix){
			boolean[] row = new boolean[matrix.length];
			boolean[] column = new boolean[matrix[0].length];
			
			for(int i = 0; i < row.length; i++){
				for(int j = 0; i < column.length; j++){
					if(matrix[i][j] == 0){
						row[i] = true;
						column[j] = true;
					}
				}
			}
			
			//Set rows to zero
			for(int i= 0; i < row.length; i++){
				if(row[i]){
					for(int k = 0; k < matrix[0].length; k++){
						matrix[i][k] = 0;
					}
				}
			}
			
			//Set columns to zero
			for(int i= 0; i < column.length; i++){
				if(column[i]){
					for(int k = 0; k < matrix.length; k++){
						matrix[k][i] = 0;
					}
				}
			}
	}
}
	

