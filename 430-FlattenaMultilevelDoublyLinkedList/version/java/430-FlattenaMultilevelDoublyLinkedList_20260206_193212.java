// Last updated: 2/6/2026, 7:32:12 PM
1/*
2// Definition for a Node.
3class Node {
4    public int val;
5    public Node prev;
6    public Node next;
7    public Node child;
8};
9*/
10
11class Solution {
12    public Node flatten(Node head) {
13        if(head == null) return head;
14
15        Node temp = head;
16        Stack<Node> st  = new Stack<>();
17
18        while(temp!=null){
19            if(temp.child!=null){
20
21                if(temp.next!=null){
22                    st.push(temp.next);
23                }
24
25                temp.next = temp.child;
26                temp.child.prev = temp;
27                temp.child = null;
28            }
29
30            if(temp.next==null && !st.isEmpty()){
31                temp.next = st.pop();
32                temp.next.prev = temp;
33            }
34
35            temp = temp.next;
36        }
37
38        return head;
39    }
40}