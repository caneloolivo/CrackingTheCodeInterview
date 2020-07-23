package LinkedList;

public class SumListRecursive {
	class PartialSum{
		LinkedListNode sum = null;
		public int carry = 0;
	}
	LinkedListNode addLists(LinkedListNode l1, LinkedListNode l2) {
		int len1 = length(l1);
		int len2 = length(l2);
		if(len1< len2) {
			l1 = padList(l1, len2- len1);			
		}
		else {
			l2 = padList(l2, len1 - len2);			
		}
		
		PartialSum sum = addListHelper(l1, l2);
		if(sum.carry == 0) {
			return sum.sum;
		}
		else {
			LinkedListNode result = insertBefore(sum.sum, sum.carry);
			return result;
		}
	}
	
	PartialSum addListHelper(LinkedListNode l1, LinkedListNode l2) {
		if(l1 == null && l2 == null) {
			PartialSum sum = new PartialSum();
			return sum;
		}
		PartialSum sum = addListHelper(l1.next, l2.next);
		int val = sum.carry = l1.val + l2.val;
		LinkedListNode fullResult = insertBefore(sum.sum, val %10);
		sum.sum = fullResult;
		sum.carry = val /10;
		return sum;		
	}
	
	LinkedListNode insertBefore(LinkedListNode list, int data) {
		LinkedListNode node = new LinkedListNode(data);
		if(list != null) {
			node.next = list;
		}
		return node;
	}
	
	public int length(LinkedListNode node) {
		return 15;
	}
	LinkedListNode padList(LinkedListNode l1, int dif) {
		return l1;
	}
}
