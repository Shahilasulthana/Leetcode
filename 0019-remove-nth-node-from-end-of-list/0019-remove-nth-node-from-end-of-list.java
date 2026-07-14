class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Find the length of the LL first by traversing with the help of the temp pointer
        ListNode temp = head;
        int count = 0; // length of the LL
        while(temp != null){
            count ++;
            temp = temp.next;
        }
        if(count == n){ // N-th from end = count from start = head
            ListNode newHead = head.next;
            return newHead;
        }
        int res = count - n; // to again traverse which node should be deleted
        temp = head;
        while(temp != null){
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