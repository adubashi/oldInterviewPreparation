
public class allUniques {

	public static void main(String[] args) {
		String test = "abcd";
		String test1 = "aabbccdd";
		
		System.out.println(allUnique(test));
		System.out.println(allUnique(test1));

	}
	
	public static boolean allUnique(String test){
		int[] characterTable = new int[128];
		
		for(int i = 0; i < test.length(); i++){
			characterTable[test.charAt(i)]++;
			
			if(characterTable[test.charAt(i)] > 1){
				return false;
			}
		}
		
		return true;
	}

}
