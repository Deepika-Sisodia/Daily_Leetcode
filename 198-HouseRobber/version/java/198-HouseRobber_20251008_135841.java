// Last updated: 10/8/2025, 1:58:41 PM
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
        if (head == null || head.next == null) return true;

        // Step 1: Find the middle
        ListNode mid = middle(head);

        // Step 2: Reverse second half
        ListNode headSecond = reverse(mid);
        ListNode rereverseHead = headSecond; // to restore later

        // Step 3: Compare both halves
        ListNode first = head;
        boolean isPalin = true;
        while (headSecond != null) {
            if (first.val != headSecond.val) {
                isPalin = false;
                break;
            }
            first = first.next;
            headSecond = headSecond.next;
        }

        // Step 4: Restore the list (optional)
        reverse(rereverseHead);

        return isPalin;
    }

    public ListNode middle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode pres = head;
        while (pres != null) {
            ListNode next = pres.next;
            pres.next = prev;
            prev = pres;
            pres = next;
        }
        return prev;
    }
}