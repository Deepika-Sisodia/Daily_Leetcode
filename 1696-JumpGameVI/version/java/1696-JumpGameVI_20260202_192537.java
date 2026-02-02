// Last updated: 2/2/2026, 7:25:37 PM
1class Solution {
2    public int maxResult(int[] nums, int k) {
3        int n = nums.length;
4        int[] dp = new int[n];
5        Deque<Integer> dq = new ArrayDeque<>();
6
7        dp[0] = nums[0];
8        dq.addLast(0);
9
10        for(int i=1; i<n; i++){
11            // removing out of window indexes
12            while(!dq.isEmpty() && dq.peekFirst() < i-k){
13                dq.pollFirst();
14            }
15            // best previous values
16            dp[i] = nums[i] + dp[dq.peekFirst()];
17            // maintaining decreasing order
18            while(!dq.isEmpty() && dp[dq.peekLast()]<=dp[i]){
19                dq.pollLast();
20            }
21
22            dq.addLast(i);
23        }
24
25        return dp[n-1];
26    }
27}