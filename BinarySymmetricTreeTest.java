package interviewpractice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BinarySymmetricTreeTest {

	BinarySymmetricTree obj;
	@BeforeEach
	void init(){
		obj = new BinarySymmetricTree();
	}
	
	@Test
	void testisMirror() {
		
		obj.root = new Node(5);
		obj.root.left = new Node(2);
		obj.root.right = new Node (2);
		obj.root.left.left = new Node(1);
		obj.root.left.right = new Node(7);
		obj.root.right.left = new Node(7);
		obj.root.right.right = new Node(1);
		
		assertEquals(true,obj.isMirror());
		/*
		 * 				5
		 * 			2			2
		 * 		1		7	7		1
		 * 
		 */
		obj.root = new Node(5);
		obj.root.left = new Node(2);
		obj.root.right = new Node (2);
		obj.root.left.left = new Node(1);
		obj.root.left.right = null;
		obj.root.right.left = null;
		obj.root.right.right = new Node(1);
		
		assertEquals(true,obj.isMirror());
		
		/*
		 * 				5
		 * 			2				2
		 * 		1		null	null		1
		 * 
		 */
		obj.root = new Node(5);
		obj.root.left = new Node(2);
		obj.root.right = new Node (6);
		obj.root.left.left = new Node(1);
		obj.root.left.right = null;
		obj.root.right.left = null;
		obj.root.right.right = new Node(1);
		
		assertEquals(false,obj.isMirror());
		
		/*
		 * 				5
		 * 			2				6
		 * 		1		null	null		1
		 * 
		 */
		
	}

}
