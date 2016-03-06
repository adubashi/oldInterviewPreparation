
public class permuteString {
	
	public static void main(String[] Args){
		
		char[] test = {'a','b','c','d'};
		String test1 = "abcd";
		permuteFinal(test);
		
		
	}
	
	// print N! permutation of the characters of the string s (in order)
    public  static void perm1(String s) { 
    	perm1("", s);
    }
    
    
    private static void perm1(String prefix, String s) {
        int N = s.length();
        if (N == 0) System.out.println(prefix);
        else {
            for (int i = 0; i < N; i++)
               perm1(prefix + s.charAt(i), s.substring(0, i) + s.substring(i+1, N));
        }

    }
    
    ///2nd method
    public static void swapChar(char[] input, int i, int j){
    	char temp = input[i];
    	input[i] = input[j];
    	input[j] = temp;
    }
    
    public static void permuteStringAll(char[] input, int currentIndex, int endingIndex)
    {
    	if(currentIndex == endingIndex){
    		System.out.print(input);
    		System.out.println();
    	}
    	for(int i = currentIndex; i <= endingIndex; i++){
    		swapChar(input,currentIndex,i);
    		permuteStringAll(input, currentIndex + 1,endingIndex);
    		swapChar(input,currentIndex,i);
    	}
    }
    
    public static void permuteFinal(char[] input){
    	int currentIndex = 0;
    	int endingIndex = input.length - 1;
    	permuteStringAll(input,currentIndex, endingIndex);
    }

}
