import java.util.*;
public class findAllSubsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int getBit(int num, int bit){
		int temp = (1 << bit);
		temp = temp & num;
		if(temp == 0){
			return 0;
		}
		
		return 1;
	}
	
	public static void getAllSubsets(List<Integer> v, List<HashSet<Integer>> sets){
		int subsets_count = (int)(Math.pow((double)2,(double)v.size()));
		for(int i = 0; i < subsets_count; i++){
			HashSet<Integer> set = new HashSet<Integer>();
			for(int j = 0; j < v.size(); j++){
				if(getBit(i,j) == 1){
					int x = v.get(j);
					set.add(x);
				}
			}
			sets.add(set);
		}	
	}

}
