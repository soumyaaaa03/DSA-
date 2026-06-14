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
    public int pairSum(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = rev(slow.next);
        slow = slow.next;
        ListNode temp = head;
        int max = Integer.MIN_VALUE;
        while (slow != null) {
            max = Math.max(max, (temp.val + slow.val));
            slow = slow.next;
            temp = temp.next;
        }
        return max;
    }
    ListNode rev(ListNode head) {
        ListNode temp = head;
        ListNode prev = null;
        while (temp != null) {
            ListNode next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        return prev;
    }
}