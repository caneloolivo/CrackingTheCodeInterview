package LinkedList;

import java.util.HashSet;
import java.util.Set;

public class RemoveDups {
	public void removeDuplicates(LinkedListNode nodes) {
		Set<Integer> set = new HashSet<Integer>();
		LinkedListNode prevNode = null;
		while(nodes != null) {
			if(set.contains(nodes.val)) {
				prevNode.next = nodes.next;
			}else {
				set.add(nodes.val);
				prevNode = nodes;
			}			
			nodes = nodes.next;
		}
	}
	
	void deleteDups(LinkedListNode head) {
		LinkedListNode current = head;
		while (current != null) {
			/* Remove all future nodes that have the same value */
			LinkedListNode runner = current;
			while (runner.next != null) {
				if (runner.next.val == current.val) {		
					runner.next = runner.next.next;
				} else {
					runner = runner.next;
				}
			}
		current =  current.next;
		}
	} 
}
