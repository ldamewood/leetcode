public class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
		next = null;
	}

	public String toString() {
		if (this.next != null)
			return "" + this.val + "" + this.next.toString();
		return "" + this.val;
	}
}