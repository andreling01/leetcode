
public class Solution {
	public int maxDepth(TreeNode root) {
		return maxDepthHelp(root);
	}
	
	private int maxDepthHelp(TreeNode root){
		if(root == null)
			return 0;
		if(root.left == null && root.right == null){
			return 1;
		}
		return 1 + Math.max(maxDepthHelp(root.left), maxDepthHelp(root.right));
	}
}
