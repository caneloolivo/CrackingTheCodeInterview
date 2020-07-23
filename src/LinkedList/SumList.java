package LinkedList;

public class SumList {
	LinkedListNode addList(LinkedListNode l1, LinkedListNode l2) {
		LinkedListNode result = new LinkedListNode(0);
		LinkedListNode curr = result;
		int carry = 0;
		while(l1 != null || l2 != null) {
			if(l1 != null) {
				carry+= l1.val;
				l1 = l1.next;
			}
			if(l2 != null) {
				carry += l2.val;
				l2 = l2.next;
			}				
			curr.next = new LinkedListNode(carry % 10);
			curr = curr.next;
			carry = carry/10;
		}
		if(carry >0) {
			curr.next = new LinkedListNode(carry);
		}
		return result.next;
	}
	
	LinkedListNode addListRecursive(LinkedListNode l1, LinkedListNode l2, int carry) {
		if(l1 == null && l2 == null && carry == 0)
			return null;
		LinkedListNode result = new LinkedListNode(0);
		int value = carry;
		if(l1 != null)
			value += l1.val;
		if(l2 != null)
			value += l2.val;
		result.next = new LinkedListNode(carry %10);
		result = result.next;
		if(l1 != null || l2 != null) {
			LinkedListNode more = addListRecursive(l1.next, l2.next, value > 10? 1: 0);
			result.next = more;
		}
		return result;
	}
	
}
