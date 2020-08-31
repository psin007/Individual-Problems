package interviewpractice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IsValidBSTTest {
	IsValidBST obj;
	IsValidBST obj2;
	
	@BeforeEach
	void init() {
		obj = new IsValidBST();
		obj2 = new IsValidBST();
	}

	@Test
	void testIsValidBST() {
		obj.root = new TreeNode(10);
		obj.root.left = new TreeNode(-10);
		obj.root.right = new TreeNode(19);
		obj.root.left.left = new TreeNode(-20);
		obj.root.left.right = new TreeNode(0);
		obj.root.right.left = new TreeNode(17);
		assertEquals(true,obj.isValidBST(obj.root));

		obj2.root = new TreeNode(3);
		obj2.root.left = new TreeNode(2);
		obj2.root.right = new TreeNode(5);
		obj2.root.left.left = new TreeNode(1);
		obj2.root.left.right = new TreeNode(4);
		
		assertEquals(false,obj2.isValidBST(obj2.root));
		
		
	}

}
