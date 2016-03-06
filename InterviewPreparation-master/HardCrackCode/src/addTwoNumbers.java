
public class addTwoNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int add(int a, int b){
		if(b == 0){
			return a;
		}
		int sum = a ^ b;
		int carry = (a & b) << 1;
		return add(sum, carry);
	}

}
