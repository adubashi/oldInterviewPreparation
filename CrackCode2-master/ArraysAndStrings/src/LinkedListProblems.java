import java.util.*;
public class LinkedListProblems {
	
	private static class LinkedListNode {
		int data;
		LinkedListNode next;
		
		public LinkedListNode(){
			
		}
	}
	
	public static void print(LinkedListNode head){
		while(head != null){
			System.out.print(head.data);
			head = head.next;
		}
		System.out.print("null");
	}

	public static void main(String[] args) {
		LinkedListNode head = new LinkedListNode();
		LinkedListNode h2 = new LinkedListNode();
		LinkedListNode h3 = new LinkedListNode();
		LinkedListNode h4 = new LinkedListNode();
		LinkedListNode h5 = new LinkedListNode();
		
		head.data = 7;
		head.next = h2;
		
		
		h2.data = 2;
		h2.next = h3;
		
		
		h3.data = 3;
		
		h4.data =2;
		
		h5.data = 7;
		
		h3.next = h4;
		
		h4.next = h5;
		
		h5.next = null;
		
		isPalindrome(head);
		
		

	}
	//PRoblem 1: Remove duplicates 
	public static void removeDuplicates(LinkedListNode head){
		HashSet hs = new HashSet();
		LinkedListNode prev = null;
		while(head != null){		
			if(hs.contains(head.data)){
				prev.next = head.next;
			} else {
				hs.add(head.data);
				prev = head;
			}
			head = head.next;
		}
	}
	
	//Problem 2: Kth from last 
	public static LinkedListNode kthToLast(LinkedListNode head, int k){
		LinkedListNode h1 = head;
		LinkedListNode h2 = head;
		
		for(int i = 0; i < k -1; i++){
			if(h2 == null){
				return null;
			}
			h2 = h2.next;
		}
		
		if(h2 == null){
			return null;
		}
		
		while(h2.next == null){
			h2 = h2.next;
			h1 = h1.next;
		}
		
		return h1;	
	}
	
	//Problem 3: Delete the middle node from a linked list 
	
	public static boolean deleteMiddleNode(LinkedListNode mid){
		if(mid ==null || mid.next == null){
			return false;
		}
		mid.data = mid.next.data;
		mid.next = mid.next.next;
		return true;
		
	}
	
	//Problem 4: Partition the list around a value x
	public static void partition(LinkedListNode node, int x){
		LinkedListNode head = null;
		LinkedListNode tail = null;
		
		while(node != null){
			
			if(node.data < x) {
				node.next = head;
				head = node;	
			} else {
				tail.next = node; 
				tail = node;	
			}	
		}
		
		tail.next = null;
	}
	
	//Problem 5: Add the numbers stored in two linked lists
	
	public static LinkedListNode addNumbers(LinkedListNode h1, LinkedListNode h2, int carry){
		
		if(h1 == null && h2 == null && carry == 0){
			return null;
		}
		
		LinkedListNode result = new LinkedListNode();
		int value = carry;
		
		if(h1 != null){
			value += h1.data;
		}
		if(h2 != null){
			value += h2.data;
		}
		
		result.data = value % 10;
		
		if(h1 != null || h2 != null){
			if(h1 == null){
				h1 = null;
			}
			if(h2 == null){
				h2 = null;
			}
			
			if(value >= 10){
				value = 1;
			} else {
				value = 0;
			}
			LinkedListNode next = addNumbers(h1, h2, value );
			
			result.next = next;
		}
		
		return result;
		
	
	}
	
	
	public static boolean isPalindrome(LinkedListNode head){
		
		print(head);
		
		
		Stack<Integer> s = new Stack<Integer>();
		
		LinkedListNode fast = head;
		LinkedListNode slow = head;
		
		while(fast != null && fast.next != null){
			s.push(slow.data);
			fast = fast.next.next;
			slow = slow.next;
		}
		
		if(fast != null){
			slow = slow.next;
		}
		
		System.out.println(slow.data);
		System.out.println(s.peek());
		
		while(slow != null){
			int top = s.pop().intValue();
			if(top != slow.data){
				System.out.println("Is not a Palindrome");
				return false;
			}
			slow = slow.next;
		}
		
		
		
		
		
		System.out.println("Is Palindrome");
		return true;
	}

}
