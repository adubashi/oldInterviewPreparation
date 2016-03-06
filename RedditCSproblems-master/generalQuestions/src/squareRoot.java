
public class squareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	private static final double EPSILON = 0.00001;
	public static double square_root_iterative(double num){
		double low = 0;
		
		double high = 1 + num/2;
		
		while(low < high){
			double mid = (low + high)/2;
			
			double sqr = mid * mid;
			double diff = Math.abs(num - sqr);
			
			if( diff <= EPSILON){
				return mid;
			}
			if(sqr < num){
				low = mid;
			} else {
				high = mid;
			}
		}
		
		return -1;
		
	}

}
