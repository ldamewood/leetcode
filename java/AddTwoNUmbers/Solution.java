public class Solution {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		return addTwoNumbers(l1, l2, 0);
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2, int carrybit) {
		int sum;
		ListNode result;
		sum = l1.val + l2.val + carrybit;
		result = new ListNode(sum % 10);
		carrybit = sum / 10;
		if (carrybit > 0) {
			if (l1.next == null && l2.next == null)
				result.next = new ListNode(carrybit);
			else if (l1.next == null)
				result.next = addTwoNumbers(l2.next, new ListNode(carrybit));
			else if (l2.next == null)
				result.next = addTwoNumbers(l1.next, new ListNode(carrybit));
			else
				result.next = addTwoNumbers(l1.next, l2.next, carrybit);
		} else {
			if (l1.next == null)
				result.next = l2.next;
			else if (l2.next == null)
				result.next = l1.next;
			else
				result.next = addTwoNumbers(l1.next, l2.next, carrybit);
		}
		return result;
	}
}