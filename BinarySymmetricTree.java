package interviewpractice;

class Node{
	
	Node left;
	Node right;
	int val;
	
	Node(){
	}
	Node(int key){
		val = key;
		right = left = null;
	}
}

public class BinarySymmetricTree {
	
	Node root;
	
	public boolean isMirror() {
		
		return isSymmetric(root,root);
	}
	
	public boolean isSymmetric(Node left, Node right) {
		if(left == null && right == null)
			return true;
		
		if(left != null && right != null ) {
			return left.val == right.val && isSymmetric(left.left,right.right) && isSymmetric(left.right,right.left);	
		}
		
		return false;
	}
}

