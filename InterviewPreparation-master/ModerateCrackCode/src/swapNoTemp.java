
public class swapNoTemp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//Using integers
	public static void swapInts(int a, int b){
		a = a - b;
		a = a + b;
		a = b - a;
		System.out.println("a: " +  a);
		System.out.println("b: " +  b);
	}
	
	public static void swapOpt(int a, int b){
		a= a^b;
		b = a^b;
		a = a^b;
		System.out.println("a: " +  a);
		System.out.println("b: " +  b);
	}

}
