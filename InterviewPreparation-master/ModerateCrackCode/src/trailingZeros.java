
public class trailingZeros {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//Count trailing zeros
	public static int factorsOf5(int i){
		int count = 0;
		while( i % 5 == 0){
			count++;
			i /= 5;
		}
		return count;
	}
	
	public static int countFactZeros(int num){
		int count = 0;
		for(int i =2; i <= num; i++){
			count += factorsOf5(i);
			
		}
		return count;
	}
	
	//Better way
	public static int countFactZeros2(int num){
		int count = 0;
		if(num < 0){
			return -1;
		}
		for(int i = 5; num / i > 0; i *= 5){
			count += num / i;
		}
		return count;
	}
	
	
}
