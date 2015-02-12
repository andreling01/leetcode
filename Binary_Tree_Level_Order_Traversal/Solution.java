import java.util.*;
public class Solution {
	public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		
		if(root == null)
			return result;
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		
		queue.add(root);
		queue.add(null);
		int count = 1;
		while(count > 0){
			ArrayList<Integer> level = new ArrayList<Integer>();
			TreeNode curr = queue.poll();
			count--;
			while(curr != null){
				if(curr.left != null){
					queue.add(curr.left);
					count++;
				}
				if(curr.right != null){
					queue.add(curr.right);
					count++;
				}
				level.add(curr.val);
				curr = queue.poll();
			}
			queue.add(null);
			if(level.size() > 0)
				result.add(level);
		}
		return result;
	}
}
