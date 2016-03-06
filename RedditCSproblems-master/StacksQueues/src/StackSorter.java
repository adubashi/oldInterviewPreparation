
import java.util.*;


public class StackSorter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		java.util.Stack<Integer> s = new java.util.Stack<Integer>();
		
		
		

	}
	
	
	//O(n^2) time
	public static java.util.Stack<Integer>  sort(java.util.Stack<Integer> s){
		java.util.Stack<Integer> r = new java.util.Stack<Integer>();
		
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
