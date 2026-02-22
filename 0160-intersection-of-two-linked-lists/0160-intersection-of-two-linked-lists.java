/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if(headA == null || headB == null) return null;
        ListNode list1 = headA;
        ListNode list2 = headB;

        while(list1 != list2){
            list1 = (list1 == null) ? headB : list1.next;
            list2 = (list2 == null) ? headA : list2.next;
        }
        return list1;
    }
}