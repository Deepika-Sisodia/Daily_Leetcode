// Last updated: 7/31/2025, 2:10:36 PM
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
public class Solution {
    public ListNode detectCycle(ListNode head) {
        int length = 0;
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow==fast){
                length = lengthCycle(slow);
                break;
            }
        }
        if(length==0){
            return null;
        }

        ListNode f = head;
        ListNode s = head;
        while(length>0){
            s= s.next;
            length--;
        }

        while(f!=s){
            s=s.next;
            f=f.next;
        }
        return s;
    }

    public static int lengthCycle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow==fast){
                ListNode temp = slow;
                int length = 0;
                do{
                    temp = temp.next;
                    length++;
                }
                while(temp!=slow);
                return length;
            }
        }
        return 0;
    }
}