// Last updated: 10/6/2025, 7:12:44 PM
class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return climb(n,dp);
    }

    public int climb(int n, int[] dp){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }

        if(dp[n]!=-1){
            return dp[n];
        }

        int c1 = climb(n-1,dp);
        int c2 = climb(n-2,dp);
        return dp[n] = c1+c2;
    }
}