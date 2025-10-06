// Last updated: 10/6/2025, 7:48:07 PM
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        Arrays.fill(dp,-1);
        return Math.min(climbingCost(cost,0,dp),climbingCost(cost,1,dp));
    }

    public int climbingCost(int[] arr, int idx,int[] dp){
        if(idx>=arr.length){
            return 0;
        }
        
        if(dp[idx]!=-1){
            return dp[idx];
        }

        int s1 = arr[idx] + climbingCost(arr,idx+1,dp);
        int s2 = arr[idx] + climbingCost(arr,idx+2,dp);
        return dp[idx]=Math.min(s1,s2);
    }
}