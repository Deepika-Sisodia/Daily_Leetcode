// Last updated: 7/31/2025, 2:11:33 PM
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
    public ListNode rotateRight(ListNode head, int k) {
        if(k<=0 || head == null || head.next == null){
            return head;
        }
        int l = 1;
        ListNode last = head;
        while(last.next!=null){
            last = last.next;
            l++;
        }

        last.next = head;
        k = k%l;
        int skip = l-k;

        ListNode newLast = head;
        
        for(int i=0; i<skip-1; i++){
            newLast = newLast.next;
        }
        head = newLast.next;
        newLast.next = null;

        return head;
    }
}