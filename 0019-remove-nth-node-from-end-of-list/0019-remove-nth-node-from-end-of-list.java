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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int L = 0;
        ListNode temp = head;
        while(temp != null){
            L += 1;
            temp = temp.next;
        }
        if(L == n){
            ListNode newHead = head.next;
            return newHead;
        }    
        int res = L - n;
        temp = head;
        while(temp.next != null){
            res --;
            if(res == 0){
                break;
            }
            temp = temp.next;   
        }
        temp.next = temp.next.next;
        return head;
    }
}

// Find the length of the LinkedList (L)
// We can't traverse it backwards so we can say that we have to delete the (L-N+1)th node of the Linked List where, L -> Length of the LL, N -> The node to be deleted and we have find the L-N th node and cut the link for the L-N+1 th node