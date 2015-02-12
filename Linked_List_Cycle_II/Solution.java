
public class Solution {
	public ListNode detectCycle(ListNode head) {
		if(head == null || head.next == null)
			return null;
		ListNode faster = head;
		ListNode slower = head;
		while(faster != null){
			if(faster.next == null)
				return null;
			else{
				if(faster.next.next == null)
					return null;
				faster = faster.next.next;
				slower = slower.next;
				if(faster.equals(slower))
					break;
			}
		}
		if(faster == null || faster.next == null)
			return null;
		slower = head;
		while(!slower.equals(faster)){
			slower = slower.next;
			faster = faster.next;
		}
		return slower;
	}
}
