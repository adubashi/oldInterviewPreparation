import java.util.*;

public class reverseEvenNodes {
	
	public static class LinkedListNode {
		int data;
		LinkedListNode next;
	}
	
	public static void print(LinkedListNode head){
		while(head != null){
			System.out.print(head.data);
			head = head.next;
		}
		System.out.print("null");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static LinkedListNode mergeAlternating(LinkedListNode list1, LinkedListNode list2){
		if(list1 == null){
			return list2;
		}
		if(list2 == null){
			return list1;
		}
		
		LinkedListNode head = list1;
		while(list1.next != null && list2 != null){
			//IMPORTANT PART
			LinkedListNode temp = list2;
			list2 = list2.next;
			
			temp.next = list1.next;
			list1.next = temp;
			list1 = temp.next;
		}
		
		if(list1.next == null){
			list1.next = list2;
		}
		return head;
	}
	
	public static LinkedListNode reverseEvenNodes(LinkedListNode head){
		LinkedListNode curr = head;
		LinkedListNode listEven = null;
		
		while(curr != null && curr.next != null){
			LinkedListNode even = curr.next;
			curr.next = even.next;
			
			even.next = listEven;
			listEven = even;
			curr = curr.next;
			
		}
		
		return mergeAlternating(head,listEven);
	}

}
