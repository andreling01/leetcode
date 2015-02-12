import java.util.*;
public class Solution {
	public static ArrayList<Integer> postorderTraversal(TreeNode root) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		if(root == null)
			return result;
		Stack<TreeNode> st = new Stack<TreeNode>();
		TreeNode curr = root;
		while(curr != null){
			st.push(curr);
			curr = curr.left;
		}
		TreeNode lastNode = null;
		
		while(st.size() > 0){
			curr = st.peek();
			
			if(curr.right == null||curr.right.equals(lastNode)){
				result.add(curr.val);
				lastNode = st.pop();
				continue;
			}
			
			if(curr.right != null){
				curr = curr.right;
				while(curr != null){
					st.push(curr);
					curr = curr.left;
				}
			}
			
						
		}
		return result;
	}
	
	public static void main(String[] args){
		TreeNode root = new TreeNode(1);
		root.right = new TreeNode(2);
		ArrayList<Integer> result = postorderTraversal(root);
	}
}
