
public class CircularLinkedList {
	public class Node{
		int data;
		Node next;
	}
	
	
	public static void printCircularList(Node head){
		Node cur = head;
		while(cur != null){
			System.out.print(cur.data + "->");
			cur = cur.next;
			if(cur == head){
				break;
			}
		}
		System.out.println("(" + cur.data + ")headNode"); 
		
	}
	
	public static void insertAtEndInCLL(Node head, Node nodeToInsert){
		Node cur = head;
		while(cur.next != head){
			cur.next = cur.next.next;
		}
		nodeToInsert.next = nodeToInsert;
		if(head == null){
			head = nodeToInsert;
		}else{
			nodeToInsert.next = head;
			cur.next = nodeToInsert;
		}
	}
	
	//Delete last node of CLL
	public static void DeleteLastNodeFromCLL(Node head){
		Node temp = head;
		Node cur = head;
		if(head == null){
			System.out.println("Empty");
			return;
		} 
		while(cur.next != head){
			temp = cur;
			cur = cur.next;
		}
		
		cur = null;
		return;
		
	}
	
	//Reverse linked list
	public static Node reverse(Node head) {
		  // if head is null or only one node, it's reverse of itself.
		  if ( (head==null) || (head.next == null) ) {
			  return head;
		  }

		  // reverse the sub-list leaving the head node.
		  Node reverse = reverse(head.next);
		  // head.next still points to the last element of reversed sub-list.
		  // so move the head to end.
		  head.next.next = head;
		  // point last node to nil, (get rid of cycles)
		  head.next = null;
		  return reverse;
	}
	//Reverse linked list(iterative)
	public static Node reverseIter(Node head) {
		  // if head is null or only one node, it's reverse of itself.
		  Node temp = null, nextNode = null;
		  
		  while(head != null){
			  nextNode = head.next;
			  head.next = temp;
			  temp = head;
			  head = nextNode;
		  }
		  
		  return temp;
	}
	
	//Reverse a sorted linked list
	public static Node mergeList(Node a, Node b){
		
		Node result = null;
		if(a == null) return b;
		if(b == null) return a;
		
		if(a.data <= b.data){
			result = a;
			result.next = mergeList(a.next, b);
		} else {
			result = b;
			result.next = mergeList(b.next, a);
		}
		
		return result;
	}
	
	//Modular nodes
	public static Node modularNodes(Node head, int k){
		Node modularNode = head;
		int i = 0;
		if(k <= 0){
			return null;
		}
		for(; head != null; head = head.next){
			if(i % k == 0){
				modularNode =head;
			}
			i++;
		}
		return modularNode;
		
	}
}
