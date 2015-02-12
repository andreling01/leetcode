import java.util.*;
public class Solution {
	public void connect(TreeLinkNode root) {
		if(root == null)
			return;
		Queue<TreeLinkNode> queue = new LinkedList<TreeLinkNode>();
		queue.add(root);
		queue.add(null);
		TreeLinkNode curr;
		int count = 1;
		while(count != 0){
			curr = queue.poll();
			if(curr == null){
				queue.add(null);
			}
			else{
				count--;
				if(curr.left != null ) {
					queue.add(curr.left);
					count++;
				}
				if(curr.right != null){
					queue.add(curr.right);
					count++;
				}
				curr.next = queue.peek();
			}
		}
	}
}
