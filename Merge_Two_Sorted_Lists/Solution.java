
public class Solution {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode result = null;
		ListNode curr = null;
		boolean firstNode = false;
		while(l1 != null && l2 != null){
			int temp;
			if(l1.val > l2.val){
				temp = l2.val;
				l2 = l2.next;
			}
			else{
				temp = l1.val;
				l1 = l1.next;
			}
			if(!firstNode){
				result = new ListNode(temp);
				curr = result;
				firstNode = true;
			}
			else{
				curr.next = new ListNode(temp);
				curr = curr.next;
			}
		}
		
		while(l1 != null){
			int temp = l1.val;
			l1 = l1.next;
			if(!firstNode){
				result = new ListNode(temp);
				curr = result;
				firstNode = true;
			}
			else{
				curr.next = new ListNode(temp);
				curr = curr.next;
			}
		}
		
		while(l2 != null){
			int temp = l2.val;
			l2 = l2.next;
			if(!firstNode){
				result = new ListNode(temp);
				curr = result;
				firstNode = true;
			}
			else{
				curr.next = new ListNode(temp);
				curr = curr.next;
			}
		}
		return result;
	}
}
