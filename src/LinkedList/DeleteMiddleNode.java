package LinkedList;

public class DeleteMiddleNode {
	public boolean deleteMiddleNode(LinkedListNode head) {
		if(head == null || head.next == null)
			return false;
		LinkedListNode next = head.next;
		head.val = next.val;
		head.next = next.next;
		return true;
	}
}
