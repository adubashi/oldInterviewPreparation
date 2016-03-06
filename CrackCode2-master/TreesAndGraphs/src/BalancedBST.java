import java.util.*;

public class BalancedBST {
	
	public class TreeNode {
		int data;
		TreeNode left;
		TreeNode right;
	}
	
	public static void main(String args[]){
		System.out.println("ARJUN");
	}
	
	public static int getHeight(TreeNode root){
		
		if(root == null){
			return 0;
		} else {
			return Math.max(getHeight(root.left), getHeight(root.right) ) + 1;
		}

	}
	
	public static boolean isBalanced(TreeNode root){
		
		if(root == null){
			return true;
		}
		int heightDiff = getHeight(root.left) - getHeight(root.right);
		if(heightDiff > 1){
			return false;
		} else {
			return isBalanced(root.left) && isBalanced(root.right);
		}
		
	}

}
