
public class binaryTreeIsBalanced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int getHeight(TreeNode root){
		if(root == null){
			return 0;
		} else {
			return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
		}
	}
	
	public static boolean isBalanced(TreeNode root){
		if(root == null){
			return true;
		}
		
		int heightDiff = getHeight(root.left) - getHeight(root.right);
		if(Math.abs(heightDiff) > 1){
			return false;
		}else {
			return isBalanced(root.left) && isBalanced(root.right);
		}
	}
	
	public static int checkHeight(TreeNode root){
		if(root == null){
			return 0;
		}
		
		int leftHeight = checkHeight(root.left);
		if(leftHeight == -1){
			return -1;
		}
		
		int rightHeight = checkHeight(root.right);
		if(rightHeight == -1){
			return -1;
		}
		
		int heightDiff = leftHeight - rightHeight;
		if(Math.abs(heightDiff) > 1){
			return -1;
		} else{
			return Math.max(leftHeight, rightHeight) + 1;
		}
	}
	
	public static boolean isBalancedTwo(TreeNode root){
		if(checkHeight(root) == -1){
			return false;
		} else{
			return true;
		}
	}

}
