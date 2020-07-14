/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crackingthecodinginterview.LinkedList;


import java.util.HashSet;
import java.util.LinkedList;

/**
 *
 * @author Pooja
 */
public class RemoveDuplicates {
    
    //remove duplicates in linked list by creating
    //hash set
    //Time : O(n)
    //Space : o(n) where n is size of linkedlist
    public static void deleteDups(LinkedListNode n) {
       	HashSet<Integer> set = new HashSet<Integer>();
        LinkedListNode previous = null;
	while (n != null) {
            if (set.contains(n.data)) {
		previous.next = n.next;
		} else {
                    set.add(n.data);
                    previous = n;
		}
		n = n.next;
	}
    }
    //by having two pointers
    //o(1) space
    //O(N2) time
    public static void removeDups(LinkedListNode head) {
		LinkedListNode current = head;
		while (current != null) {
			/* Remove all future nodes that have the same value */
			LinkedListNode runner = current;
			while (runner.next != null) { 
				if (runner.next.data == current.data) {
					runner.next = runner.next.next;
				} else {
					runner = runner.next;
				}
			}
			current = current.next;
		}
	}
    
    public static void main(String args[]){
        
	LinkedListNode first = new LinkedListNode();
	LinkedListNode head = first; 
	LinkedListNode second = first;
	for (int i = 1; i < 8; i++) {
            second = new LinkedListNode(i % 2, null, null);
            first.setNext(second);
            second.setPrevious(first);
            first = second;
	}
	System.out.println(head.printForward());
	removeDups(head);
	System.out.println(head.printForward());
	
    }
}
