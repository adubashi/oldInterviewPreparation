
public class swapANumber {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 9;
		
		swap_opt(a,b);

	}
	
	public static void swapInt(int a, int b){
		
		System.out.println("a = " + a);
		System.out.println("b = " +  b);
		
		
		a = a - b;
		b = a + b;
		a = b - a;
		
		System.out.println("a = " + a);
		System.out.println("b = " +  b);
		
		
	}
	
	public static void swap_opt(int a, int b){

		System.out.println("a = " + a);
		System.out.println("b = " +  b);
		a = a^b;
		b = a^b;
		a = b^a;

		System.out.println("a = " + a);
		System.out.println("b = " +  b);
	}

}
