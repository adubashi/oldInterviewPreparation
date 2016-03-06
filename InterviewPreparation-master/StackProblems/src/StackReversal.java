import java.util.*;



public class StackReversal {
	public static void reverseStack(Stack<Integer> stack){
		if(stack.isEmpty()){
			return;
		}
		int temp = stack.pop();
		reverseStack(stack);
		insertAtBottom(stack,temp);
		
	}
	
	public static void insertAtBottom(Stack<Integer> stack, int data){
		if(stack.isEmpty()){
			stack.push(data);
			return;
		} 
		int temp = stack.pop();
		insertAtBottom(stack, data);
		stack.push(temp);
	}

}
