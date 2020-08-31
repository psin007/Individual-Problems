package interviewpractice;

public class IsValidBST {
	TreeNode root;

	public boolean isValidBST(TreeNode root) {
		return helperBST(root,null,null);
	}
	
	public boolean helperBST(TreeNode root, TreeNode l, TreeNode r) {
	
		if(root == null) return true;
		if(l != null && l.val >= root.val) return false;
		
		if(r != null && r.val <= root.val) return false; 
		
		return helperBST(root.left,l,root) && helperBST(root.right,root,r);
	}
}
