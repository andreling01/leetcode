import java.util.*;
public class Solution {
	public ListNode deleteDuplicates(ListNode head) {
		ListNode iter = head;
		ListNode prev = null;
		if(head == null)
			return head;
		HashSet<Integer> set = new HashSet<Integer>();
		while(iter != null){
			if(set.contains(iter.val)){
				prev.next = iter.next;
				iter = iter.next;
			}
			else{
				set.add(iter.val);
				prev = iter;
				iter = iter.next;
			}
		}
		return head;
	}
}
