import java.util.*;


public class LinkedListPalindrome {

	public static void main(String[] args) {
		LinkedListNode head = new LinkedListNode(1);
		LinkedListNode h2 = new LinkedListNode(2);
		LinkedListNode h3 = new LinkedListNode(3);
		LinkedListNode h4 = new LinkedListNode(2);
		LinkedListNode h5 = new LinkedListNode(2);
		
		head.next = h2;
		h2.next = h3;
		
		
		h3.next = h4;
		h4.next = h5;
		h5.next = null;
		
		isPalindrome(head);
		
	}
	
	public static void print(LinkedListNode head){
		while(head != null){
			System.out.print(head.data);
			System.out.print("->");
			head = head.next;
		}
		System.out.print("null");
	}
	
	public static LinkedListNode reverseList(LinkedListNode head){
		  LinkedListNode previousNode=null;  
		  LinkedListNode nextNode; 
		  LinkedListNode rev = head;
		  while(rev !=null)  
		  {  
			  nextNode = rev.next;
			  rev.next = previousNode;
			  previousNode = rev;
			  
			  rev = nextNode;
		  } 
		  return previousNode;

	}
	
	
	public static void reverseListNon(LinkedListNode head){
		LinkedListNode prev = null;
		LinkedListNode next;
		while(head != null){
			next = head.next;
			head.next = prev;
			prev = head;
			head = next;
		}
		
		head = prev;
		
		
	}
	
	public static LinkedListNode reverseListRecur(LinkedListNode head){
		if(head == null || head.next == null){
			return head;
		}
		
		LinkedListNode rev = reverseListRecur(head.next);
		head.next.next = head;
		head.next = null;
		return rev;
	}
	
	public static boolean isPalindrome(LinkedListNode head){
		LinkedListNode fast = head;
		LinkedListNode slow = head;
		
		Stack<Integer> stack  = new Stack<Integer>();
		
		while(fast != null && fast.next != null){
			stack.push(slow.data);
			slow = slow.next;
			fast = fast.next.next;
		}
		
		if(fast != null){
			slow = slow.next;
		}
		
		while(slow != null){
			int top = stack.pop().intValue();
			
			if(top != slow.data){
				return false;
			}
			slow = slow.next;
		}
		return true;
	}

}
