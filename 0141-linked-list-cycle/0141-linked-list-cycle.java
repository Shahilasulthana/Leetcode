/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

 // Floyd's Cycle detection / Two pointers

public class Solution {
    public boolean hasCycle(ListNode head) {
        // we can try this using 2 pointer approach
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
            return true;
            }
        }
        return false;
    }
}