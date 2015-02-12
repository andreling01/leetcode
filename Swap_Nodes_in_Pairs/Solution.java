
public class Solution {
	public ListNode swapPairs(ListNode head) {
		if(head == null)
			return null;
		ListNode curr = head;
		boolean firstNode = false;
		ListNode prev = null;
		while(curr != null){
			if(curr.next == null)
				break;
			if(!firstNode){
				head = curr.next;
				prev = curr;
				ListNode temp = curr.next.next;
				curr.next.next = curr;
				curr.next = temp;
				curr = curr.next;
				firstNode = true;
			}
			else{
				prev.next = curr.next;
				prev = curr;
				ListNode temp = curr.next.next;
				curr.next.next = curr;
				curr.next = temp;
				curr = curr.next;
			}
			
		}
		return head;
	}
}
