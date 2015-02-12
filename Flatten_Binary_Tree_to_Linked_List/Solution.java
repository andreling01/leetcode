import java.util.*;
public class Solution {
	public void flatten(TreeNode root) {
		Stack<TreeNode> toVisit = new Stack<TreeNode>();
		if(root == null)
			return;
		toVisit.push(root);
		TreeNode curr = null;
		TreeNode prev = null;
		while(!toVisit.isEmpty()){
			curr = toVisit.pop();
			if(curr.right != null)
				toVisit.push(curr.right);
			if(curr.left != null)
				toVisit.push(curr.left);
			if(prev != null){
				prev.left = null;
				prev.right = curr;
			}
			prev = curr;
		}
	}
	

}
