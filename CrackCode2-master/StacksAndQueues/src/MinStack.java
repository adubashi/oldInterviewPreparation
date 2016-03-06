import java.util.*;
public class MinStack extends Stack<Integer>{
		
		
		Stack<Integer> s2;
		public MinStack(){
			s2 = new Stack<Integer>();
		}
		
		public void push(int elem){
			if(elem <= this.min() ){
				s2.push(elem);
			}
			super.push(elem);
		}
		
		public Integer pop(){
			int value = super.pop();
			
			if(value <= min()){
				s2.pop();
			}
			return value;
		}
		
		public Integer min(){
			if( !s2.isEmpty()){
				return s2.peek();
			} else {
				return Integer.MAX_VALUE;
			}
		}


}
