
public class firstNonRepeatedCharacter {

	public static void main(String[] args) {
		String test = "aabbcdd";
		System.out.println(firstNonRepeated(test));

	}
	
	public static char firstNonRepeated(String s){
		int[] characterTable = new int[128];
		
		for(int i = 0; i < s.length(); i++){
			characterTable[s.charAt(i)]++;
		}
		
		for(int j = 0; j < characterTable.length; j++){
			if(characterTable[j] == 1){
				System.out.println((char)j);
				return (char)j;
			}
			
		}
		
		return 'a';
	}

}
