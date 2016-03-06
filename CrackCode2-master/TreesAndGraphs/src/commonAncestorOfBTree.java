import java.util.*;


public class commonAncestorOfBTree {
	public static class TreeNode {
		int data;
		TreeNode left;
		TreeNode right;
	}
	
	//Checks if root is a ancestor of P
	public static boolean covers(TreeNode root, TreeNode p){
		if(root == null) return false;
		if(root == p) return true;
		
		return covers(root.left,p) || covers(root.right,p);
	}
	
	TreeNode commonAncestorHelper(TreeNode root, TreeNode p, TreeNode q){
		if( root == null) return null;
		if(root == p || root == q) return root;
		
		boolean isPonLeft = covers(root.left, p);
		boolean isQonLeft = covers(root.left, q);
		
		if(isPonLeft != isQonLeft){
			return root;
		}
		
		TreeNode childSide = null;
		if(isPonLeft){
			childSide = root.left;
		} else {
			childSide = root.right;
		}
		
		return commonAncestorHelper(childSide, p ,q);
	}
	
	TreeNode commonAncestor(TreeNode root, TreeNode p, TreeNode q){
		if(!covers(root,p) || !covers(root,q) ){
			return null;
		}
		return commonAncestorHelper(root,p,q);
	}
	
	

}
