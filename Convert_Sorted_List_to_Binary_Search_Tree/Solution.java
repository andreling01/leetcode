
public class Solution {
	public TreeNode sortedListToBST(ListNode head) {
		if(head == null)
			return null;
		ListNode curr = head;
		int n = countListLength(curr);
		curr = head;
		ListNode[] currhold = {curr};
		return buildTree(currhold,0,n);
	}
	
	private int countListLength(ListNode curr){
		int n = 0;
		while(curr.next != null){
			n++;
			curr = curr.next;
		}
		return n;
	}
	
	private TreeNode buildTree(ListNode[] curr,int head,int tail){
		if(head > tail)
			return null;
		int mid = (head + tail) / 2;
		TreeNode left = buildTree(curr, head, mid - 1);
		TreeNode root = new TreeNode(curr[0].val);
		curr[0] = curr[0].next;
		root.left = left;
		root.right = buildTree(curr,mid + 1, tail);
		return  root;
	}
}
