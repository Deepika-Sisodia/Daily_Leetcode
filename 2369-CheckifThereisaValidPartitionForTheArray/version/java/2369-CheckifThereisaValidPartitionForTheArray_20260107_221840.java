// Last updated: 1/7/2026, 10:18:40 PM
1class Solution {
2    public boolean validPartition(int[] nums) {
3        int n = nums.length;
4        boolean[] dp = new boolean[n+1];
5        dp[0] = true;
6
7        for(int i=2; i<=n; i++){
8            if(dp[i-2] && nums[i-2] == nums[i-1]){
9                dp[i] = true;
10            }
11
12            if(!dp[i] && i>=3){
13                if(dp[i-3] && nums[i-3]==nums[i-2] && nums[i-2]==nums[i-1]){
14                    dp[i] = true;
15                }
16                if(!dp[i] && dp[i-3] && nums[i-3]+1 == nums[i-2] && nums[i-2]+1 == nums[i-1]){
17                    dp[i] = true;
18                }
19            }
20        }
21
22        return dp[n];
23    }
24}