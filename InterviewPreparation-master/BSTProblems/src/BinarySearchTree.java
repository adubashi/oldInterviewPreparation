import java.util.*;
import java.lang.*;


public class BinarySearchTree {
	
	public static class bNode {
		int data;
		bNode left;
		bNode right;
		
		public bNode(){
			
		}
		
		public bNode(int data){
			this.data = data;
		}
	}
	
	public static bNode Insert(bNode root, int data){
		if(root == null){
			bNode temp = new bNode();
			temp.data = data;
			temp.left = null;
			temp.right = null;
			
		}else {
			if(data < root.data){
				root.left = Insert(root.left, data);
			} else if(data > root.data) {
				root.right = Insert(root.right, data);
			}
		}
		
		return root;
	}
	
	public static bNode Delete(bNode root, int data){
		bNode temp;
		if(root == null){
			System.out.println("Element not in tree");
		} else if(data < root.data){
			root.left = Delete(root.left, data);
		} else if(data > root.data){
			root.right = Delete(root.right, data);
		} else {
			//Found element
			if(root.left != null && root.right != null){
				temp = FindMax(root.left);
				root.data = temp.data;
				root.left = Delete(root.left, root.data);
			} else {
				temp = root;
				if(root.left == null){
					root = root.right;
				}
				if(root.right == null){
					root = root.left;
				}
			}
		}
		
		return root;
	}
	
	public static bNode FindMax(bNode root){
		if(root == null){
			return null;
		} else {
			if(root.right == null){
				return root;
			} else{
				return FindMax(root.right);
			}
		}
		
		
	}
	
	public static boolean isBST(bNode root, int max, int min){
		if(root == null){
			return true;
		} else {
			return (root.data> min && root.data < max) && 
			isBST(root.left,min,root.data) &&
			isBST(root.right, root.data, max);
		}
	}

}
