
public class Solution {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		if(head.next == null && n == 1)
			return null;
		ListNode firstpoint = head;
		for(int i = 0; i < n; i++){
			if(firstpoint.next == null)
				return head.next;
			firstpoint = firstpoint.next;
		}
		ListNode secondpoint = head;
		while(firstpoint.next != null){
			firstpoint = firstpoint.next;
			secondpoint = secondpoint.next;
		}
		secondpoint.next = secondpoint.next.next;
		return head;
	}
}
