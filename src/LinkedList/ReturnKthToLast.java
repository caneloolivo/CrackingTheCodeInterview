package LinkedList;

public class ReturnKthToLast {
	public int printKthToLastElement(LinkedListNode head, int k) {
		if(head == null)
			return 0;
		int index = printKthToLastElement(head.next, k) + 1;
		if(index == k) {
			System.out.println("The "+ k +"th elemnt is "+ head.val);
		}
		return index;
	}
	
	public LinkedListNode KthToLastElement(LinkedListNode head, int k) {
		LinkedListNode node = head;
		int count = 0;
		while(node != null) {			
			if(count == k) {
				return node;
			}
			node = node.next;
			count++;
		}
		return null;
	}
	
	public LinkedListNode nthToLast(LinkedListNode head, int k) {
		LinkedListNode p1 = head;
		LinkedListNode p2 = head;
		for(int i = 0; i <k; i++) {
			if(p1 == null)
				return null;
			p1 = p1.next;
		}
		
		while(p1 != null) {
			p1 = p1.next;
			p2 = p2.next;
		}
		return p2;
	}
}
