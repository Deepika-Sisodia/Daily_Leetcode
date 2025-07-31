// Last updated: 7/31/2025, 2:11:12 PM
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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
        List<Integer> l = new ArrayList<>();
        HashMap<Integer,Integer> h = new HashMap<>();
        while(curr!=null){
            h.put(curr.val,h.getOrDefault(curr.val,0)+1);
            curr=curr.next;
        }

        for(int i:h.keySet()){
            if(h.get(i)==1){
                l.add(i);
            }
        }
        Collections.sort(l);

        ListNode v = new ListNode(0);
        ListNode b = v;
        for(int i: l){
            b.next = new ListNode(i);
            b = b.next;
        }
        
        return v.next;
    }
}