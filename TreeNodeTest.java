package interviewpractice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TreeNodeTest {
	
	@Test
	void test() {
		
		SymmetricTree tree = new SymmetricTree(); 
	    tree.root = new TreeNode(1); 
	    tree.root.left = new TreeNode(2); 
	    tree.root.right = new TreeNode(2); 
	    tree.root.left.left = new TreeNode(3); 
	    tree.root.left.right = new TreeNode(4); 
	    tree.root.right.left = new TreeNode(4); 
	    tree.root.right.right = new TreeNode(3); 
	    assertEquals(true,tree.isSymmetric(tree.root));
	    
	}

}
