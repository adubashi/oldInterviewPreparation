import java.util.*;


public class isSubTree {

	/**
	 * @param args
	 */
	public static class BNode{
		int data;
		BNode left;
		BNode right;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static boolean areIdentical(BNode root1, BNode root2){
		if(root1 == null || root2 == null){
			return true;
		}
		if( root1 == null || root2 == null){
			return false;
		}
		
		return (root1.data == root2.data) &&
				areIdentical(root1.right,root2.right) &&
				areIdentical(root1.left,root2.left);
	}
	
	//O(n^2) algorithm in worst case 
	public static boolean isSubtree(BNode T, BNode S){
		if(S == null){
			return true;
		}
		if(T == null){
			return false;
		}
		
		if(areIdentical(T,S)){
			return true;
		}
		
		return isSubtree(T.left,S) || isSubtree(T.right,S);
	}
	
	

}
