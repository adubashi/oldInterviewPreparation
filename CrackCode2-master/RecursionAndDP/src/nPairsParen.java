import java.util.*;


public class nPairsParen {
	
	public static String insertInside(String str, int leftIndex){
		String left = str.substring(0, leftIndex+1);
		String right = str.substring(leftIndex + 1, str.length());
		return left + "()" + right;
	}
	
	//Inefficient 
	public static Set<String> generateParens(int remaining){
		Set<String> set =  new HashSet<String>();
		
		if(remaining == 0){
			set.add("");
		} else {
			Set<String> prev = generateParens(remaining - 1);
			for(String str : prev){
				for(int i = 0; i < str.length(); i++){
					if(str.charAt(i) == '('){
						String s = insertInside(str, i);
						set.add(s);
					}
				}
				set.add("()" + str);
			}
		}
		
		return set;
	}
	
	

}
