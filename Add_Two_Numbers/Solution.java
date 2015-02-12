
public class Solution {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode result = null;
		ListNode iter = null;
		boolean firstNode = false;
		int temp = 0;
		while(l1 != null && l2 != null){
			int number1 = l1.val;
			int number2 = l2.val;
			int sum = number1 + number2 + temp;
			if(sum >= 10){
				sum = sum % 10;
				temp = 1;
			}
			else{
				temp = 0;
			}
			if(!firstNode){
				iter = new ListNode(sum);
				result = iter;
				firstNode = true;
			}
			else{
				iter.next = new ListNode(sum);
				iter = iter.next;
			}
			l1 = l1.next;
			l2 = l2.next;
		}
		while(l1 != null){
			int sum = l1.val + temp;
			if(sum >= 10){
				sum = sum % 10;
				temp = 1;
			}
			else{
				temp = 0;
			}
			if(!firstNode){
				iter = new ListNode(sum);
				result = iter;
				firstNode = true;
			}
			else{
				iter.next = new ListNode(sum);
				iter = iter.next;
			}
			l1 = l1.next;
		}
		while(l2 != null){
			int sum = l2.val + temp;
			if(sum >= 10){
				sum = sum % 10;
				temp = 1;
			}
			else{
				temp = 0;
			}
			if(!firstNode){
				iter = new ListNode(sum);
				result = iter;
				firstNode = true;
			}
			else{
				iter.next = new ListNode(sum);
				iter = iter.next;
			}
			l2 = l2.next;
		}
		if(temp != 0){
			iter.next = new ListNode(temp);
			iter = iter.next;
		}
		return result;	
	}
}
