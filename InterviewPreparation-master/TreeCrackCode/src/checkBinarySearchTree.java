
public class checkBinarySearchTree {
	
	boolean checkBST(TreeNode n, int min, int max){
		if(n == null){
			return true;
		}
		if((n != null) && (n.data <= min || n.data > max)){
			return false;
		}
		
		if(!checkBST(n.left,min,n.data) || !checkBST(n.right, n.data,max)){
			return false;
		}
		
		return true;
	}
	
	boolean checkBST(TreeNode n){
		return checkBST(n, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

}
