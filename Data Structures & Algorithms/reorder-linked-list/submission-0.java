class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;

        // find middle
        ListNode slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // split
        ListNode second = slow.next;
        slow.next = null;

        // reverse second half
        ListNode prev = null, cur = second;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        second = prev;

        // merge
        ListNode cur1 = head, cur2 = second;
        while (cur2 != null) {
            ListNode next1 = cur1.next;
            ListNode next2 = cur2.next;
            cur1.next = cur2;
            cur2.next = next1;
            cur1 = next1;
            cur2 = next2;
        }
    }
}