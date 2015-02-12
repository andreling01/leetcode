
public class Solution {
	public boolean isSymmetric(TreeNode root) {
		if(root == null)
			return true;
		if(root.left == null && root.right == null)
			return true;
		if(root.left == null || root.right == null)
			return false;
		return isSymmetricHelp(root.left,root.right);
	}
	
	private boolean isSymmetricHelp(TreeNode leftnode,TreeNode rightnode){
		if(leftnode == null && rightnode == null)
			return true;
		if(leftnode == null || rightnode == null)
			return false;
		
		return (leftnode.val == rightnode.val) && isSymmetricHelp(leftnode.right,rightnode.left)
				&& isSymmetricHelp(leftnode.left,rightnode.right);
		
	}
}
