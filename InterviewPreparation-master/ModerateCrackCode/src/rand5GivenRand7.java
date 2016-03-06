import java.util.*;




public class rand5GivenRand7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int randInt(int min, int max) {

	    // NOTE: Usually this should be a field rather than a method
	    // variable so that it is not re-seeded every call.
	    Random rand = new Random();

	    // nextInt is normally exclusive of the top value,
	    // so add 1 to make it inclusive
	    int randomNum = rand.nextInt((max - min) + 1) + min;

	    return randomNum;
	}
	
	public static int rand5() {
		return randInt(1,5);
	}
	
	//Wrong way:
	
	public static int rand7(){
		int v = rand5() + rand5();
		return v % 7;
	}
	
	//Correct way(non-deterministic)
	public static int SecondRand7(){
		while(true){
			int num = 5 * rand5() * rand5();
			if(num < 21){
				return num % 7;
			}
		}
	}
	
	public static int ThirdRand7(){
		while(true){
			int r1 = 2 * rand5();
			int r2 = rand5();
			if(r2 != 4){
				int rand1 = r2 % 2;
				int num = r1 + rand1;
				if(num < 7){
					return num;
				}
			}
		}
	}
	
	
	

}
