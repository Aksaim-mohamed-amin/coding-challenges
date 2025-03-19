public class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
		next = null;
	}

	public void printList() {
		ListNode tmp = this;
		while (tmp != null) {
			System.out.println(tmp.val);
			tmp = tmp.next;
		}
	}

	public void appendNodes(int[] nums) {
		ListNode current = this;
		ListNode tail = this.next;
		for (int num : nums) {
			current.next = new ListNode(num);
			current = current.next;
		}
		current.next = tail;
	}

	public int size() {
		int size = 0;
		ListNode current = this;

		while(current != null) {
			size++;
			current = current.next;
		}

		return size;
	}

	public ListNode getNodeAt(int index) {
		int i = 0;
		ListNode current = this;

		while (i < index && current != null) {
			i++;
			current = current.next;
		}

		return i == index ? current : null;
	}
}