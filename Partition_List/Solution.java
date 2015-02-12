
public class Solution {
	public ListNode partition(ListNode head, int x) {
		if(head == null)
			return null;
		ListNode curr = head;
		ListNode point = null;
		//check if head is larger or equal to x
		if(head.val < x){
			while(curr.next != null){
				if(curr.next.val >= x){
					point = curr;
					break;
				}
				curr = curr.next;
			}
		}

		while(curr != null && curr.next != null){
			if(curr.next.val < x){
				if(point == null){
					ListNode temp = curr.next;
					curr.next = curr.next.next;
					temp.next = head;
					head = temp;
					point = temp;
				}
				else{
					ListNode temp = curr.next;
					curr.next = curr.next.next;
					temp.next = point.next;
					point.next = temp;
					point = temp;
				}
			}
			else{
				curr = curr.next;
			}
		}
		return head;
	}
}
