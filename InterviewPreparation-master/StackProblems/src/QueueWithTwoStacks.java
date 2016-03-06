import java.util.*;
public class QueueWithTwoStacks {
	Stack<Integer> s1;
	Stack<Integer> s2;
	
	public QueueWithTwoStacks(){
		s1 = new Stack<Integer>();
		s2 = new Stack<Integer>();
	}
	
	public boolean isEmpty(){
		if(s2.isEmpty()){
			while(!s1.isEmpty()){
				s2.push(s1.pop());
			}
		}
		
		return s2.isEmpty();
	
	}
	
	public void enQueue(int data){
		s1.push(data);
	}
	
	public int deQueue(){
		if(!s2.isEmpty()){
			return s2.pop();
		} else {
			while(!s1.isEmpty()){
				s2.push(s1.pop());
			}
			return s2.pop();
		}
	}

}
