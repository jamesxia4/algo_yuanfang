package leetcode237;

import leetcode237.ListNode;
public class Solution {
	 public void deleteNode(ListNode node) {
		 node.val=node.next.val;
		 node.next=node.next.next;
	}
}
