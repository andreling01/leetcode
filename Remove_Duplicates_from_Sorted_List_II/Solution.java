
public class Solution {
	public ListNode deleteDuplicates(ListNode head) {
		if (head==null || head.next==null){
			return head;
		}

		ListNode preHead=new ListNode (-1);

		preHead.next=head;

		ListNode pre=preHead;
		ListNode current=head;
		ListNode run=current.next;

		while (current!=null && run!=null){

			// check duplicats for current node;
			while (run!=null && run.val==current.val){
				run=run.next;

			}

			if (run==null){
				// current next is run, so no duplicate need to be removed
				// and no more nodes need to be check
				if (current.next==null){
					return preHead;
				}
				else{
					// current node until to null are all repeated
					// should remove them all.
					pre.next=null;
					return preHead.next;
				}
			}

			else{ 

				if (current.next==run){
					// no duplicate
					pre=current;
					current=run;
					run=run.next;
				}
				else{
					// removed duplicate
					pre.next=run;
					current=run;
					run=current.next;
				}
			}
		}

		return preHead.next;
	}
}
