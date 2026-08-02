/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    private ListNode curr;

    public boolean isPalindrome(ListNode head) {
        curr = head;
        return rec(head);
    }

    private boolean rec(ListNode node) {
        if (node != null) {
            if (!rec(node.next))
                return false;
            if (curr.val != node.val)
                return false;
            
            curr = curr.next;
        }
        return true;
    }
}