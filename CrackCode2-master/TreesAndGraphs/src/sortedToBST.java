import java.util.*;



public class sortedToBST {
	public static class TreeNode {
		int data;
		TreeNode left;
		TreeNode right;
	}
	
	public static TreeNode arrayToBST(int[] sortedArray, int start, int end){
		if(end - start < 0){
			return null;
		} else {
			int mid = (start + end)/2;
			TreeNode n = new TreeNode();
			n.data = sortedArray[mid];
			n.left = arrayToBST(sortedArray, start, mid -1);
			n.right = arrayToBST(sortedArray,mid +1, end);
			return n;
			
		}
		
	}
	
	public static TreeNode arrayToBST(int[] sortedArray){
		return arrayToBST(sortedArray,0,sortedArray.length - 1);
	}

}
