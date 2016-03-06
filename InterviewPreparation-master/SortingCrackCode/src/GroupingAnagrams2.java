import java.util.*;
public class GroupingAnagrams2 {
	public String sortChars(String s){
		char[] content = s.toCharArray();
		Arrays.sort(content);
		return new String(content);
	}
	public void sort(String[] array){
		Hashtable<String, LinkedList<String>> hash = new Hashtable<String, LinkedList<String>>();
		for(String s: array){
			String key = sortChars(s);
			if(!hash.containsKey(key)){
				hash.put(key, new LinkedList<String>());
			}
			LinkedList<String> anagrams = hash.get(key);
			anagrams.push(s);
		}
		int index = 0;
		for(String key : hash.keySet()){
			LinkedList<String> list = hash.get(key);
			for(String t : list){
				array[index] = t;
				index++;
			}
		}
	}

}
