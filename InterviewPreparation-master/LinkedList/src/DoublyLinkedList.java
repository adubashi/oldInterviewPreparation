

import java.util.*;
public class DoublyLinkedList {
 
    private DLLNode head;
    private DLLNode tail;
    private int size;
     
    public DoublyLinkedList() {
        size = 0;
    }
    /**
     * this class keeps track of each element information
     * @author java2novice
     *
     */
    /*
    private class Node {
        int element;
        Node next;
        Node prev;
 
        public Node(int element, Node next, Node prev) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }
    */
    /**
     * returns the size of the linked list
     * @return
     */
    public int size() { return size; }
     
    /**
     * return whether the list is empty or not
     * @return
     */
    public boolean isEmpty() { return size == 0; }
     
    /**
     * adds element at the starting of the linked list
     * @param element
     */
    public void addFirst(int element) {
        DLLNode tmp = new DLLNode(element, head, null);
        if(head != null ) {head.setPrevious(tmp);}
        head = tmp;
        if(tail == null) { tail = tmp;}
        size++;
        System.out.println("adding: "+element);
    }
     
    /**
     * adds element at the end of the linked list
     * @param element
     */
    public void addLast(int element) {
         
        DLLNode tmp = new DLLNode(element, null, tail);
        if(tail != null) {tail.setNext(tmp);}
        tail = tmp;
        if(head == null) { head = tmp;}
        size++;
        System.out.println("adding: "+element);
    }
     
    /**
     * this method walks forward through the linked list
     */
    public void iterateForward(){
         
        System.out.println("iterating forward..");
        DLLNode tmp = head;
        while(tmp != null){
            System.out.println(tmp.getData());
            tmp = tmp.getNext();
        }
    }
     
    /**
     * this method walks backward through the linked list
     */
    public void iterateBackward(){
         
        System.out.println("iterating backword..");
        DLLNode tmp = tail;
        while(tmp != null){
            System.out.println(tmp.getData());
            tmp = tmp.getPrevious();
        }
    }
     
    /**
     * this method removes element from the start of the linked list
     * @return
     */
    public int removeFirst() {
        if (size == 0) throw new NoSuchElementException();
        DLLNode tmp = head;
        head = head.getNext();
        head.setPrevious(null);
        size--;
        System.out.println("deleted: "+tmp.getData());
        return tmp.getData();
    }
     
    /**
     * this method removes element from the end of the linked list
     * @return
     */
    public int removeLast() {
        if (size == 0) throw new NoSuchElementException();
        DLLNode tmp = tail;
        tail = tail.getPrevious();
        tail.setNext(null);
        size--;
        System.out.println("deleted: "+tmp.getData());
        return tmp.getData();
    }
    
    public void deleteNode(int position){
    	if(position < 1){
    		System.out.println("Invalid position!");
    		return;
    	} 
    	if(position == 1){
    		DLLNode currentNode = head.getNext();
    		head= null;
    		currentNode.setPrevious(null);
    		size--;
    		return;
    	} else{
    		DLLNode previousNode = head;
    		int count = 1;
    		while(count < position - 1){
    			previousNode = previousNode.getNext();
    			count++;
    		}
    		
    		DLLNode currentNode = previousNode.getNext();
    		DLLNode laterNode = currentNode.getNext();
    		
    		if(laterNode != null){
    			laterNode.setPrevious(previousNode);
    		}
    		
    		
    	}
    }
}