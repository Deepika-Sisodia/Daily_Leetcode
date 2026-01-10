// Last updated: 1/10/2026, 4:20:03 PM
1class Solution {
2    public int rob(int[] nums) {
3        int n = nums.length;
4        if(n==0) return 0;
5        
6        if(n==1) return nums[0];
7        
8        int[] dp = new int[n];
9        dp[0] = nums[0];
10        dp[1] = Math.max(nums[0],nums[1]);
11
12        for(int i=2; i<n; i++){
13            int rob = nums[i] + dp[i-2];
14            int not_rob = dp[i-1];
15            dp[i] = Math.max(rob,not_rob);
16        }
17
18        return dp[n-1];
19    }
20}