package LinkedList;

import java.util.LinkedList;

public class Partition {
	LinkedListNode partition(LinkedListNode node, int x) {
		LinkedListNode beforeStart = null;
		LinkedListNode beforeEnd = null;
		LinkedListNode afterStart = null;
		LinkedListNode afterEnd = null;
		while(node != null) {
			if(node.val < x) {
				if(beforeStart == null) {
					beforeStart = node;
					beforeEnd= beforeStart;
				}
				else {
					beforeEnd.next = node;
					beforeEnd = node;
				}
			}
			else {
				if(afterStart == null) {
					afterStart = node;
					afterEnd = afterStart;
				}
				else {
					afterEnd.next = node;
					afterEnd = node;
				}
				
			}
			node = node.next;
		}
		if(afterStart == null)
			return null;
		
		beforeEnd.next = afterStart;			
		return beforeStart;
	}
	
	LinkedListNode partition2(LinkedListNode node, int x) {
		LinkedListNode head = node;
		LinkedListNode tail = node;
		while(node != null) {
			LinkedListNode next = node.next;
			if(node.val < x) {
				node.next = head;
				head = node;
			}
			else {
				tail.next = node;
				tail = node;
			}
			node = next;
		}
		tail.next = null;
		return head;
	}
}
