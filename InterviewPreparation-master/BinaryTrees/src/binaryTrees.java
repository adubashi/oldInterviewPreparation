import java.util.*;
import java.lang.*;
public class binaryTrees {
	public class bNode {
		int data;
		bNode left;
		bNode right;
	}
	
	public static void preOrder(bNode root){
		if(root != null){
			System.out.println(root.data);
			preOrder(root.left);
			preOrder(root.right);
		}	
	}
	
	public static void postOrder(bNode root){
		if(root != null){
			System.out.println(root.data);
			postOrder(root.left);
			postOrder(root.right);
		}	
	}
	
	public static void InOrder(bNode root){
		if(root != null){
			//System.out.println(root.data);
			postOrder(root.left);
			System.out.println(root.data);
			postOrder(root.right);
		}	
	}
	
	public static void InOrderNonRecursive(bNode root){
		if(root == null){
			return;
		} 
		Stack<bNode> s = new Stack<bNode>();
		while(true){
			while(root != null){
				s.push(root);
				root = root.left;			
			}
			if(s.isEmpty()){
				break;
			}
			root = s.pop();
			System.out.println(root.data);
			root = root.right;
		}
		return;
	}
	
	public static int findMax(bNode root){
		int rootVal, left, right, max = Integer.MIN_VALUE;
		
		if(root == null){
			rootVal = root.data;
			left = findMax(root.left);
			right = findMax(root.right);
			if(left > right){
				max = left;
			} else {
				max = right;
			}
			if( rootVal > max){
				max = rootVal;
			}
			
		}
		
		return max;
	}
	
	//Search for an element in a binary tree
	
	public static boolean findInBinaryTreeRecur(bNode root, int number){
		boolean temp = false;
		if(root == null){
			return false;
		} else {
			if(number == root.data){
				return true;
			} else {
				temp = findInBinaryTreeRecur(root.left, number);
				if(temp != true){
					return temp;
				} else {
					return findInBinaryTreeRecur(root.right, number);
				}
				
			}
		}
	}
	
	//Size of binary Tree
	public static int SizeOfBinaryTree(bNode root){
		if(root == null) {
			return 0;
		} else {
			return SizeOfBinaryTree(root.left) + 1 + SizeOfBinaryTree(root.right);
		}
		
	}
	
	public static void LevelOrder(bNode root){
		bNode temp;
		Queue<bNode> q1 = new LinkedList<bNode>();
		if(root == null){
			return;
		}
		q1.add(root);
		while(!q1.isEmpty()){
			temp = q1.remove();
			System.out.println(temp.data);
			if(temp.right != null){
				q1.add(temp.right);
			} 
			if(temp.left != null){
				q1.add(temp.left);
			}
		}
		
	}
	//Height of binary tree
	
	public static int HeightOfBinaryTree(bNode root){
		int leftheight = 0;
		int rightheight = 0;
		if(root == null){
			return 0;
		} else {
			leftheight = HeightOfBinaryTree(root.left);
			rightheight = HeightOfBinaryTree(root.right);
			if(leftheight > rightheight){
				return leftheight + 1;
			} else {
				return rightheight + 1;
			}
		}
	}
	
	//Structurally identical trees
	public static boolean areIdentical(bNode root1, bNode root2){
		if(root1 == null && root2 == null){
			return true;
		}
		if(root1 == null || root2 == null){
			return false;
		} 
		
		return (root1.data == root2.data) && 
				areIdentical(root1.left, root2.left) &&
				areIdentical(root1.right, root2.right);
	}
	
	//Are Mirrors
	public static boolean areMirrors(bNode root1, bNode root2){
		if(root1 == null && root2 == null){
			return true;
		}
		if(root1 == null || root2 == null){
			return false;
		}
		if(root1.data != root2.data){
			return false;
		} else {
			return areMirrors(root1.left,root2.right) && areMirrors(root1.right, root2.left); 
		}
	}
	
	//Add up all nodes
	public static int add(bNode root){
		if(root == null){
			return 0;
		} else {
			return root.data + add(root.left) + add(root.right);
		}
	}

}
