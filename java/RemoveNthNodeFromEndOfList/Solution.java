public class Solution {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode sentinal = new ListNode(0);
		sentinal.next = head;
		ListNode ahead = head;
		ListNode behind = head;
		ListNode previous = sentinal;
		while (n > 0 && ahead != null) {
			ahead = ahead.next;
			n--;
		}
		assert n == 0;
		while (ahead != null) {
			previous = behind;
			ahead = ahead.next;
			behind = behind.next;
		}
		
		previous.next = behind.next;

		return sentinal.next;
	}
}