import java.util.*;
public class Solution {
	public static ArrayList<ArrayList<Integer>> levelOrderBottom(TreeNode root) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		if(root == null)
			return result;
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		Stack<TreeNode> st = new Stack<TreeNode>();
		queue.add(root);
		queue.add(null);
		while(queue.size() > 1){
			TreeNode curr = queue.poll();
			if(curr != null){
				if(curr.left != null){
					queue.add(curr.left);
				}
				if(curr.right != null){
					queue.add(curr.right);
				}
			}
			else{
				queue.add(null);
			}
			st.push(curr);
		}
		ArrayList<Integer> level = new ArrayList<Integer>();
		while(st.size() > 0){
			TreeNode curr = st.pop();
			if(curr == null){
				if(level.size() > 0){
					result.add(level);
					level = new ArrayList<Integer>();
				}
			}
			else{
				level.add(0, curr.val);
			}
		}
		if(level.size() > 0)
			result.add(level);
		return result;
	}

	public static void main(String[] args){
		TreeNode root = new TreeNode(1);
		ArrayList<ArrayList<Integer>> result = levelOrderBottom(root);
	}
}
