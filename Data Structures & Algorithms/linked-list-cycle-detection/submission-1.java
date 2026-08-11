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
    public boolean hasCycle(ListNode head) {
        ListNode p1 = head;
        ListNode p2 = head;
        if(head.next == null){
            return false;
        }
        while(p1 != null && p2!= null){
            //for p1, two skips
            if(p2.next == null || p2.next.next == null){
                break;
            }
            ListNode tempP1 = p1.next;
            p1 = tempP1.next;
            //for p2, one skip
            if(p2.next == null){
                break;
            }
            ListNode tempP2 = p2.next;
            p2 = tempP2;

            if(p1 == p2){
                return true;
            }
        }
        return false;
    }
}
