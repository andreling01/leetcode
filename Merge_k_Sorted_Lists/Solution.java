import java.util.*;
public class Solution {
	public ListNode mergeKLists(ArrayList<ListNode> lists) {
		if(lists.size() == 0 || lists == null)
			return null;
		PriorityQueue<ListNode> q = new PriorityQueue<ListNode>(lists.size(),
				new Comparator<ListNode>() {
					public int compare(ListNode a, ListNode b) {
						if (a.val > b.val)
							return 1;
						else if(a.val == b.val)
							return 0;
						else 
							return -1;
					}
				});
		
		for (ListNode list : lists) {
			if (list != null)
				q.add(list);
		}
 
		ListNode head = new ListNode(0);
		ListNode prev = head;
 
		while (q.size() > 0) {
			ListNode temp = q.poll();
			prev.next = temp;
 
			//keep adding next element of each list
			if (temp.next != null)
				q.add(temp.next);
 
			prev = prev.next;
		}
 
		return head.next;
	}
}
