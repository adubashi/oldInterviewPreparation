import java.util.*;


public class AllPossibleParentheses {

	public static void main(String[] args) {
		printAll(5);

	}
	
	public static void printList(List<Character> v){
		for (Character  i : v){
			System.out.print(i);
		}
		System.out.println("");
	}
	
	public static void printAllBracketsRec(int n, int left, int right, List<Character> output)
	{
		if(left >= n && right >= n){
			printList(output);
		}
		if(left < n){
			output.add('(');
			printAllBracketsRec(n, left + 1, right, output);
			output.remove(output.size() - 1);
		}
		if(right < left){
			output.add(')');
			printAllBracketsRec(n, left, right + 1, output);
			output.remove(output.size() - 1);
		}
		
	}
	
	public static void printAll(int n){
		List<Character> output = new ArrayList<Character>();
		printAllBracketsRec(n,0,0,output);
		
	}
}
