
public class SearchInRotatedArray {
	
	public static int search(int a[], int left, int right, int x){
		int mid = (left + right) / 2;
		if(x == a[mid]){
			return mid;
		}
		if(right < left){
			return -1;
		}
		
		//Left is normally ordered 
		if(a[left] < a[mid]){
			if(x >= a[left]  && x <= a[mid]){
				return search(a, left, mid - 1, x);
			} else {
				return search(a,mid + 1, right, x);
			}
		//Right is normally ordered
		} else if(a[mid] < a[left]){
			if(x >= a[mid] && x <= a[right]){
				return search(a, mid + 1, right, x);
			} else {
				return search(a, left, mid -1, x);
			}
		}
		
		
		return -1;
		
	}

}
