
public class Solution {
	public int minDepth(TreeNode root) {
		if(root == null)
			return 0;
		return minDepthHelp(root);
	}

	private int minDepthHelp(TreeNode root){
		if(root.left == null && root.right == null)
			return 1;
		if(root.left == null)
			return 1 + minDepthHelp(root.right);
		if(root.right == null)
			return 1 + minDepthHelp(root.left);
		return 1 + Math.min(minDepthHelp(root.left), minDepthHelp(root.right));
	}
}
