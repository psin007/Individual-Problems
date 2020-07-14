/*
 * 
 */
package crackingthecodinginterview.LinkedList;

/**
 *Simple class to show linked list implementation by creation , insertion and print
 * @author Pooja
 */

//public class LinkedListNode{
//
//     Node head;
//    
//    static class Node{
//        int data;
//        Node next;
//        
//        Node(int d){
//            data = d;
//            next = null;
//        }   
//    }
//
//    
//    public static LinkedListNode insert(LinkedListNode list,int data){
//        Node newNode = new Node(data);
//        newNode.next = null;
//        
//        if(list.head == null){
//            list.head = newNode;
//        }
//        else{
//            Node last = list.head;
//            while(last.next!=null){
//                last = last.next;
//            }
//            last.next = newNode;
//        }
//        return list;
//    }
//    
//    public static void printList(LinkedListNode list){
//        Node currNode = list.head;
//        System.out.print("Linked list: ");
//        while(currNode != null){
//            System.out.print(currNode.data + " ");
//            currNode = currNode.next;
//        }
//        System.out.println();
//    }
//    
//    public static void main(String args[]){
//        LinkedListNode list = new LinkedListNode();
//        list = insert(list,5);
//        list = insert(list,1);
//        list = insert(list,3);
//        list = insert(list,1);
//        list = insert(list,5);
//        list = insert(list,1);
//        
//        printList(list);
//    }
//    
//    
//}


public class LinkedListNode{
    public LinkedListNode next;
    public LinkedListNode prev;
    public LinkedListNode last;
    public int data;
    
    public LinkedListNode(int d, LinkedListNode n, LinkedListNode p){
        data = d;
        setNext(n);
        setPrevious(p);
    }

    public LinkedListNode(int d) {
        data = d;
    }

    public LinkedListNode() {
    }
    
    public void setNext(LinkedListNode n){
        next = n;
        if(this == last){
            last = n;
        }
        if(n!= null && n.prev != this){
            n.setPrevious(this);
        }
    }
    
    public void setPrevious(LinkedListNode p){
        prev = p;
        if(p != null && p.next!= this){
            p.setNext(this);
        }
    }
    
    public String printForward(){
        if(next!=null){
            return data + "->" + next.printForward();
        }
        else{
            return ((Integer)data).toString();
        }
    }
    
    public LinkedListNode clone(){
        LinkedListNode next2 = null;
        if(next != null){
            next2 = next.clone();
        }
        LinkedListNode head2 = new LinkedListNode(data,next2,null);
        return head2;
                
    }
}