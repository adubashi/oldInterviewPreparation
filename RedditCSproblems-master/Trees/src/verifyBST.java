
public class verifyBST {

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
	
	public static boolean isBSTrec(BSTNode root, int minVal, int maxVal){
		if(root == null){
			return true;
		}
		
		if(root.data > maxVal || root.data  < minVal){
			return false;
		}
		
		return isBSTrec(root.left, minVal,root.data) &&
			   isBSTrec(root.right,root.data,maxVal);
	}

}
