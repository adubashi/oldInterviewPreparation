import java.util.*;
public class MinStack  extends Stack<Integer>{
	private Stack<Integer> elementStack = new Stack<Integer>();
	private Stack<Integer> minStack = new Stack<Integer>();
	
	public void Push(int data){
		elementStack.push(data);
		if(minStack.isEmpty() || (Integer)minStack.peek() >=(Integer)data){
			minStack.push(data);
		}
	}
	
	public Integer pop(){
		int poppedData = elementStack.peek();
		
		if(poppedData == minStack.peek()){
			minStack.pop();
		}
		return elementStack.pop();
		
	}
	
	public int getMinimum(){
		return minStack.peek();
	}
	
	public int Top(){
		return elementStack.peek();
	}
	
	public boolean isEmpty(){
		return elementStack.isEmpty();
	}
}
