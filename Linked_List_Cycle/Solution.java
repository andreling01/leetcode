
public class Solution {
	public boolean hasCycle(ListNode head) {
		if(head == null)
			return false;
		ListNode iter1 = head;
		ListNode iter2 = head.next;
		while(iter1 != null && iter2 != null && iter2.next != null){
			if(iter1.equals(iter2))
				return true;
			else{
				iter1 = iter1.next;
				iter2 = iter2.next.next;
			}
		}
		return false;
	}
}
