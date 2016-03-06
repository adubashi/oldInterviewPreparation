import java.util.*;
public class StackSorter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s1 = new Stack<Integer>();
		s1.push(4);
		s1.push(7);
		s1.push(2);
		
		//printStack(s1);
		
		System.out.println("test");
		Stack<Integer> s2 = sort(s1);
		printStack(s2);

	}
	
	public static Stack<Integer> sort(Stack<Integer> stack){
		Stack<Integer> stack2 = new Stack<Integer>();
		while(!stack.isEmpty()){
			//System.out.println("test");
			int tmp =(Integer)stack.pop();
			while(!stack2.isEmpty() && (Integer)stack2.peek() > tmp){
				stack.push(stack2.pop());
			}
			//System.out.println("test");
			stack2.push(tmp);	
		}
		
		return stack2;
	}
	
	public static void printStack(Stack<Integer> stack){
		while(!stack.isEmpty()){
			System.out.println(stack.pop());
		}
	}

}
