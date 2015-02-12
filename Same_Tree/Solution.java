
public class Solution {
	public boolean isSameTree(TreeNode p, TreeNode q) {
		return isSameTreeHelp(p,q);
	}
	
	private boolean isSameTreeHelp(TreeNode p, TreeNode q){
		if(p == null && q == null){
			return true;
		}
		
		if(p == null || q == null){
			return false;
		}
		
		return (p.val == q.val) && (isSameTreeHelp(p.left,q.left)) && (isSameTreeHelp(p.right,q.right));
		
	}
}
