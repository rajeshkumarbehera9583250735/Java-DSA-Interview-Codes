/*
 * 
Problem Name: Merge Two Sorted Linked Lists

Problem Statement:

You are given the heads of two sorted linked lists, list1 and list2.
Merge the two lists into a single sorted linked list, where nodes from list1 and list2 are merged by reusing existing nodes (no new node creation).

Return the head of the merged list.

Your merged list should be sorted in non-decreasing order.

*/

package linkedList;

class ListNode{
	int val;
	ListNode next;
	ListNode(){}
	ListNode(int val){this.val=val;}
	ListNode(int val, ListNode next){
		this.val=val;
		this.next=next;
	}
}

public class MergeSortedLists {

	public static void main(String[] args) {
		ListNode list1 = new ListNode(1,new ListNode(2,new ListNode(4)));
		ListNode list2 = new ListNode(1,new ListNode(3, new ListNode(4)));
		
		ListNode merged = mergeTwoLists(list1, list2);
		printList(merged);
	}
	
	public static void printList(ListNode head) {
		while(head != null) {
			System.out.print(head.val + (head.next != null ? "->" : ""));
			head = head.next;
		}
		System.out.println();
	}
	
	public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode dummy = new ListNode(-1);
		ListNode current = dummy;
		
		while(list1 != null && list2 != null) {
			if(list1.val <= list2.val) {
				current.next = list1;
				list1 = list1.next;
			}else {
				current.next = list2;
				list2 = list2.next;
			}
			current = current.next;
		}
		
		// Attach remaining part of the list1 or list2
		
		//current.next = (list1 != null) ? list1 : list2; 			// (Using Ternary Operator)
		
		if(list1 != null) {
			current.next = list1;
		}else {
			current.next = list2;
		}
		
		return dummy.next;
	}

}
