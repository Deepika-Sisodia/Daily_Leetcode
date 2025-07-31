// Last updated: 7/31/2025, 2:10:38 PM
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
    public void reorderList(ListNode head) {
        if(head==null && head.next==null){
            return;
        }
        ListNode mid = middle(head);
        ListNode hf = head;
        ListNode hs = reverse(mid);

        while(hf!= null && hs!=null){
            ListNode temp = hf.next;
            hf.next = hs;
            hf = temp;

            temp = hs.next;
            hs.next = hf;
            hs = temp;
            
        }
        if(hf!=null){
                hf.next = null;
        }
    }
    public ListNode middle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode pres = head;
        ListNode next = pres.next;
        while(pres!=null){
            pres.next = prev;
            prev = pres;
            pres = next;
            if(next!=null){
                next=next.next;
            }
        }
        return prev;
    }
}