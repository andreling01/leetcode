import java.util.*;
public class Solution {
	public ArrayList<Integer> preorderTraversal(TreeNode root) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		Stack<TreeNode> st = new Stack<TreeNode>();
		
		if(root == null)
			return result;
		st.push(root);
		int count = 1;
		TreeNode curr;
		while(count != 0){
			curr = st.pop();
			count--;
			result.add(curr.val);
			if(curr.right != null){
				st.push(curr.right);
				count++;
			}
			if(curr.left != null){
				st.push(curr.left);
				count++;
			}
		}
		return result;
	}
}
