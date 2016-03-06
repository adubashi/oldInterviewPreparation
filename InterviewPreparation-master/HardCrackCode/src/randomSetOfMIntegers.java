
public class randomSetOfMIntegers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int rand(int lower, int higher){
		return lower + (int)(Math.random() * (higher - lower + 1));
	}
	
	public static int[] pickMIteratively(int[] original, int m){
		int[] subset = new int[m];
		
		for(int i = 0; i < m; i++){
			subset[i] = original[i];
		}
		
		for(int i = m; i < original.length; i++){
			int k = rand(0,i);
			if(k < m){
				subset[k] = original[i];
			}
		}
		
		return subset;
	}

}
