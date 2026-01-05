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
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        int len = 0;
        ListNode temp = head;
        while(temp != null){
            len ++;
            temp = temp.next;
        }
        int[] arr = new int[len];
        temp = head;
        int i = 0;
        while(temp != null){
            arr[i++] = temp.val;
            temp = temp.next;
        }
        Arrays.sort(arr);
        temp = head;
        i = 0;
        while(temp != null){
            temp.val = arr[i++];
            temp = temp.next;
        }
        return head;
    }
}

// Use tortoise hare algorithm to find the middle of the LL, and compare it with the head of the LL if the head is smaller than the 