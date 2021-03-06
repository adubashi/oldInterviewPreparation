
public class PartitionALinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	LinkedListNode partition(LinkedListNode node, int x){
		LinkedListNode head = node;
		LinkedListNode tail = node;
		
		while(node != null){
			LinkedListNode next = node.next;
			if(node.data < x){
				node.next = head;
				head = node;
			} else {
				tail.next = node;
				tail = node;			
			}
			
			node = node.next;
		}
		
		tail.next =null;
		return head;
	}

}
