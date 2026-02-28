// Last updated: 2/28/2026, 2:34:10 PM
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
12    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
13        Stack<Integer> st1 = new Stack<>();
14        Stack<Integer> st2 = new Stack<>();
15        Stack<Integer> st3 = new Stack<>();
16
17        while(l1!=null){
18            st1.push(l1.val);
19            l1 = l1.next;
20        }
21
22        while(l2!=null){
23            st2.push(l2.val);
24            l2 = l2.next;
25        }
26        int carry = 0;
27        while(!st1.isEmpty() || !st2.isEmpty()){
28            int sum = carry;
29            if(!st1.isEmpty()) sum += st1.pop();
30            if(!st2.isEmpty()) sum += st2.pop();
31            carry = sum/10;
32            st3.push(sum%10);
33        }
34
35        if(carry!=0){
36            st3.push(carry);
37        }
38
39        ListNode dummy = new ListNode(0);
40        ListNode temp = dummy;
41        while(!st3.isEmpty()){
42            int value = st3.pop();
43            temp.next = new ListNode(value);
44            temp = temp.next;
45        }
46
47        return dummy.next;
48    }
49}