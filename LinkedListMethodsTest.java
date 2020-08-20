package interviewpractice;



class LinkedListMethodsTest {

	 
	
	public static void main(String args[]) {
		//int curSize = 0;
		LinkedListMethods obj;
		obj = new LinkedListMethods();
		obj.insertBegin(2);
		obj.insertBegin(5);
		obj.insertBegin(6);
		obj.printList();
		obj.deleteBegin();
		obj.printList();
		obj.insertAtEnd(9);
		obj.printList();
		obj.deleteAtEnd();
		obj.printList();
		obj.insertAtEnd(8);
		obj.printList();
		obj.listSizeRecursive();
	}
}
