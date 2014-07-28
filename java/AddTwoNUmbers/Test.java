public class Test {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);
		Solution solution = new Solution();
		ListNode result = solution.addTwoNumbers(l1, l2);
		System.out.println(result);
		assert result.val == 7;
		assert result.next.val == 0;
		assert result.next.next.val == 8;
		assert result.next.next.next == null;

		l2.next = null;
		result = solution.addTwoNumbers(l1, l2);
		System.out.println(result);
		assert result.val == 7;
		assert result.next.val == 4;
		assert result.next.next.val == 3;
		assert result.next.next.next == null;

		l1.val = 1;
		l1.next = null;
		l2.val = 9;
		l2.next = new ListNode(9);
		result = solution.addTwoNumbers(l1, l2);
		System.out.println(result);
		assert result.val == 0;
		assert result.next.val == 0;
		assert result.next.next.val == 1;
		assert result.next.next.next == null;

		l1.val = 5;
		l1.next = null;
		l2.val = 5;
		l2.next = null;
		result = solution.addTwoNumbers(l1, l2);
		System.out.println(result);
		assert result.val == 0;
		assert result.next.val == 1;
		assert result.next.next == null;
	}
}
