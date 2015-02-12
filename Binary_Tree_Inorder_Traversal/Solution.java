import java.util.*;
public class Solution {
	public ArrayList<Integer> inorderTraversal(TreeNode root) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		Stack<TreeNode> st = new Stack<TreeNode>();
		if(root == null){
			return result;
		}
		TreeNode curr = root;
		while(curr != null){
			st.push(curr);
			curr = curr.left;
		}
		
		while(st.size() > 0){
			curr = st.pop();
			result.add(curr.val);
			if(curr.right == null)
				continue;
			else{
				curr = curr.right;
				while(curr != null){
					st.push(curr);
					curr = curr.left;
				}
			}
		}
		
		return result;
		
	}
}
