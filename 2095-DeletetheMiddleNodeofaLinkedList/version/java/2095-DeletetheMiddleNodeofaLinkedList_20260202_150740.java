// Last updated: 2/2/2026, 3:07:40 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode deleteMiddle(ListNode head) {
13        if(head==null || head.next==null){
14            return null;
15        }
16        ListNode fast = head;
17        ListNode slow = head;
18        ListNode prev = head;
19        while(fast!=null && fast.next!=null){
20            fast = fast.next.next;
21            prev = slow;
22            slow = slow.next;
23        }
24        prev.next = slow.next;
25        return head;
26        
27    }
28
29
30}