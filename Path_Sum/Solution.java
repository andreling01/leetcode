
public class Solution {
	public boolean hasPathSum(TreeNode root, int sum) {
		return hasPathSumHelp(root,sum,0);
	}
	
	private boolean hasPathSumHelp(TreeNode root, int sum, int lastsum){
		if(root == null)
			return false;
		if(root.left == null &&  root.right == null){
			return((root.val + lastsum) == sum);
		}
		
		return hasPathSumHelp(root.left,sum,lastsum + root.val) 
				|| hasPathSumHelp(root.right,sum,lastsum + root.val); 
	}
}
