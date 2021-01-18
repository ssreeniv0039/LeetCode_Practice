package com.qae.practice;


public class DeleteLinkList {
	
	public static void deleteNode(ListNode head, int val) {
		  ListNode cur = head;
		  ListNode prev = null;
		  
		  if(head == null) {
			  return;
		  }
		  if(head.val == val) {
			  head = head.next;
			  return;
		  }
		  
		  while(cur != null) {
			  if(cur.val == val) {
				  prev.next = cur.next;
			  }
			  prev = cur;
			  cur = cur.next;			  
		  }
	}
	
	
	public static void deleteNode(ListNode node) {
		node.val = node.next.val;
		node.next = node.next.next;
	}
	

	public static void main(String[] args) {
		System.out.println();

	}

}
