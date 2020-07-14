/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crackingthecodinginterview.LinkedList;

/**
 *
 * @author Pooja
 */
public class LinkedListMethods {
        
        public static int randomInt(int n) {
		return (int) (Math.random() * n);
	}
    
        public static int randomIntInRange(int min, int max) {
		return randomInt(max + 1 - min) + min;
	}
        
    	public static LinkedListNode randomLinkedList(int N, int min, int max) {
		LinkedListNode root = new LinkedListNode(randomIntInRange(min, max),
				null, null);
		LinkedListNode prev = root;
		for (int i = 1; i < N; i++) {
			int data = randomIntInRange(min, max);
			LinkedListNode next = new LinkedListNode(data, null, null);
			prev.setNext(next);
			prev = next;
		}
		return root;
	}

	public static LinkedListNode linkedListWithValue(int N, int value) {
		LinkedListNode root = new LinkedListNode(value, null, null);
		LinkedListNode prev = root;
		for (int i = 1; i < N; i++) {
			LinkedListNode next = new LinkedListNode(value, null, null);
			prev.setNext(next);
			prev = next;
		}
		return root;
	}

	public static LinkedListNode createLinkedListFromArray(int[] vals) {
		LinkedListNode head = new LinkedListNode(vals[0], null, null);
		LinkedListNode current = head;
		for (int i = 1; i < vals.length; i++) {
			current = new LinkedListNode(vals[i], null, current);
		}
		return head;
	}
    
    
}
