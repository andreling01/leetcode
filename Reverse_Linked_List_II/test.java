
public class test {
	public static ListNode reverseBetween(ListNode head, int m, int n){
		ListNode lalal = new ListNode(-1);
		lalal.next=head;
		ListNode begin = lalal;

		for(int i = 1; i < m; i ++){
			begin = begin.next;
		}
		ListNode itr = begin.next;
		ListNode currhead = itr;
		ListNode end = currhead;
		for(int i = m; i < n; i ++){
			ListNode temp = currhead;
			currhead = itr.next;
			currhead.next = temp;
			itr=itr.next;
		}

		begin.next = currhead;


		if(n>m){
			end.next=itr.next;
		}

		return lalal.next;
	}

	public static void main(String[] args){
		ListNode head = new ListNode(3);
		head.next = new ListNode(5);
		reverseBetween(head,1,2);
	}
}
