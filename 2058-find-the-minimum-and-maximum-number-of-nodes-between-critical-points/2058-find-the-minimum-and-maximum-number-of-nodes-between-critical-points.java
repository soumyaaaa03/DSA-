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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode prev = head;
        ListNode curr = head.next;
        int ind = 2, minDistance = Integer.MAX_VALUE;
        int first = -1, last = -1;
        while (curr.next != null) {
            if ((prev.val > curr.val && curr.next.val > curr.val) ||
                (prev.val < curr.val && curr.next.val < curr.val)) {
                    if (first != -1) {
                        minDistance = Math.min(minDistance, ind - last);
                    } else {
                        first = ind;
                    }
                    last = ind;
                }
            prev = curr;
            curr = curr.next;
            ind++;
        }
        if (first == -1 || first == last){
            return new int[]{-1, -1};
        }
        int maxDistance = last - first;
        return new int[]{minDistance, maxDistance};
    }
}