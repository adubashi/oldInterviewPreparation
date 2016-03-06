import java.util.*;


public class findSmallestElementInBST {

	/**
	 * @param args
	 */
	public static class BSTNode{
		int data;
		BSTNode left;
		BSTNode right;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static BSTNode findSmallest(BSTNode root){
		while(root.left != null){
			root = root.left;
		}
		return root;
	}
	
	public static int findLargest(BSTNode root){
		while(root.right != null){
			root = root.right;
		}
		return root.data;
	}
	
	 public static int findSecondLargest(BSTNode root, int largest) {
		   int current = 0;
		   while (root != null) {
		    if (root.data < largest) {
		      current = root.data;
		      root = root.right;
		    } else {
		      root = root.left;
		   }
		   }
		  return current;
	 }

}
