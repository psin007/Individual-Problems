package interviewpractice;

public class LinkedList {
	Node head;
	
	static class Node{
		int data ;
		Node next;
		
		public Node(int d) {
			data = d;
		}
	}
	
	public void printLL() {
		Node newHead = head;
		while(newHead != null) {
			System.out.println(newHead.data);
			newHead = newHead.next;
		}
		
	}
	
	//insert at front
	public void insertFirst(int d) {
		Node newNode  = new Node(d);
		newNode.next = head;
		head = newNode;
	}
	
	//insert at fixed position
	
	public void append(int new_data) {
		Node new_node = new Node(new_data); 
        if (head == null) { 
            head = new Node(new_data); 
            return; 
        } 
        new_node.next = null; 
        Node last = head;  
        while (last.next != null) 
            last = last.next; 
        last.next = new_node; 
        return;
	}
	
	public static void main(String args[]) {
		LinkedList ll = new LinkedList();
		
		ll.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		ll.head.next = second;
		second.next = third;
		
		//ll.printLL();
		
		//ll.insertFirst(5);
	//	ll.printLL();
		ll.append(5);
		ll.printLL();
	}
}
