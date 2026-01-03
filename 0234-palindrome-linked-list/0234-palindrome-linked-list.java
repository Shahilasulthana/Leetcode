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
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;

        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next != null ){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode newHead = reverseLL(slow.next);
        ListNode first = head;
        ListNode second = newHead;

        while(second != null){
            if(first.val != second.val){
                reverseLL(newHead);
                return false;
            }
            first = first.next;
            second = second.next;
        }
        reverseLL(newHead);
        return true;
    }
    public ListNode reverseLL(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode newHead = reverseLL(head.next);
        ListNode front = head.next;
        front.next = head;
        head.next = null;

        return newHead;

    }
}

// Find the middle of the linked list
// Use slow & fast pointers
// Reverse the second half of the list
// Compare first half and reversed second half
// Restore the list (reverse again)
// Return result