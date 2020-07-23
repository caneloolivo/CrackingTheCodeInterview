package LinkedList;

public class ReturnKthToLastRecursive {
	class Index{
		int index = 0;			
	}
	
	public LinkedListNode kthToLastNode(LinkedListNode head, int k) {
		Index index = new Index();
		return kthToLast(head, k, index);
	}
	
	public LinkedListNode kthToLast(LinkedListNode head, int k ,Index index) {		
		if (head == null)
			return null;
		LinkedListNode node = kthToLast(head.next,k, index);
		index.index++;
		if(index.index == k) {
			return head;
		}
		return node;
	}
	
}
