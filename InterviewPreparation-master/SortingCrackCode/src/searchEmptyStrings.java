
public class searchEmptyStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int searchR(String[] strings, String str, int first, int last){
		
		if(first > last){
			return -1;
		}
		int mid = (first + last)/2;
		
		//If mid is empty
		if(strings[mid].isEmpty()){
			int left = mid - 1;
			int right = mid - 1;
			while(true){
				if(left < first && right > last){
					return -1;
				} else if(right <= last && !strings[right].isEmpty()){
					mid = right;
					break;
				} else if(left >= first && !strings[left].isEmpty()){
					mid = left;
					break;
				}
				right++;
				left--;
			}
		}
		/////
		
		if(str.equals(strings[mid])){
			return mid;
		} else if(strings[mid].compareTo(str) < 0){
			return searchR(strings, str, mid + 1, last);
		} else {
			return searchR(strings, str, first, mid - 1);
		}
		
		
	}
	
	public int search(String[] strings, String str){
		if(strings == null || str == null || str == ""){
			return -1;
		}
		return searchR(strings, str, 0 ,strings.length - 1);
	}

}
