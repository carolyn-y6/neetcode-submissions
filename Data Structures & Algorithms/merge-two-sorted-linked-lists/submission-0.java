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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newList = list1;
        ListNode l1 = list1;
        ListNode l2 = list2;
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        if(list1.val == list2.val){
            newList = list1;
        } else if(list1.val > list2.val){
            newList = list2;
        } else if(list1.val < list2.val){
            newList = list1;
        }

        ListNode newRoot = newList;

        while(l1 != null && l2 != null){
            if(l1.val == l2.val){
                ListNode temp = l1.next;
                newList.next = l1;
                newList = l1;
                l1 = temp;
            } else if(l1.val > l2.val){
                ListNode temp = l2.next;
                newList.next = l2;
                newList = l2;
                l2 = temp;
            } else if(l1.val < l2.val){
                ListNode temp = l1.next;
                newList.next = l1;
                newList = l1;
                l1 = temp;
            }
        }
        if(l1 != null){
            newList.next = l1;
        }
        if(l2 != null){
            newList.next = l2;
        }
        return newRoot;
    }
}