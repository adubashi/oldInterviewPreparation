import java.util.*;

public class inorderSucessor {
	
	public static class TreeNode {
		int data;
		TreeNode left;
		TreeNode right;
		
		public TreeNode(int data){
			this.data = data;
		}
	}
	
	public static void inOrder(TreeNode root){
		if(root != null){
			inOrder(root.left);
			System.out.print(root.data);
			System.out.print(" ");
			inOrder(root.right);
		}
	}
	
	public static TreeNode findMin(TreeNode root){
		if(root == null){
			return null;
		}
		while(root.left != null){
			root = root.left;
		}
		return root;
	}
	
	public static TreeNode inorderSuccessor(TreeNode root, int d){
		
		if(root == null){
			return null;
		}
		
		TreeNode successor = null;
		
		while(root != null){
			if(root.data < d){
				root = root.right;
			} else if(root.data > d){
				successor = root;
				root = root.left;
			} else {
				if(root.right != null){
					successor = findMin(root.right);
				}
			}
		}
		
		return successor;
		
	}

}
