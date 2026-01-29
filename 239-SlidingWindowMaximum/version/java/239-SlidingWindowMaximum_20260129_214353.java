// Last updated: 1/29/2026, 9:43:53 PM
1class Solution {
2    public int[] maxSlidingWindow(int[] nums, int k) {
3        int n = nums.length;
4        ArrayList<Integer> ll = new ArrayList<>();
5
6        Deque<Integer> dq = new ArrayDeque<>();
7        for(int i=0; i<n; i++){
8            while(!dq.isEmpty() && dq.peekFirst()<=i-k){
9                dq.pollFirst();
10            }
11            while(!dq.isEmpty() && nums[dq.peekLast()]<=nums[i]){
12                dq.pollLast();
13            }
14
15            dq.addLast(i);
16
17            if(i>=k-1){
18                ll.add(nums[dq.peekFirst()]);
19            }
20        }
21
22        int[] ans = new int[ll.size()];
23        for(int i=0; i<ans.length; i++){
24            ans[i] = ll.get(i);
25        }
26
27        return ans;
28    }
29}