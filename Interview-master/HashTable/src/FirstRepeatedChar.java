
public class FirstRepeatedChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static char firstRepeated(char[] str){
		//Unicode string
		int[] count = new int[128];
		int i= 0;
		for(i = 0; i < str.length;i++){
			if(count[str[i]] == 1){
				System.out.println(str[i]);
				return str[i];
			} else {
				count[str[i]]++;
			}
		}
		
		if(i == str.length){
		   System.out.println("No repeated characters");
		}
		return 0;
	}

}
