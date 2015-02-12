import java.util.*;
public class Solution {
	public static ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode root) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

		if(root == null)
			return result;
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		boolean leftToRight = true;
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
				if(leftToRight){
					level.add(curr.val);
				}
				else{
					level.add(0,curr.val);
				}
				curr = queue.poll();
			}
			if(curr == null){
				leftToRight = !leftToRight;
			}
			queue.add(null);
			if(level.size() > 0)
				result.add(level);
		}
		return result;
	}
	
	public static void main (String[] args){
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		zigzagLevelOrder(root);
	}
}
