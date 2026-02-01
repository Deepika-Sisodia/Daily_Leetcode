// Last updated: 2/1/2026, 4:53:21 PM
1class Solution {
2    public boolean canJump(int[] nums) {
3        Boolean[] dp = new Boolean[nums.length];
4        return func(nums,0,dp);
5    }
6
7    public boolean func(int[] nums, int idx, Boolean[] dp){
8        if(idx>=nums.length-1){
9            return true;
10        }
11
12        if(nums[idx]==0) return false;
13
14        if(dp[idx]!=null) return dp[idx];
15
16        for(int i=1; i<=nums[idx]; i++){
17            if(func(nums,idx+i,dp)){
18                return dp[idx] = true;
19            }
20        }
21
22        return dp[idx] = false;
23    }
24}