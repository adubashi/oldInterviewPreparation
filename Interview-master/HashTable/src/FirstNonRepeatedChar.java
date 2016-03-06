
public class FirstNonRepeatedChar {

	public static void main(String[] args) {
		String test = "abzddab";
		
		char[] newArr = test.toCharArray();
		
		System.out.println(firstNonRepeat(newArr, 7));

	}
	
	public static char firstNonRepeat(char[] str, int len){
		int i = 0;
		int[] count = new int[256];
		
		for(i = 0; i < len; i++){
			count[str[i]]++;
		}
		for(i = 0; i < len; i++){
			if(count[str[i]] == 1){
				//System.out.print(str[i]);
				return str[i];
			}
		}
		return 0;
	}

}
