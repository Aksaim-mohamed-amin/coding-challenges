public class Main {
	public static void main(String[] args) {
		// Create a node Lisr
		ListNode head = new ListNode(3);
		head.appendNodes(new int[]{2, 0, -4});

		// Create a loop by linking a node to another node
		head.getNodeAt(3).next = head.getNodeAt(1);

		// Check if the node has a loop otherwise print it
		if (hasCycle(head)) {
			System.out.println("The list has a loop!");
		} else {
			head.printList();
		}
	}

	public static boolean hasCycle(ListNode head) {
		if (head == null || head.next == null) return false;

		ListNode slow = head, fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast) return true;
		}

		return false;
	}
}