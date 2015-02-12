
public class Solution {
	TreeNode first = null;
	TreeNode second = null;
	TreeNode pre = null;
	public void recoverTree(TreeNode root) {
		if(root == null)
			return;
		inOrder(root);
		int temp = first.val;
		first.val = second.val;
		second.val = temp;

	}

	private void inOrder(TreeNode root){
		if(root == null)
			return;
		inOrder(root.left);
		if(pre == null)
			pre = root;
		else{
			if(pre.val > root.val){
				if(first == null)
					first = pre;
				second = root;
			}
			pre = root;
		}
		inOrder(root.right);
	}


}
