
public class Solution {
	public boolean isValidBST(TreeNode root) {
		return Help(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
	}
	
	private boolean Help(TreeNode node, int min, int max){
		if(node == null)
			return true;
		else if (node.val < max && node.val > min && Help(node.left,min,node.val)
				&& Help(node.right,node.val,max)){
			return true;
		}
		else
			return false;
	}
}
