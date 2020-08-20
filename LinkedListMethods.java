package interviewpractice;

import interviewpractice.LinkedListMethods.Node;

public class LinkedListMethods {

	Node head;
	
	public class Node{
		int data;
		Node next;
		
		Node(){
			
		}
		Node(int d, Node n){
			data = d;
			next = n;
		}
		Node(int d){
			data = d;
		}
	}
	
	public void insertBegin(int num) {
		
		Node newNode = new Node(num);
		if(head == null) {
			head = newNode;
		}
		else {
			newNode.next = head;
			head = newNode;	
		}
	}
	
	public int listSize() {
		Node curr = head;
		int count = 0;
		while(curr != null) {
			count++;
			curr = curr.next;
		}
		return count;
	}
	
	public void  listSizeRecursive() {
		int ans =  recurseSize(head);
		System.out.println(ans);
	}
	
	public int recurseSize(Node head) {
		Node curr = head;
		if(curr == null)
			return 0;
		else {
			return 1 + recurseSize(curr.next);
		}
	}
	
	public void printList() {
		Node curr = head;
		System.out.println("");
		while(curr!= null) {
			System.out.print(curr.data + "->");
			curr = curr.next;
		}
		System.out.println();
	}	
	
	public void deleteBegin() {
		if(head!=null) {
			Node curr = head.next;	
			head = curr;
		}
	}
	
	public void insertAtEnd(int d) {
		if(head != null) {
			Node curr = head;
			while(curr.next!=null) {
				curr = curr.next;
			}
			Node newNode = new Node(d);
			curr.next = newNode;
		}
	}
	
	public void deleteAtEnd() {
		if(head != null) {
			Node curr = head;
			while(curr.next.next!=null) {
				curr = curr.next;
			}
			curr.next = null;
			
		}
		
	}
	
}
