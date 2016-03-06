
public class printBinaryInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printBinary(43);
		System.out.println();
		printBinaryRec(43);

	}
	
	public static void printBinary(int number){
		StringBuilder test =  new StringBuilder();
		for(int i = number; i > 0; i = i/2){
			test.append(i % 2);
		}
		 System.out.println("reverse = " + test.reverse());
	}
	
	public static void printBinaryRec(int number){
		if( number == 0){
			System.out.print(0);
		} else if(number == 1){
			System.out.print(1);
		} else {
			printBinaryRec(number /2);
			System.out.print(number % 2);
		}
	}

}
