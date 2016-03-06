
public class FibonacciSequence {

	public static void main(String[] args) {
       int n=10;
       
       
       if(n >= 0){
    	   System.out.print(0); 
       }
       System.out.print(" ");
       if(n >= 1){
    	   System.out.print(1); 
       }
       System.out.print(" ");
       int count=2;
       int c=1,b=1,a=0;
       while(count<=n){
    	   c = b + a;
    	   System.out.print(c);
    	   System.out.print(" ");
    	   a=b;
    	   b=c; 
    	   count++;
       }
        
    }

}
