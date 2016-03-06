
public class fibonacci {

	/**
	 * @param args
	 */
	
	
	public static int[] fib = new int[1000];
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int fibonacci(int i){
		if(i == 0){
			return 0;
		} else if(i == 1){
			return 1;
		} else {
			return fibonacci(i - 1) + fibonacci(i - 2);
		}
	}
	
	public static int fib(int i ){
		if(i == 0){
			return 0;
		}
		if(i == 1){
			return 1;
		}
		if(fib[i] != 0){
			return fib[i];
		} 
		fib[i] = fib(i-1) + fib(i -2);
		return fib[i];
	} 
	
	public static void fibonacciDP(int N){
		long[] fib = new long[N+1];

        // base cases
        fib[0] = 0;
        fib[1] = 1;

        // bottom-up dynamic programming
        for (int n = 2; n <= N; n++)
            fib[n] = fib[n-1] + fib[n-2];

        // print results
        System.out.println(fib[N]);
	}

}
