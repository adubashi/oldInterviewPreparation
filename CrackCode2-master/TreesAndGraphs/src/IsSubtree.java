import java.util.*;


public class IsSubtree {
	public static class TreeNode {
		int data;
		TreeNode left;
		TreeNode right;
	}
	
	public static boolean matchTree(TreeNode b1, TreeNode b2){
		if(b1 == null && b2 == null){
			return true;
		}
		if(b1 == null || b2 == null){
			return false;
		}
		
		return b1.data == b2.data && matchTree(b1.left,b2.left) && matchTree(b1.right,b2.right);
	}
	
	public static boolean subTree(TreeNode b1, TreeNode b2){
		if(b1 == null){
			return false;
		}
		if(b1.data == b2.data){
			return matchTree(b1,b2);
		}
		return (subTree(b1.left,b2) || subTree(b1.right,b2));
	}
	
	public static boolean containsTree(TreeNode b1, TreeNode b2){
		if(b2 == null){
			return true;
		}
		return subTree(b1,b2);
	}

}
