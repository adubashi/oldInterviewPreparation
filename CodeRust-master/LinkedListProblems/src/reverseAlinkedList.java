
public class reverseAlinkedList {
	
	public class LinkedListNode {
		int data;
		LinkedListNode next;
	}
	
	
	public static LinkedListNode reverseLinkedList(LinkedListNode head){
		
		if(head == null || head.next == null){
			return head;
		}
		
		LinkedListNode listToDo = head.next;
		LinkedListNode reversedList = head;
		
		
		reversedList.next = null;
		while(listToDo != null){
			LinkedListNode temp = listToDo;
			listToDo = listToDo.next;
			temp.next = reversedList;
			reversedList = temp;
		}
	    reversedList.next = null;
		return reversedList;
		
	}
	
	public static LinkedListNode reverseList(LinkedListNode head){
		if(head == null || head.next == null){
			return head;
		}
		
		LinkedListNode reversedList = reverseList(head.next);
		
		head.next.next =head;
		head.next = null;
		return reversedList;
	}

}
