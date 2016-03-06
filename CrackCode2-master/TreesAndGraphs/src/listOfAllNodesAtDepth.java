import java.util.*;


public class listOfAllNodesAtDepth {
	public static class TreeNode {
		int data;
		TreeNode left;
		TreeNode right;
	}
	
	public static void createLevelLinkedList(TreeNode root, ArrayList<LinkedList<TreeNode>> lists, int level){
		if(root == null){
			//BASE CASE
			return;
		}
		LinkedList<TreeNode> list = null;
		if(lists.size() == level){
			list = new LinkedList<TreeNode>();
			
			lists.add(list);
		} else {
			list = lists.get(level);
		}
		list.add(root);
		createLevelLinkedList(root.left, lists, level+1);
		createLevelLinkedList(root.right, lists, level + 1);
	}
	
	public static ArrayList<LinkedList<TreeNode>> createLevelLinkedList(TreeNode root){
		ArrayList<LinkedList<TreeNode>> lists = new ArrayList<LinkedList<TreeNode>>();
	
		createLevelLinkedList(root, lists,0);
		return lists;
	}

}
