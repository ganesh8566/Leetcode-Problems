package com.leetcode_problems.easy;
//import java.util.*;

public class AddTwoNumbers {
	public static class ListNode {
		int val;
		ListNode next;
		ListNode(int val) {
			this.val = val;
		}
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode result = new ListNode(-1);
		ListNode l3 = result;
		int carry = 0;
		
		while(l1 != null || l2 != null) {
			if(l1 != null) {
				carry = carry + l1.val;
				l1=l1.next;
			}
			if(l2 != null) {
				carry = carry + l2.val;
				l2=l2.next;
			}
			l3.next = new ListNode(carry % 10);
			l3=l3.next;
			carry = carry / 10;	
		}
		if(carry == 1) {
			l3.next = new ListNode(carry);
		}
		return result.next;
	}

	public static void main(String[] args) {
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);

		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);

		AddTwoNumbers atn = new AddTwoNumbers();
		ListNode result = atn.addTwoNumbers(l1, l2);
		
		while(result != null) {
			System.out.print(result.val);
			if(result.next != null) {
				System.out.print(" -> ");
			}
			result = result.next;
		}
	}

}
