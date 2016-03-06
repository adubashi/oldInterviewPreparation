import java.util.*;
public class QueueUsingStacks {
	
	java.util.Stack<Integer> stackNew;
	java.util.Stack<Integer> stackOld;
	
	public QueueUsingStacks(){
		stackNew = new java.util.Stack<Integer>();
		stackOld = new java.util.Stack<Integer>();
	}
	
	public int size(){
		return stackNew.size() + stackOld.size();
	}
	
	public void add(int value){
		stackNew.add(value);
	}
	private void shiftStacks(){
		if(stackOld.isEmpty()){
			while(!stackNew.isEmpty()){
				stackOld.push(stackNew.pop());
			}
		}
	}
	
	public int peek(){
		shiftStacks();
		return stackOld.peek();
	}
	
	
	public int remove(){
		shiftStacks();
		return stackOld.pop();
	}
	
	

}
