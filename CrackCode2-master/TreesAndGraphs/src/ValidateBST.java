import java.util.*;


public class ValidateBST {
	public static class TreeNode {
		int data;
		TreeNode left;
		TreeNode right;
	}
	
	public static boolean validateBST(TreeNode root, int maxVal, int minVal){
		if(root == null){
			return true;
		} 
		if(root.data  < minVal || root.data >maxVal){
			return false;
		} else {
			return validateBST(root.left, root.data, minVal) && validateBST(root.right, maxVal, root.data);
		}
	}
}
