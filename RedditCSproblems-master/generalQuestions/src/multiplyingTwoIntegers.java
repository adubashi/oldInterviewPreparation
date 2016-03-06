
public class multiplyingTwoIntegers {
	
	public static void main(String Args[]){
		System.out.println(multiply(-4,5));
		System.out.println(4 * 5);
	}
	
	public static int multiply(int x, int y){
		if(y == 0){
		     return 0;
		}
		 
		   /* Add x one by one */
	    if(y > 0 ){
		     return (x + multiply(x, y-1));
		}
		  
		  /* the case where y is negative */
		if(y < 0 ) {
		     return -multiply(x, -y);
		}
		
		return 0;
		 
	}

}
