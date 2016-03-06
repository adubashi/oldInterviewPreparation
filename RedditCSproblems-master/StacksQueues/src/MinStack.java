import java.util.*;



public class MinStack extends java.util.Stack<Integer> {
	
	java.util.Stack<Integer> s2;
	public int size;
	
	public MinStack(){
		s2 = new java.util.Stack<Integer>();
		size = 0;
	}
	
	public Integer min(){
		if(s2.isEmpty()){
			return s2.peek();
		} else {
			return Integer.MIN_VALUE;
		}
	}
	
	public void push(int value){
		if(value <= min()){
			s2.push(value);
		}
		size++;
		super.push(value);
	}
	
	public Integer pop(){
		Integer popped = super.peek();
		
		if(popped <= min()){
			s2.pop();
			super.pop();
			size--;
			return popped;
		} else {
			super.pop();
			size--;
			return popped;
			
		}
	}
	
	public boolean isEmpty(){
		return size == 0;
	}
	
	
	
	
	

}
