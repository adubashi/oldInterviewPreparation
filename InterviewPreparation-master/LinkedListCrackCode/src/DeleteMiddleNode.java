
public class DeleteMiddleNode {

	public static void main(String[] args) {
		LinkedListNode head = new LinkedListNode(1);

	}
	
	public static boolean deleteNode(LinkedListNode node){
		if(node == null|| node.next == null){
			return false;
		}
		node.data = node.next.data;
		node.next = node.next.next;
		return true;
		
	}

}
