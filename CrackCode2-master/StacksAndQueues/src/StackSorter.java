import java.util.*;

public class StackSorter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	/// O(n^2) Time
	/// O(n) space
	public static Stack<Integer> sort(Stack<Integer> s){
		Stack<Integer> r = new Stack<Integer>();
		while(!s.isEmpty()){
			int tmp = s.pop();
			while(!r.isEmpty() && r.peek() > tmp){
				s.push(r.pop());
			}
			r.push(tmp);
		}
		
		return r;
	}

}
