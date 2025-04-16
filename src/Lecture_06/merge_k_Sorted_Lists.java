package Lecture_06;

import java.util.*;

public class merge_k_Sorted_Lists {
	public static void main(String[] args) {

	}

	public ListNode mergeKLists(ListNode[] arr) {
		PriorityQueue<ListNode> pq=new PriorityQueue<>();
		for(ListNode n:arr) {
			while(n!=null) {
				pq.add(n);
				n=n.next;
			}
		}
		
		ListNode temp=new ListNode();
		ListNode ans=temp;
		while(!pq.isEmpty()) {
			
			ListNode a=pq.poll();
			temp=temp.next;
		}
		return null;
			
	}

class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}
