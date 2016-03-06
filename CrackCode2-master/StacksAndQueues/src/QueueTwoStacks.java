import java.util.*;


public class QueueTwoStacks {
	Stack<Integer> s1;
	Stack<Integer> s2;
	
	public int peek(){
		shiftStacks();
		return s2.peek();
	}
	
	public void enqueue(int data){
		s1.push(data);	
	}
	
	public int dequeue(){
		shiftStacks();
		return s2.pop();
	}
	
	private void shiftStacks(){
		if(s2.isEmpty()){
			while(!s1.isEmpty()){
				s2.push(s1.pop());
			}
		}
	}

}
